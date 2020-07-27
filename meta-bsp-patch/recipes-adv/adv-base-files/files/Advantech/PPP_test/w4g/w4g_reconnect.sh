#!/usr/bin/expect -f

## Unit: second
set timeout 30
set DEVICENODE [lindex $argv 0];

## Open wireless module COM port
spawn microcom -s 115200 ${DEVICENODE}
expect *


## Check the communication with 4G module via COM port
for {set count 0} {$count<10} {incr count} {
    send "AT\r"
    expect {
        "OK" { send_user "<Info> Communicate with 4G module via COM port successfully!\n"
            break
        }
    }
    sleep 3
}
expect *

if {${count}>=10} {
    send_user "<Error> Failed to communicate with 4G module via COM port!\n"
    exit 1
}


## Check the operator selection
send "AT+COPS?\r"
expect {
    -re {\+COPS: *0, *[0-2], *.*, *2} { send_user "<Info> The module is currently registered to UTRAN!\n"
        exit 0
    }
    -re {\+COPS: *0, *[0-2], *.*, *7} { send_user "<Info> The module is currently registered to LTE!\n"
        exit 0
    }
    -re {\+COPS: *0[^,]} { send_user "<Info> Have to reconnect wireless base station!\n" }
}
expect *


## Set the MT to minimum functionality
send "AT+CFUN=0\r"
expect {
    "OK" { send_user "<Info> Set the MT to minimum functionality successfully!\n" }
    "ERROR" { send_user "<Error> Can not set MT to minimum functionality\n"
        exit 1
    }
}
expect *


## Set the MT to full functionality
send "AT+CFUN=1\r"
expect {
    "OK" { send_user "<Info> Set the MT to full functionality successfully!\n" }
    "ERROR" { send_user "<Error> Can not set MT to full functionality\n"
        exit 1
    }
}
expect *
sleep 5


## Check PDP context
## If PDP context is empty, ask user to provide APN
set pdp_cid_1 0
set pdp_cid_4 0
send "AT+CGDCONT?\r"
expect {
    "+CGDCONT: 1" { send_user "<Info> There is 3G PDP context!\n"
        set pdp_cid_1 1
        exp_continue
    }
    "+CGDCONT: 4" { send_user "<Info> There is 4G PDP context!\n"
        set pdp_cid_4 1
    }
}
expect *


if {${pdp_cid_1} == 0 && ${pdp_cid_4} == 0} {
    send_user "<Error> There is no PDP context! Please provide APN to create it.\n"
    exit 1
} elseif {${pdp_cid_1} == 1 && ${pdp_cid_4} == 0} {
    set timeout 30
    ## Connect to 3G base station
    for {set count 0} {$count<5} {incr count} {
        send "AT+CGACT=1,1\r"
        expect {
            "OK" { send_user "<Info> Set to connect to 3G base station\n"
                break
            }
            "ERROR" { send_user "<Info> Retry for activating 3G PDP context!\n"}
        }
        sleep 3
    }
    expect *

    if {${count}>=5} {
        send_user "<Error> Failed to activate 3G PDP context! Please check APN is correct.\n"
        exit
    }
} elseif {${pdp_cid_4} == 1} {
    ## Connect to 4G base station
    ## Check "gprs" PS indication status
    for {set count 0} {$count<5} {incr count} {
        send "AT+CIND?\r"
        expect {
            "+CIND: \[0-5\],\[0-5\],\[0-1\],\[0-1\],\[0-1\],\[0-1\],\[0-1\],\[0-1\],2,\[0-3\],\[0-1\],1" { send_user "<Info> Registered to PS!\n"
                break
            }
            "+CIND: \[0-5\],\[0-5\],\[0-1\],\[0-1\],\[0-1\],\[0-1\],\[0-1\],\[0-1\],1,\[0-3\],\[0-1\],1" { send_user "<Info> PS available in the network but not registered!\n"
#               exit 1
            }
            "+CIND: \[0-5\],\[0-5\],\[0-1\],\[0-1\],\[0-1\],\[0-1\],\[0-1\],\[0-1\],0,\[0-3\],\[0-1\],1" { send_user "<Info> No PS available in the network\n"
#               exit 1
            }
        }
        sleep 3
    }
    expect *

    if {${count}>=5} {
        if {${pdp_cid_1} == 1} {
            ## Connect to 3G base station
            send_user "<Info> There is no 4G signal, connect to 3G base station!\n"
            send "AT+CGACT=1,1\r"
            expect {
                "OK" { send_user "<Info> Set to connect to 3G base station\n" }
                "ERROR" { send_user "<Error> Failed to activate 3G PDP context!\n"
                    exit 1
                }
                sleep 3
            } else {
                ## There is no 3G context and can't connect to 4G base station
                send_user "<Error> There is no 3G context and can't connect to 4G base station!\n"
                exit 1
            }
        }
    }
}
expect *

send_user "<Info> The initialization of 4G module finished!\n"
