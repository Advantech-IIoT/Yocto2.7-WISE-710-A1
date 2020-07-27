#!/usr/bin/expect -f

## Unit: second
set timeout 10
set DEVICENODE [lindex $argv 0];

## Open wireless module COM port
spawn microcom -s 115200 ${DEVICENODE}
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
