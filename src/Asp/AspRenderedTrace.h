/*
 * Copyright (C) 2015  Stanford University
 *
 * You may distribute under the terms of either the GNU General Public
 * License or the Apache License, as specified in the README file.
 *
 * For more information, see the README file.
 */
/*-*- Mode: C++ -*-*/

#ifndef ASPRENDEREDTRACE_H
#define ASPRENDEREDTRACE_H

#include <list>

#include "sharedPtr.h"
#include "AspUtil.h"
#include "AspTrace.h"

class AspRenderedTrace
{
public:
    int id;			// Unique ID for this gframe

    AspRenderedTrace(spAspTrace_t trace, double pstx, double pwd, double vstx, double vwd, 
	double scale, double off);
    ~AspRenderedTrace();

   spAspTrace_t trace;
   double pstx,pwd,vscale,voff;
   double vstx,vwd;

private:
};

#endif /* ASPRENDEREDTRACE_H */
