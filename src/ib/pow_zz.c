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
double log(), exp(), cos(), sin(), atan2(), f__cabs();
VOID pow_zz(r,a,b) doublecomplex *r, *a, *b;
#else
#undef abs
#include "math.h"
extern double f__cabs(double,double);
void pow_zz(doublecomplex *r, doublecomplex *a, doublecomplex *b)
#endif
{
double logr, logi, x, y;

logr = log( f__cabs(a->r, a->i) );
logi = atan2(a->i, a->r);

x = exp( logr * b->r - logi * b->i );
y = logr * b->i + logi * b->r;

r->r = x * cos(y);
r->i = x * sin(y);
}
