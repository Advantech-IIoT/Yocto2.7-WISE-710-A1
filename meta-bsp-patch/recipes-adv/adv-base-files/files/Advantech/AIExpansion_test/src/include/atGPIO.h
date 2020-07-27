/*****************************************************************************
  Copyright (c) 2018, Advantech Automation Corp.
  THIS IS AN UNPUBLISHED WORK CONTAINING CONFIDENTIAL AND PROPRIETARY
  INFORMATION WHICH IS THE PROPERTY OF ADVANTECH AUTOMATION CORP.

  ANY DISCLOSURE, USE, OR REPRODUCTION, WITHOUT WRITTEN AUTHORIZATION FROM
  ADVANTECH AUTOMATION CORP., IS STRICTLY PROHIBITED.
 *****************************************************************************/
#ifndef _ATGPIO_H_
#define _ATGPIO_H_

#include <string.h>
#include <stdbool.h>
#include <stdlib.h>
#include <dlfcn.h>
#include "EApi.h"

#ifdef __cplusplus
extern "C" {
#endif

#if defined(ARMV7L)
#define CMD_BUF_SIZE				512
#define CMD_RETURN_BUF_SIZE			4096
#define CMD_GET_GPIO_MAX			sprintf(cmd, "ls /sys/class/gpio/ |awk '/^gpio[0-9]/{print}' |wc -l");
#define CMD_GET_GPIO_CAP(ID)		sprintf(cmd, "cat /sys/class/gpio/gpio%u/direction |grep out |wc -l", ID);
#define CMD_SET_GPIO_CAP(ID,CAP)	sprintf(cmd, "echo %s > /sys/class/gpio/gpio%u/direction", CAP, ID);
#define CMD_GET_GPIO_VAL(ID)		sprintf(cmd, "cat /sys/class/gpio/gpio%u/value", ID);
#define CMD_SET_GPIO_VAL(ID,VAL)	sprintf(cmd, "echo %u > /sys/class/gpio/gpio%u/value", VAL, ID);
#elif defined(AARCH64)
#else
#endif

// magic number refer to linux-source-4.4.0/Documentation/ioctl/ioctl-number.txt
#define EC_MAGIC		'p'
#define SETGPIODIR              _IO(EC_MAGIC, 7)
#define GETGPIODIR              _IO(EC_MAGIC, 8)
#define ECSETGPIOSTATUS         _IO(EC_MAGIC, 9)
#define ECGETGPIOSTATUS         _IO(EC_MAGIC, 0x0a)

static int GpioFd = 0;

void *OpenATGPIO()
{
	return dlopen("libATGPIO.so", RTLD_LAZY);
}

void CloseATGPIO(void *hDLL)
{
	if (hDLL) {
		dlclose(hDLL);
	}
}

EApiStatus_t EApiGPIOGetLevel (
		__IN EApiId_t Id,
		__IN uint32_t Bitmask, 
		__OUT uint32_t *pLevel
		);

EApiStatus_t EApiExtGPIOGetLevel (
		__IN EApiId_t Id,
		__IN uint32_t Bitmask,
		__OUT uint32_t *pLevel
		);

EApiStatus_t EApiGPIOSetLevel (
		__IN EApiId_t Id,
		__IN uint32_t Bitmask, 
		__IN uint32_t Level
		);
EApiStatus_t EApiGPIOGetDirection (
		__IN EApiId_t Id,
		__IN uint32_t Bitmask, 
		__OUT uint32_t *pDirection
		);
EApiStatus_t EApiGPIOSetDirection (
		__IN EApiId_t Id,
		__IN uint32_t Bitmask, 
		__IN uint32_t Direction
		);
EApiStatus_t EApiGPIOGetDirectionCaps (
		__IN EApiId_t Id,
		__OUTOPT uint32_t *pInputs, 
		__OUTOPT uint32_t *pOutputs
		);

typedef EApiStatus_t (*fnEApiGPIOGetLevel) (
		__IN EApiId_t Id,
		__IN uint32_t Bitmask, 
		__OUT uint32_t *pLevel
		);
typedef EApiStatus_t (*fnEApiGPIOSetLevel) (
		__IN EApiId_t Id,
		__IN uint32_t Bitmask, 
		__IN uint32_t Level
		);
typedef EApiStatus_t (*fnEApiGPIOGetDirection) (
		__IN EApiId_t Id,
		__IN uint32_t Bitmask, 
		__OUT uint32_t *pDirection
		);
typedef EApiStatus_t (*fnEApiGPIOSetDirection) (
		__IN EApiId_t Id,
		__IN uint32_t Bitmask, 
		__IN uint32_t Direction
		);
typedef EApiStatus_t (*fnEApiGPIOGetDirectionCaps) (
		__IN EApiId_t Id,
		__OUTOPT uint32_t *pInputs, 
		__OUTOPT uint32_t *pOutputs
		);

/*WISE-710 API*/

EApiStatus_t EApiExtDIGetLevel (
    __IN EApiId_t Id,
    __IN uint32_t Bitmask,
    __OUT uint32_t *pLevel
    );

EApiStatus_t EApiExtDOSetLevel (
    __IN EApiId_t Id,
    __IN uint32_t Bitmask,
    __IN uint32_t Level
    );

EApiStatus_t EApiExtDOGetLevel (
    __IN EApiId_t Id,
    __IN uint32_t Bitmask,
    __OUT uint32_t *pLevel
    );

EApiStatus_t EApiExtAISetValRange (
		__IN EApiId_t Id,
		__IN uint32_t Bitmask,
		__IN unsigned short Range
		);

EApiStatus_t EApiExtAIGetValRange (
		__IN EApiId_t Id,
		__IN uint32_t Bitmask,
		__OUT unsigned short *pRange
		);

EApiStatus_t EApiExtAIGetValue (
		__IN EApiId_t Id,
		__IN uint32_t Bitmask,
		__OUT float *pValue
		);

typedef EApiStatus_t (*fnEApiExtDIGetLevel) (
    __IN EApiId_t Id,
    __IN uint32_t Bitmask,
    __OUT uint32_t *pLevel
    );

typedef EApiStatus_t (*fnEApiExtDOSetLevel) (
    __IN EApiId_t Id,
    __IN uint32_t Bitmask,
    __IN uint32_t Level
    );

typedef EApiStatus_t (*fnEApiExtDOGetLevel) (
    __IN EApiId_t Id,
    __IN uint32_t Bitmask,
    __OUT uint32_t *pLevel
    );

typedef EApiStatus_t (*fnEApiExtAISetValRange) (
		__IN EApiId_t Id,
		__IN uint32_t Bitmask,
		__IN unsigned short Range
		);

typedef EApiStatus_t (*fnEApiExtAIGetValRange) (
		__IN EApiId_t Id,
		__IN uint32_t Bitmask,
		__OUT unsigned short *pRange
		);

typedef EApiStatus_t (*fnEApiExtAIGetValue) (
		__IN EApiId_t Id,
		__IN uint32_t Bitmask,
		__OUT float *pValue
		);


#define EAPIFunction(h,s) 	fn##s s = (fn##s)dlsym(h,#s)

#ifdef __cplusplus
}
#endif
#endif /* _ATGPIO_H_ */
