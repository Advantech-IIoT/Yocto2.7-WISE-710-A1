/* ***************************************************************************
 *
 * testdl_gpio.c : Defines the entry point for the console application.
 *
 * ***************************************************************************/

#include "atGPIO.h"
#include <stdio.h>
#include <stdlib.h>
#include <dlfcn.h>
#include <sys/file.h>
#include <syslog.h>

#include <errno.h>

#include "modbus.h"
#include "modbus-private.h"
#include "modbus-rtu.h"
#include "modbus-version.h"
#include <unistd.h>

#define DEFAULT_LOCKFILE		"/var/run/test_iomodule.pid"
#define CMD_RETURN_BUF_SIZE		4096


void *hDLL;
/*
typedef EApiStatus_t (*fnEApiGPIOGetLevel) (EApiId_t Id, 
		uint32_t Bitmask, uint32_t *pLevel);
typedef EApiStatus_t (*fnEApiGPIOSetLevel) (EApiId_t Id, 
		uint32_t Bitmask, uint32_t Level);
typedef EApiStatus_t (*fnEApiGPIOGetDirection) (EApiId_t Id, 
		uint32_t Bitmask, uint32_t *pDirection);
typedef EApiStatus_t (*fnEApiGPIOSetDirection) (EApiId_t Id,
		uint32_t Bitmask, uint32_t Direction);
typedef EApiStatus_t (*fnEApiGPIOGetDirectionCaps) (EApiId_t Id,
		uint32_t *pInputs, uint32_t *pOutputs);


typedef EApiStatus_t (*fnEApiExtDIGetLevel) (EApiId_t Id,
    	uint32_t Bitmask, uint32_t *pLevel);

typedef EApiStatus_t (*fnEApiExtDOSetLevel) (EApiId_t Id,
		uint32_t Bitmask, uint32_t Level);

typedef EApiStatus_t (*fnEApiExtDOGetLevel) (EApiId_t Id,
    	uint32_t Bitmask, uint32_t *pLevel);
*/
void *OpenEAPI()
{
	return dlopen("libIOModule.so", RTLD_LAZY);
}

void CloseEAPI(void *hDLL)
{
	if(hDLL) {
		dlclose(hDLL);
	}
}

uint32_t GetDIIndex(uint32_t Id){
	switch (Id) {
	default:
		break;
	case 0:
		return EAPI_WISE710_EXT_ID_DI_DI00;
	case 1:
		return EAPI_WISE710_EXT_ID_DI_DI01;
	case 2:
		return EAPI_WISE710_EXT_ID_DI_DI02;
	case 3:
		return EAPI_WISE710_EXT_ID_DI_DI03;
	case 4:
		return EAPI_WISE710_EXT_ID_DI_DI04;
	case 5:
		return EAPI_WISE710_EXT_ID_DI_DI05;
	}

	return -1;
}

uint32_t GetDOIndex(uint32_t Id){
	switch (Id) {
	default:
		break;
	case 0:
		return EAPI_WISE710_EXT_ID_DO_DO00;
	case 1:
		return EAPI_WISE710_EXT_ID_DO_DO01;
	case 2:
		return EAPI_WISE710_EXT_ID_DO_DO02;
	case 3:
		return EAPI_WISE710_EXT_ID_DO_DO03;
	}

	return -1;
}

uint32_t GetAIIndex(uint32_t Id){
	switch (Id) {
	default:
		break;
	case 0:
		return EAPI_WISE710_EXT_ID_AI_AI00;
	case 1:
		return EAPI_WISE710_EXT_ID_AI_AI01;
	case 2:
		return EAPI_WISE710_EXT_ID_AI_AI02;
	case 3:
		return EAPI_WISE710_EXT_ID_AI_AI03;
	case 4:
		return EAPI_WISE710_EXT_ID_AI_AI04;
	case 5:
		return EAPI_WISE710_EXT_ID_AI_AI05;
	case 6:
		return EAPI_WISE710_EXT_ID_AI_AI04;
	case 7:
		return EAPI_WISE710_EXT_ID_AI_AI05;
	}

	return -1;
}

