/*
 * Copyright (C) 2015  Stanford University
 *
 * You may distribute under the terms of either the GNU General Public
 * License or the Apache License, as specified in the README file.
 *
 * For more information, see the README file.
 */
/* bptypes.h */

#ifndef	BPTYPES_H
#define	BPTYPES_H

/*
 * 32 bit integers are different types on various architectures
 */

#ifndef	int32
#define int32 long
#endif
typedef unsigned int32 u_int32;

/*
 * Nice typedefs. . .
 */

typedef int boolean;
typedef unsigned char byte;


#endif	/* BPTYPES_H */
