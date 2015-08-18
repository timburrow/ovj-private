// Copyright (C) 2015  Stanford University
// You may distribute under the terms of either the GNU General Public
// License or the Apache License, as specified in the README file.
// For more information, see the README file.
/* 
 * Varian, Inc. All Rights Reserved.
 * information of Varian, Inc. and its contributors.
 */

/*  g2pul - gradient equipment two-pulse sequence 

    Parameters: 
        gzlvl1 = gradient amplitude (-2048 to +2047)
        gt1    = gradient duration in seconds (0.002)   

*/

#include <standard.h>
pulsesequence()
{
double gzlvl1,gt1;

/* GATHER AND INITIALIZE VARIABLES */
   gzlvl1 = getval("gzlvl1");
   gt1    = getval("gt1");

/* BEGIN PULSE SEQUENCE */
   status(A);
      delay(d1);

   status(B);
      rgpulse(p1, zero,rof1,rof2);
      rgradient('z',gzlvl1);
      delay(gt1);
      rgradient('z',0.0);
      delay(d2);

   status(C);
      pulse(pw,oph);
}

