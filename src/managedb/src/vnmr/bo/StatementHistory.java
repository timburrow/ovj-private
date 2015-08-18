/*
 * Copyright (C) 2015  Stanford University
 *
 * You may distribute under the terms of either the GNU General Public
 * License or the Apache License, as specified in the README file.
 *
 * For more information, see the README file.
 */



package  vnmr.bo;



/**
 * Dummy so that managedb will compile
 */
public class StatementHistory {


    /**
     * constructor
     * @param shufflerService
     */
    public StatementHistory(){

    } // StatementHistory()



    /**
     * Update the current shuffler panels, but no change has taken
     * place that caused the need for a history update.  This is 
     * primarily for use after adding or removing a file from the
     * DB so that we can get the panels updated.
     */
    public void updateWithoutNewHistory() {


    }


} // class StatementHistory