void ExtDIGetLevel(EApiId_t Id, uint32_t Bitmask, uint32_t *pLevel)
{
	EApiStatus_t status = EAPI_STATUS_SUCCESS;

	if (hDLL) {
		fnEApiExtDIGetLevel EApiExtDIGetLevel;
		EApiExtDIGetLevel = (fnEApiExtDIGetLevel)dlsym(hDLL, "EApiExtDIGetLevel");
		if (EApiExtDIGetLevel != NULL) {
			status = EApiExtDIGetLevel(Id, Bitmask, pLevel);
		} else {
			printf("Dlsym Error : %s \n", __func__);
		}
	} else {
		printf("Dlopen Error : %s:%d ! \n", __func__, __LINE__);
	}

	if (status != EAPI_STATUS_SUCCESS) {
		printf("Error : %s:%d (0x00%X) \n", __func__, __LINE__, status);
	}
}

void ExtDOSetLevel(EApiId_t Id, uint32_t Bitmask, uint32_t Level)
{
	EApiStatus_t status = EAPI_STATUS_SUCCESS;

	if (hDLL) {
		fnEApiExtDOSetLevel EApiExtDOSetLevel;
		EApiExtDOSetLevel = (fnEApiExtDOSetLevel)dlsym(hDLL, "EApiExtDOSetLevel");
		if (EApiExtDOSetLevel != NULL) {
			status = EApiExtDOSetLevel(Id, Bitmask, Level);
		} else {
			printf("Dlsym Error : %s \n", __func__);
		}
	} else {
		printf("Dlopen Error : %s:%d ! \n", __func__, __LINE__);
	}

	if (status != EAPI_STATUS_SUCCESS) {
		printf("Error : %s:%d (0x00%X) \n", __func__, __LINE__, status);
	}
}

void ExtDOGetLevel(EApiId_t Id, uint32_t Bitmask, uint32_t *pLevel)
{
	EApiStatus_t status = EAPI_STATUS_SUCCESS;

	if (hDLL) {
		fnEApiExtDOGetLevel EApiExtDOGetLevel;
		EApiExtDOGetLevel = (fnEApiExtDOGetLevel)dlsym(hDLL, "EApiExtDOGetLevel");
		if (EApiExtDOGetLevel != NULL) {
			status = EApiExtDOGetLevel(Id, Bitmask, pLevel);
		} else {
			printf("Dlsym Error : %s \n", __func__);
		}
	} else {
		printf("Dlopen Error : %s:%d ! \n", __func__, __LINE__);
	}

	if (status != EAPI_STATUS_SUCCESS) {
		printf("Error : %s:%d (0x00%X) \n", __func__, __LINE__, status);
	}
}

void ExtAISetValRange(EApiId_t Id, uint32_t Bitmask, unsigned short Range)
{
	EApiStatus_t status = EAPI_STATUS_SUCCESS;

	if (hDLL) {
		fnEApiExtAISetValRange EApiExtAISetValRange;
		EApiExtAISetValRange = (fnEApiExtAISetValRange)dlsym(hDLL, "EApiExtAISetValRange");
		if (EApiExtAISetValRange != NULL) {
			status = EApiExtAISetValRange(Id, Bitmask, Range);
		} else {
			printf("Dlsym Error : %s \n", __func__);
		}
	} else {
		printf("Dlopen Error : %s:%d ! \n", __func__, __LINE__);
	}

	if (status != EAPI_STATUS_SUCCESS) {
		printf("Error : %s:%d (0x00%X) \n", __func__, __LINE__, status);
	}
}

