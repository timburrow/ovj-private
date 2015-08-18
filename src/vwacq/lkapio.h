/*
 * Copyright (C) 2015  Stanford University
 *
 * You may distribute under the terms of either the GNU General Public
 * License or the Apache License, as specified in the README file.
 *
 * For more information, see the README file.
 */

#ifndef INClkapio
#define INClkapio

/* ------------- Make C header file C++ compliant ------------------- */
#ifdef __cplusplus
extern "C" {
#endif

#if defined(__STDC__) || defined(__cplusplus)
extern int acode2index( int acode );
extern int xcode2index( int xcode );
extern ushort index2apreg( int index );
extern int (*index2converter( int index ))();
extern int (*index2valuestore( int index ))();
extern ushort getlkpreampgainvalue(void);
extern ushort getlkpreampgainapaddr(void);
extern void storelkpreampgainvalue(ushort value);

#else
/* --------- NON-ANSI/C++ prototypes ------------  */

extern int acode2index();
extern int xcode2index();
extern ushort index2apreg();
extern int (*index2converter())();
extern int (*index2valuestore())();
#endif

#ifdef __cplusplus
}
#endif

#endif
