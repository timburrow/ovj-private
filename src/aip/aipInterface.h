/*
 * Copyright (C) 2015  Stanford University
 *
 * You may distribute under the terms of either the GNU General Public
 * License or the Apache License, as specified in the README file.
 *
 * For more information, see the README file.
 */
/*-*- Mode: C++ -*-*/

#ifndef AIPINTERFACE_H
#define AIPINTERFACE_H

#include <list>

#include "aipCInterface.h"

typedef std::list<PDLF_t> DisplayListenerList;
typedef std::list<PMLF_t> MouseListenerList;

void aipCallDisplayListeners(int id, bool changeFlag);
void aipCallMouseListeners(int x, int y, int button, int mask, int dummy);

//
// TEST
//
int aipTestDisplayListener(int argc, char *argv[], int retc, char *retv[]);
int aipTestMouseListener(int argc, char *argv[], int retc, char *retv[]);
int aipScreen(int argc, char *argv[], int retc, char *retv[]);

#endif /* AIPINTERFACE_H */
