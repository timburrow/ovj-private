/*
 * Copyright (C) 2015  Stanford University
 *
 * You may distribute under the terms of either the GNU General Public
 * License or the Apache License, as specified in the README file.
 *
 * For more information, see the README file.
 */

#ifndef __TIMERFUNCS_H__
#define __TIMERFUNCS_H__

extern int timer_went_off;

extern int setup_ms_timer( int ms_interval );
extern int cleanup_from_timeout(void);
extern void delayAwhile(int time /* seconds */);
extern void delayMsec(int time /* milliseconds */);

#endif
