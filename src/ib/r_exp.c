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
double exp();
double r_exp(x) real *x;
#else
#undef abs
#include "math.h"
double r_exp(real *x)
#endif
{
return( exp(*x) );
}