void ExtAIGetValRange(EApiId_t Id, uint32_t Bitmask, unsigned short *pRange)
{
	EApiStatus_t status = EAPI_STATUS_SUCCESS;

	if (hDLL) {
		fnEApiExtAIGetValRange EApiExtAIGetValRange;
		EApiExtAIGetValRange = (fnEApiExtAIGetValRange)dlsym(hDLL, "EApiExtAIGetValRange");
		if (EApiExtAIGetValRange != NULL) {
			status = EApiExtAIGetValRange(Id, Bitmask, pRange);
		} else {
			printf("Dlsym Error : %s \n", __func__);
		}
	} else {
		printf("Dlopen Error : %s:%d ! \n", __func__, __LINE__);
	}

	if (status != EAPI_STATUS_SUCCESS) {
		printf("Error : %s:%d (0x00%X) \n", __func__, __LINE__, status);
	}
}

void ExtAIGetValue(EApiId_t Id, uint32_t Bitmask, float *pValue)
{
	EApiStatus_t status = EAPI_STATUS_SUCCESS;

	if (hDLL) {
		fnEApiExtAIGetValue EApiExtAIGetValue;
		EApiExtAIGetValue = (fnEApiExtAIGetValue)dlsym(hDLL, "EApiExtAIGetValue");
		if (EApiExtAIGetValue != NULL) {
			status = EApiExtAIGetValue(Id, Bitmask, pValue);
		} else {
			printf("Dlsym Error : %s \n", __func__);
		}
	} else {
		printf("Dlopen Error : %s:%d ! \n", __func__, __LINE__);
	}

	if (status != EAPI_STATUS_SUCCESS) {
		printf("Error : %s:%d (0x00%X) \n", __func__, __LINE__, status);
	}
}

modbus_t* ExtRSSetCfg(int com_index, int baud, char parity, int data_bit, int stop_bit)
{

	modbus_t *ctx;
	if (hDLL) {
		fnmodbus_new_rtu modbus_new_rtu;
		modbus_new_rtu = (fnmodbus_new_rtu)dlsym(hDLL, "modbus_new_rtu");
		if (modbus_new_rtu != NULL) {
			ctx = modbus_new_rtu(com_index, baud, parity, data_bit, stop_bit);
		} else {
			printf("Dlsym Error : %s \n", __func__);
		}
	} else {
		printf("Dlopen Error : %s:%d ! \n", __func__, __LINE__);
	}

	return ctx;
/*
	if (status != EAPI_STATUS_SUCCESS) {
		printf("Error : %s:%d (0x00%X) \n", __func__, __LINE__, status);
	}
*/	
}

void ExtRSSetGenCfg(modbus_t *ctx, uint32_t to_sec, uint32_t to_usec, int us)
{
	int status = 0;
	if (hDLL) {
		fnmodbus_set_response_timeout modbus_set_response_timeout;
		modbus_set_response_timeout = (fnmodbus_set_response_timeout)dlsym(hDLL, "modbus_set_response_timeout");
		if (modbus_set_response_timeout != NULL) {
			status = modbus_set_response_timeout(ctx, to_sec, to_usec);
		} else {
			printf("Dlsym Error : %s \n", __func__);
		}
	} else {
		printf("Dlopen Error : %s:%d ! \n", __func__, __LINE__);
	}

	if (hDLL) {
		fnmodbus_rtu_set_rts_delay modbus_rtu_set_rts_delay;
		modbus_rtu_set_rts_delay = (fnmodbus_rtu_set_rts_delay)dlsym(hDLL, "modbus_rtu_set_rts_delay");
		if (modbus_rtu_set_rts_delay != NULL) {
			status = modbus_rtu_set_rts_delay(ctx, us);
		} else {
			printf("Dlsym Error : %s \n", __func__);
		}
	} else {
		printf("Dlopen Error : %s:%d ! \n", __func__, __LINE__);
	}
}

