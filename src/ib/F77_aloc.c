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
#undef abs
#undef min
#undef max
#include "stdio.h"

static integer memfailure = 3;

#ifdef KR_headers
extern char *malloc();
extern void exit_();

 char *
F77_aloc(Len, whence) integer Len; char *whence;
#else
#include "stdlib.h"
extern void exit_(integer*);

 char *
F77_aloc(integer Len, char *whence)
#endif
{
	char *rv;
	unsigned int uLen = (unsigned int) Len;	/* for K&R C */

	if (!(rv = (char*)malloc(uLen))) {
		fprintf(stderr, "malloc(%u) failure in %s\n",
			uLen, whence);
		exit_(&memfailure);
		}
	return rv;
	}
