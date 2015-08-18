/* 
 * Agilent Technologies All Rights Reserved.
 * This software contains proprietary and confidential
 * information of Agilent Technologies and its contributors.
 * Use, disclosure and reproduction is prohibited without
 * prior consent.
 */
#include <standard.h>
/*
   a shaped gradient test sequence and example 
   Phil Hornung
*/

void pulsesequence()
{
   double tro;
   char gread,gphase,gslice; 
   char grdname[MAXSTR];

   gread = 'z';
   if (getorientation(&gread,&gphase,&gslice,"orient") < 0) 
     abort_message("illegal value in orient parameter");
   gro = getval("gro");
   tro = getval("tro");
   getstr("gname",grdname);
   /* equilibrium period */
   status(A);
      hsdelay(d1);

   /* --- tau delay --- */
   status(B);
      pulse(p1, zero);
      hsdelay(d2);

   /* --- observe period --- */
   status(C);
   pulse(pw,oph);
   delay(0.0001);
   shapedgradient(grdname,tro,gro,gread,1,1); 
   hsdelay(d2);

   startacq(alfa);
   acquire(np,1.0/sw);
   endacq();
}