void ExtRTUSetRule(modbus_t *ctx, RTU_RULE rules[30])
{
	int status = 0;
	if (hDLL) {
		fnmodbus_set_rtu_rule modbus_set_rtu_rule;
		modbus_set_rtu_rule = (fnmodbus_set_rtu_rule)dlsym(hDLL, "modbus_set_rtu_rule");
		if (modbus_set_rtu_rule != NULL) {
			for(int i = 0;i<30;i++){
				status = modbus_set_rtu_rule(ctx, i, &rules[i]);
			}
		} else {
			printf("Dlsym Error : %s \n", __func__);
		}
	} else {
		printf("Dlopen Error : %s:%d ! \n", __func__, __LINE__);
	}
}

void ExtRTUReadReg(modbus_t *ctx, int start_ch, int end_ch, int read_num)
{
	int status = 0;
	short unsigned int dest = 0;
	if (hDLL) {
		fnmodbus_read_registers modbus_read_registers;
		modbus_read_registers = (fnmodbus_read_registers)dlsym(hDLL, "modbus_read_registers");
		if (modbus_read_registers != NULL) {
			if (read_num == 0){
				while(1){
					for(int i = start_ch;i<=end_ch;i++){
							status = modbus_read_registers(ctx, i, &dest);
							printf("Read_number: %d, Reg_Val:%d\n",i, dest);
					}
					printf("--------------------------\n");
					sleep(2);
			    }
			}
			else {
				for (int j = 0;j<read_num;j++){
					for(int i = start_ch;i<=end_ch;i++){
							status = modbus_read_registers(ctx, i, &dest);
							printf("Read_number: %d, Reg_Val:%d\n",i, dest);
					}
					printf("--------------------------\n");
					sleep(2);
				}
			}
		} else {
			printf("Dlsym Error : %s \n", __func__);
		}
	} else {
		printf("Dlopen Error : %s:%d ! \n", __func__, __LINE__);
	}
}


void ExtRTUFlush(modbus_t *ctx)
{
	int status = 0;
	if (hDLL) {
		fnmodbus_flush modbus_flush;
		modbus_flush = (fnmodbus_flush)dlsym(hDLL, "modbus_flush");
		if (modbus_flush != NULL) {
			status = modbus_flush(ctx);
		} else {
			printf("Dlsym Error : %s \n", __func__);
		}
	} else {
		printf("Dlopen Error : %s:%d ! \n", __func__, __LINE__);
	}
}

void Usage(const char *name)
{
	printf("Usage: %s [Choose] [Other arg...]\n", name);
	printf("  - ExtDIGetLevel: %s [Choose](1) [Id] \n", name);
	printf("  - ExtDOSetLevel: %s [Choose](2) [Id] [Direction](0:input, 1:output) \n", name);
	printf("  - ExtDOGetLevel: %s [Choose](3) [Id]  \n", name);
	printf("  - ExtAISetValRange: %s [Choose](4) [Id] [Range code] \n", name);
	printf("  - ExtAIGetValRange: %s [Choose](5) [Id] \n", name);
	printf("  - ExtAIGetValue: %s [Choose](6) [Id] \n", name);
	printf("  - ExtRSSetAndWrite: %s [Choose](7) [Id] [baud] [parity] [data_bit] [stop_bit] [timeout_s] [timeout_us] [delay] [star_ch] [end_ch] \n", name);
	
}

uint32_t MyAtoU(const char *str)
{
	if (str == NULL) {
		printf("Error: NULL parameter. \n");
		return 999;
	}

	//return (uint32_t)(str[0] - 48);
	return atoi(str);
}

int CheckExit(const char *pFile)
{
	if (pFile == NULL) {
		return -1;
	}

	int LockFd = open(pFile, O_RDWR | O_CREAT);
	if (LockFd == -1) {
		return -2;
	}

	int iret = flock(LockFd, LOCK_EX | LOCK_NB);
	if (iret == -1) {
		return -3;
	}

	//flock(LockFd, LOCK_UN);

	//return 0;
	return LockFd;
}

//Unlock for next execution
int Unlock(int LockFd)
{
	int iret = flock(LockFd, LOCK_UN);
	if (iret == -1) {
		return -1;
	}

	return 0;
}

