/*
 * Copyright (C) 2015  Stanford University
 *
 * You may distribute under the terms of either the GNU General Public
 * License or the Apache License, as specified in the README file.
 *
 * For more information, see the README file.
 */
/*-*- Mode: C++ -*-*/

#ifndef ASPBOX_H
#define ASPBOX_H

#include "AspAnno.h"

class AspBox : public AspAnno
{ 

public:

    AspBox(spAspCell_t cell, int x, int y);
    AspBox(char words[MAXWORDNUM][MAXSTR], int nw);

    void display(spAspCell_t cell, spAspDataInfo_t dataInfo);

    int select(int x, int y);
    void create(spAspCell_t cell, int x, int y);
    void modify(spAspCell_t cell, int x, int y, int prevX, int prevY);

private:

};

#endif /* ASPBOX_H */
