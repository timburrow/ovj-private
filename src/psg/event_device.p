/*
 * Copyright (C) 2015  Stanford University
 *
 * You may distribute under the terms of either the GNU General Public
 * License or the Apache License, as specified in the README file.
 *
 * For more information, see the README file.
 */

#include "device.p"

/* event device local properties */
c68int event_type;    /* type of output board event,delay,sync, etc. */
c68int max_rtpars;    /* max number of rt paramter that can be used by event*/
c68int n_rtpars;      /* number of rt paramter that are being used by event*/
c68int *valid_rtpars; /* ptr to array of valid real time parameters */