void setDefaultRule(RTU_RULE rules[30]){
	for(int i = 0;i<30;i++){
		rules[i].ucSlaveUID = i+1;
		rules[i].ucNumOfPoint = 1;
		rules[i].usFunCode = 3;
		rules[i].usProperty = 2;
		rules[i].ulPollIntv = 5;
		rules[i].usAddress = i+1;
		rules[i].ucMapCh = i;
	}
}

int main(int argc, char* argv[])
{
	char choose = '0';
	uint32_t Id = 0, Inputs = 0, Outputs = 0;
	uint32_t Bitmask = 1, Direction = 0, Level = 0;
	unsigned short Range = 0;
	float Value = 0.0;
	int LockFd;

	modbus_t *ctx;
	int com_index = 0, baud = 9600, data_bit = 1, stop_bit = 0, us = 10, start_ch = 0, end_ch = 0;
	char parity = '0';
	uint32_t to_sec = 0, to_usec = 10;
	RTU_RULE rules[30];

	LockFd = CheckExit(DEFAULT_LOCKFILE);
	switch (LockFd) {
	default:
		break;
	case -1:
		printf("Paramener error! \n");
		return 0;
	case -2:
		printf("Open file error! \n");
		return 0;
	case -3:
		printf("Repeatedly call! \n");
		return 0;
	}

	if (argc < 3) {
		Usage(argv[0]);
		return 0;
	}
	choose = argv[1][0];

	hDLL = OpenEAPI();

	switch (choose)
	{
	case '1':
		if (MyAtoU(argv[2]) >= 8 || MyAtoU(argv[2]) < 0) {
			Usage(argv[0]);
			return 0;
		} else {
			Id = MyAtoU(argv[2]);
		}

		ExtDIGetLevel(GetDIIndex(Id), Bitmask, &Level);
		printf("ExtDIGetLevel Id: %u \nlevel: %u \n", Id, Level);
		break;
	case '2':
		if (MyAtoU(argv[2]) >= 8 || MyAtoU(argv[2]) < 0) {
			Usage(argv[0]);
			return 0;
		} else {
			Id = MyAtoU(argv[2]);
			Level = MyAtoU(argv[3]);
		}
		ExtDOSetLevel(GetDOIndex(Id), Bitmask, Level);
		printf("ExtDOSetLevel Id: %u \nLevel: %u \n", Id, Level);
		break;
	case '3':
		if (MyAtoU(argv[2]) >= 8 || MyAtoU(argv[2]) < 0) {
			Usage(argv[0]);
			return 0;
		} else {
			Id = MyAtoU(argv[2]);
		}

		ExtDOGetLevel(GetDOIndex(Id), Bitmask, &Level);
		printf("ExtDOGetLevel Id: %u \nlevel: %u \n", Id, Level);
		break;
	case '4':
		if (MyAtoU(argv[2]) >= 8 || MyAtoU(argv[2]) < 0) {
			Usage(argv[0]);
			return 0;
		} else {
			Id = MyAtoU(argv[2]);
			Range = MyAtoU(argv[3]);
		}
		ExtAISetValRange(GetAIIndex(Id), Bitmask, Range);
		printf("ExtAISetValRange Id: %u \nRange: %u \n", Id, Range);
		break;
	case '5':
		if (MyAtoU(argv[2]) >= 8 || MyAtoU(argv[2]) < 0) {
			Usage(argv[0]);
			return 0;
		} else {
			Id = MyAtoU(argv[2]);
		}

		ExtAIGetValRange(GetAIIndex(Id), Bitmask, &Range);
		printf("ExtAIGetValRange Id: %u \nRange: %u \n", Id, Range);
		break;
	case '6':
		if (MyAtoU(argv[2]) >= 8 || MyAtoU(argv[2]) < 0) {
			Usage(argv[0]);
			return 0;
		} else {
			Id = MyAtoU(argv[2]);
		}

		ExtAIGetValue(GetAIIndex(Id), Bitmask, &Value);
		printf("ExtAIGetValue Id: %u \nValue: %.2f \n", Id, Value);
		break;
	case '7':
		if (MyAtoU(argv[2]) >= 2 || MyAtoU(argv[2]) < 0 || MyAtoU(argv[3]) < 0 ||MyAtoU(argv[4]) < 0 || MyAtoU(argv[5]) < 0 || MyAtoU(argv[6]) < 0) {
			Usage(argv[0]);
			return 0;
		} else {
			com_index = MyAtoU(argv[2]);
			baud = MyAtoU(argv[3]);
			parity = MyAtoU(argv[4]);
			data_bit = MyAtoU(argv[5]);
			stop_bit = MyAtoU(argv[6]);

			to_sec = MyAtoU(argv[7]);
			to_usec = MyAtoU(argv[8]);
			us = MyAtoU(argv[9]);

			start_ch = MyAtoU(argv[10]);
			end_ch = MyAtoU(argv[11]);
		}
		
		ctx = ExtRSSetCfg(com_index, baud, parity, data_bit, stop_bit);

		ExtRSSetGenCfg(ctx, to_sec, to_usec, us);

		setDefaultRule(rules);
		ExtRTUSetRule(ctx, rules);
		ExtRTUFlush(ctx);
		printf("com_index: %d \nbaud: %d \nparity: %d \ndata_bit: %d \nstop_bit: %d\n",com_index, baud, parity, data_bit, stop_bit);
		printf("to_sec: %d \nto_usec: %d \nus: %d \n", to_sec, to_usec, us);
		printf("Press any key to read register, press r to keep reading");
		while(true){
			switch (getchar())
			{
				case 'r':
					ExtRTUReadReg(ctx, start_ch, end_ch, 0);
					break;
			    default:
					ExtRTUReadReg(ctx, start_ch, end_ch, 1);
					break;
			}
		}		
		break;
		/*
	case '8':
		if (MyAtoU(argv[2]) >= 2 || MyAtoU(argv[2]) < 0 || MyAtoU(argv[3]) < 0 ||MyAtoU(argv[4]) < 0) {
			Usage(argv[0]);
			return 0;
		} else {
			to_sec = MyAtoU(argv[2]);
			to_usec = MyAtoU(argv[3]);
			us = MyAtoU(argv[4]);
		}
		ExtRSSetGenCfg(ctx, to_sec, to_usec, us);
		ExtRTUFlush(ctx);
		printf("ExtRSSetGenCfg to_sec: %d \nto_usec: %d \nus: %d \n", to_sec, to_usec, us);
		break;
	case '9':
		if (MyAtoU(argv[2]) >= 2 || MyAtoU(argv[2]) < 0 || MyAtoU(argv[3]) < 0 ||MyAtoU(argv[4]) < 0 || MyAtoU(argv[5]) < 0 || MyAtoU(argv[6]) < 0) {
			Usage(argv[0]);
			return 0;
		} else {
			Id = MyAtoU(argv[2]);
		}
		ExtRTUSetRule(ctx, int rule_index, RTU_RULE *rule)
		ExtRTUFlush(ctx);
		printf("ExtAIGetValue Id: %u \nValue: %u \n", Id, Value);
		break;
	case '10':
		if (MyAtoU(argv[2]) >= 2 || MyAtoU(argv[2]) < 0 || MyAtoU(argv[3]) < 0 ||MyAtoU(argv[4]) < 0 || MyAtoU(argv[5]) < 0 || MyAtoU(argv[6]) < 0) {
			Usage(argv[0]);
			return 0;
		} else {
			Id = MyAtoU(argv[2]);
		}
void ExtRTUReadReg(modbus_t *ctx, int channel, int num_of_read)
		printf("ExtAIGetValue Id: %u \nValue: %u \n", Id, Value);
		break;
		*/
	default:
		Usage(argv[0]);
		break;
	}

	CloseEAPI(hDLL);
	Unlock(LockFd);
	return 0;
}
