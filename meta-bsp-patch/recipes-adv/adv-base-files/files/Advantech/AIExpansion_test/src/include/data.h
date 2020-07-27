#ifndef _DATA_H_
#define _DATA_H_

/********************************************************/
/* AI Expansion card typedef */
/********************************************************/

#define SIZE_IO_FW_VERSION              10
#define SIZE_IO_BOOT_VERSION            10
#define SIZE_IO_MODULE_ID               11

#define MAX_IO_CH                       13
#define MAX_RS485_CH                    2
#define MBRTU_MAX_CMD_SET               30
#define MBRTU_MAX_CH                    64 

// Voltage = ( (Val–ValMin) / (ValMax - ValMin) ) * ( EngMax – EngMin ) + EngMin
#define RANGE_PM150mV	0x0103  /* +-150mV */
#define RANGE_PM500mV	0x0104  /* +-500mV */
#define RANGE_PM1V		0x0140  /* +-1V */
#define RANGE_PM5V		0x0142  /* +-5V */
#define RANGE_PM10V		0x0143  /* +-10V */
#define RANGE_P0_150mV	0x0105  /* 0~150mV */
#define RANGE_P0_500mV	0x0106  /* 0~500mV */
#define RANGE_P0_1V		0x0145  /* 0~1V */
#define RANGE_P0_5V		0x0147  /* 0~5V */
#define RANGE_P0_10V	0x0148  /* 0~10V */

// Current = ( (Val–ValMin) / (ValMax - ValMin) ) * ( EngMax – EngMin ) + EngMin
#define RANGE_P4_20mA	0x0180  /* 4~20mA */
#define RANGE_PM20mA	0x0181  /* +-20mA */
#define RANGE_P0_20mA	0x0182  /* 0~20mA */

// AI(EVT)  --- High/Low Alarm ---
union AI_Flag {
    unsigned char ucAIFlag;
    struct {
        unsigned char bLowAlarmStatus: 1;  // bit 0
        unsigned char bHiAlarmStatus : 1;  // bit 1
        unsigned char bClearMaxAI    : 1;  // bit 2
        unsigned char bClearMinAI    : 1;  // bit 3
        unsigned char bDeviation     : 1;  // bit 4
        unsigned char bReserved_x1   : 3;  // bit 5~7
    };
};

// Sensor(ST)  --- High/Low Alarm ---
union Sen_Flag {
    unsigned short ucSenFlag;
    struct {
        unsigned short bHiAlarmStatus : 1;  // bit 0
        unsigned short bLowAlarmStatus: 1;  // bit 1
        unsigned short bClearMaxSen   : 1;  // bit 2
        unsigned short bClearMinSen   : 1;  // bit 3
        unsigned short bAlarmUpdate   : 1;  // bit 4
        unsigned short bReserved_x1   : 11; // bit 5 ~ 15
    };
};

/********************************************************/
/* Store read message  */
/********************************************************/
typedef struct {
	unsigned char ucFlag;
	unsigned short usCurVal;
	unsigned short usMaxVal;
	unsigned short usMinVal;
	unsigned long ulStatus;
} POST_AIVAL;

typedef struct {
	unsigned short usRange;
	unsigned long ulLowAlarm;
	unsigned long ulHighAlarm;
	unsigned long ulScaleLow;
	unsigned long ulScaleHigh;
	unsigned long ulPhysicalLow;
	unsigned long ulPhysicalHigh;
} POST_AICFG;

typedef struct {
	unsigned short usAIAvgMaskChannel;
	unsigned char ucSamplingRate;
	unsigned char ucResolution;
} POST_AIGENCFG;

typedef struct {
	unsigned char ucCtlFlag;
	unsigned char ucDetectTime;
	unsigned long ulFilteWid_L;
	unsigned long ulFilteWid_H;
    unsigned long ulCntStartUp;   
} POST_DICFG;

typedef struct {
    unsigned char ucFlag;
	unsigned long ulCounter;
	unsigned long ulFrequency;
} POST_DIVAL;

typedef struct {
     unsigned char ucCtlFlag;
     unsigned char ucDrivedAICh;
     unsigned long ulPulseWid_L;
     unsigned long ulPulseWid_H;
     unsigned long ulDelayL2H;
     unsigned long ulDelayH2L;
} POST_DOCFG;

typedef struct {
    unsigned char ucFlag;
    unsigned long  ulDOPulsAbs;
    unsigned long  ulDOPulsInc;
} POST_DOVAL;

typedef struct {
    unsigned char ucTotal_DIs;
    unsigned char ucTotal_DOs;
    unsigned char ucTotal_Relays;
    unsigned char ucTotal_AIs;
    unsigned char ucTotal_UIs;
    unsigned char ucTotal_Sensors;
    unsigned char ucTotal_RS485;
	unsigned char ucTotal_RTURule;
	unsigned char ucTotal_RTUCh;
    unsigned char ucReserved[3];
    unsigned char ucIO_Fw_Verion[SIZE_IO_FW_VERSION];
    unsigned char ucIO_Boot_Version[SIZE_IO_BOOT_VERSION];  /* Ax.xx Bxx */
    unsigned char ucIO_Module_ID[SIZE_IO_MODULE_ID];        /* S250, S217 */
    unsigned char ucReserved1;
} MODULE_INFO;

