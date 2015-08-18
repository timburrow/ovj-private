/*
 * Copyright (C) 2015  Stanford University
 *
 * You may distribute under the terms of either the GNU General Public
 * License or the Apache License, as specified in the README file.
 *
 * For more information, see the README file.
 */

#ifndef CPS_H
#define CPS_H

extern void   getstr(const char *variable, char buf[]);
extern double getval(const char *variable);
extern double getvalnwarn(const char *variable);
extern void   getstrnwarn(const char *variable, char buf[]);
extern int    getArrayparval(const char *parname, double *parval[]);
extern void   getRealSetDefault(int tree, const char *name, double *buf, double def);
extern void   getStringSetDefault(int tree, const char *name, char *buf, const char *def);
extern double sign_add(double arg1, double arg2);
extern int    getmaxval(const char *parname );


extern int find(const char *name);
extern void getparmnwarn();
extern int getparm(const char *, const char *, int, void *, int);
extern int setparm(const char *varname, const char *vartype, int tree,
            const void *varaddr, int index);
extern int getparmd(const char *, const char *, int, double *, int);
extern int var_active(const char *varname, int tree);

#endif
