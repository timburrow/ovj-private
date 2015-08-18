/*
 * Copyright (C) 2015  Stanford University
 *
 * You may distribute under the terms of either the GNU General Public
 * License or the Apache License, as specified in the README file.
 *
 * For more information, see the README file.
 */
/*
 * Varian, Inc. All Rights Reserved.
 * This software contains proprietary and confidential
 * information of Varian, Inc. and its contributors.
 * Use, disclosure and reproduction is prohibited without
 * prior consent.
 */
/*  Indicies for real-time variables */

#define TABOFFSET 2
#define STARTINDEX 0
#define NPINDEX (STARTINDEX)
#define NTINDEX (NPINDEX + 1)
#define CTINDEX (NTINDEX + 1)
#define CTSSINDEX (CTINDEX + 1)
#define FIDINDEX (CTSSINDEX + 1)
#define HSINDEX (FIDINDEX + 1)
#define OPHINDEX (HSINDEX + 1)
#define BSINDEX (OPHINDEX + 1)
#define BSCTINDEX (BSINDEX + 1)
#define SSINDEX (BSCTINDEX + 1)
#define SSCTINDEX (SSINDEX + 1)
#define NSPINDEX (SSCTINDEX + 1)
#define SRATEINDEX (NSPINDEX + 1)
#define RTTMPINDEX (SRATEINDEX + 1)
#define SPARE1INDEX (RTTMPINDEX + 1)
#define ID2INDEX (SPARE1INDEX + 1)
#define ID3INDEX (ID2INDEX + 1)
#define ID4INDEX (ID3INDEX + 1)
#define ZEROINDEX (ID4INDEX + 1)
#define ONEINDEX (ZEROINDEX + 1)
#define TWOINDEX (ONEINDEX + 1)
#define THREEINDEX (TWOINDEX + 1)
#define V1INDEX (THREEINDEX + 1)
#define V2INDEX (V1INDEX + 1)
#define V3INDEX (V2INDEX + 1)
#define V4INDEX (V3INDEX + 1)
#define V5INDEX (V4INDEX + 1)
#define V6INDEX (V5INDEX + 1)
#define V7INDEX (V6INDEX + 1)
#define V8INDEX (V7INDEX + 1)
#define V9INDEX (V8INDEX + 1)
#define V10INDEX (V9INDEX + 1)
#define V11INDEX (V10INDEX + 1)
#define V12INDEX (V11INDEX + 1)
#define V13INDEX (V12INDEX + 1)
#define V14INDEX (V13INDEX + 1)
#define RTTABINDEX (V14INDEX + 1)
#define TPWRINDEX (RTTABINDEX + 1)
#define DPWRINDEX (TPWRINDEX + 1)
#define TPHSINDEX (DPWRINDEX + 1)
#define DPHSINDEX (TPHSINDEX + 1)
#define DPFINDEX (DPHSINDEX + 1)
#define ARRAYDIMINDEX (DPFINDEX + 1)
#define CPFINDEX (ARRAYDIMINDEX + 1)
#define MXSCLINDEX (CPFINDEX + 1)
#define RLXDELAYINDEX (MXSCLINDEX + 1)
#define NFIDBUFINDEX (RLXDELAYINDEX + 1)
#define RECGAININDEX (NFIDBUFINDEX + 1)
#define NPNOISEINDEX (RECGAININDEX + 1)
#define DTMCTRLINDEX (NPNOISEINDEX + 1)
#define GTBLINDEX (DTMCTRLINDEX + 1)
#define ADCCTRLINDEX (GTBLINDEX + 1)
#define SCANFLAGINDEX (ADCCTRLINDEX + 1)
#define ILFLAGRTINDEX (SCANFLAGINDEX + 1)
#define ILSSINDEX (ILFLAGRTINDEX + 1)
#define ILCTSSINDEX (ILSSINDEX + 1)
#define TMPRTINDEX (ILCTSSINDEX + 1)
#define ACQIFLAGRT (TMPRTINDEX + 1)
#define MAXSUMINDEX (ACQIFLAGRT + 1)
#define STARTTINDEX (MAXSUMINDEX + 1)
#define INITFLAGINDEX (STARTTINDEX + 1)
#define INCDELAYINDEX (INITFLAGINDEX + 1)
#define ENDINCDELAYINDEX (INCDELAYINDEX + (5*2) + 1) /* 6 double words */
#define CLRBSFLAGINDEX (ENDINCDELAYINDEX + 1)

#define LASTINDEX (CLRBSFLAGINDEX+1)

#define RT_TAB_SIZE (LASTINDEX+2)
#define RTVAR_BUFFER    (0xaaaaaa)

