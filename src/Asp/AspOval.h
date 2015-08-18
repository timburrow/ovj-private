/*
 * Copyright (C) 2015  Stanford University
 *
 * You may distribute under the terms of either the GNU General Public
 * License or the Apache License, as specified in the README file.
 *
 * For more information, see the README file.
 */
/*-*- Mode: C++ -*-*/

#ifndef ASPOVAL_H
#define ASPOVAL_H

#include "AspBox.h"

class AspOval : public AspBox
{ 

public:

    AspOval(spAspCell_t cell, int x, int y);
    AspOval(char words[MAXWORDNUM][MAXSTR], int nw);

private:

};

#endif /* ASPOVAL_H */
