/*
 * Copyright (C) 2015  Stanford University
 *
 * You may distribute under the terms of either the GNU General Public
 * License or the Apache License, as specified in the README file.
 *
 * For more information, see the README file.
 */
#ifndef INC_LOCKCONTROLLER_H
#define INC_LOCKCONTROLLER_H
#include "Controller.h"
class LockController: public Controller
{
   private:
     int lockGain;
     int lockPower;
     int lockPhase;
     int lockOffsetFreq; 
   public:
     // constructor
     LockController(const char *name,int flags);

   void setActive();
   void setOff();
   void setSync();
   void setAsync();
   int initializeExpStates(int setupflag);
   void setLockGain(double xx);
   int  getLockGainI();
   void setLockPower(double xx);
   int  getLockPowerI();
   void setLockPhase(double xx);
   int  getLockPhaseI();
   void setLockOffsetFrequency(double xx);
   int  getLockOffsetFrequencyI();
};
#endif

