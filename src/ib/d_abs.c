/*
 * Copyright (C) 2015  Stanford University
 *
 * You may distribute under the terms of either the GNU General Public
 * License or the Apache License, as specified in the README file.
 *
 * For more information, see the README file.
 */
/* Copyright (c) Varian Assoc., Inc.  All Rights Reserved. */
#include "f2c.h"

#ifdef KR_headers
double d_abs(x) doublereal *x;
#else
double d_abs(doublereal *x)
#endif
{
if(*x >= 0)
	return(*x);
return(- *x);
}