typedef struct {
    /* Byte 0x001 */
    unsigned char ucBaudRate;                   // 3: 9600
    /* Byte 0x002 */
    union {
        unsigned char ucCfgByte;
        struct {
            unsigned char ucDataBit     :1;     // 1: 8bit
            unsigned char ucParity      :2;     // 0: None
            unsigned char ucStopBit     :1;     // 0: 1 stop
            unsigned char ucReserved0   :4;
        };
    };
    /* Byte 0x003 */
    unsigned char ucProtocol;               // 0: Modbus/RTU
    unsigned char ucReserved[13];
} RS485_CONFIG;

// size 16
typedef struct {
    unsigned char ucSlaveUID;
    unsigned char ucNumOfPoint;
    struct {
        unsigned short usFunCode     :5;     // 0x01 ~ 0x10
        unsigned short usProperty    :2;     // 0x00 ~ 0x02
        unsigned short usResrved3    :1;     // 0/1 (Old: usLogEn => move to sCfgLogData->usExpIORule_LogEn)
        unsigned short usDataFormat  :2;     // 0:Bit, 1:Word, 2:Double word, 3:Float
        unsigned short usReserved6   :6;
    };
    unsigned long  ulPollIntv;
    unsigned short usAddress;
    unsigned char  ucMapCh;
    unsigned char ucReserved;
    // below is for internal used
    unsigned short usRawDeviation;     // user doesnot need to set ; for registers, default: 3276 value range: 1 ~ 65535
    unsigned char ucReserved2[2];       // NULL padding
} RTU_RULE;

// size 24
typedef struct {
    unsigned long ulRespTimeout;
    unsigned long ulDelayPoll;
    struct {
        unsigned char ucCRCEn       :1;     // 1: CRC enable
        unsigned char ucReserve7    :7;
    };
    struct {
        unsigned char bTransMode    :1;     // 0: Receive after send, 1: always receive
        unsigned char bReserve      :7;
    };
    unsigned short usSilentTime;
    unsigned char ucEndChar[2];
    unsigned short usMinLen;
    unsigned char ucReserved6[8];
} RS485_GENCFG;

//*****************************************************************************
// -- Modbus RTU Value
//*****************************************************************************
typedef struct {
    unsigned char ucWrStatus;
    unsigned char ucStatus;
    unsigned char ucData;
} RTUCOIL;

typedef struct {
    unsigned char  ucWrStatus;
    unsigned char  ucStatus;
    unsigned short usData;
} RTUREG;

// Modbus RTU data
typedef struct {
    RTUCOIL sRTUCoil[MBRTU_MAX_CH];
    RTUREG  sRTUReg[MBRTU_MAX_CH];
} RTU_VALUE;

// Modbus RTU polling response time
typedef struct {
    unsigned short ulCurrRespTime;
    unsigned short ulMaxRespTime;
    unsigned short ulMinRespTime;
    unsigned char  ucErrorCode;
} RTU_RESPONSE;

typedef struct {
	long int update_time;
	/* AI config */
	POST_AICFG cfg_ai[MAX_IO_CH];
	/* AI Gne config */
	POST_AIGENCFG cfg_aigen;
	/* AI & AI Gen value */
	POST_AIVAL val_ai[MAX_IO_CH];
	/* DI config */
	POST_DICFG cfg_di[MAX_IO_CH];
	/* DI value */
	POST_DIVAL val_di[MAX_IO_CH];
    /* DO config */
    POST_DOCFG cfg_do[MAX_IO_CH];
    /* DO value */
    POST_DOVAL val_do[MAX_IO_CH];
    /*RS485 config*/
    RS485_CONFIG cfg_rs485[MAX_RS485_CH];
    /*RS485 general config*/
    RS485_GENCFG cfg_gen_rs485[MAX_RS485_CH];
    /*RTU rule config*/
    RTU_RULE cfg_rtu_rule[MAX_RS485_CH*MBRTU_MAX_CMD_SET];
    /*RTU val*/
	RTU_VALUE val_rtu[MAX_RS485_CH];
	/*RTU response time*/
	//RTU_RESPONSE res_rtu[MAX_RS485_CH*MBRTU_MAX_CMD_SET];
	/* Module info */
    MODULE_INFO info_module;
    /*Set IO module flag, 1->DOVal, 2->AIRng, 3->RSCfg, RSGen, RTURule*/
    int setModule;
    /*Set IO module index*/
    int setMdlIdx;
    /*Set RTU rule index*/
    int setRTUIdx;
} READ_MSG;

#endif /* _DATA_H_ */
