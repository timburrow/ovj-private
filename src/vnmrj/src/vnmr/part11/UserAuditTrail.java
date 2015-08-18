/*
 * Copyright (C) 2015  Stanford University
 *
 * You may distribute under the terms of either the GNU General Public
 * License or the Apache License, as specified in the README file.
 *
 * For more information, see the README file.
 */

package vnmr.part11;

import java.io.*;
import java.util.*;

/**
 * <p>Title: UserAuditTrail </p>
 * <p>Description: The audit trail for the user.  </p>
 * <p>Copyright: Copyright (c) 2002</p>
 * <p> </p>
 *  unascribed
 *
 */

public class UserAuditTrail
{
    /** The date to be recorded. */
    protected Date m_date;

    /** The name of the user who's attributes has been changed. */
    protected String m_strUser;

    /** The action or attribute that changed. */
    protected String m_strAction;

    public UserAuditTrail(Date date, String strUser, String strAction)
    {
        m_date = date;
        m_strUser = strUser;
        m_strAction = strAction;
    }

    public Date getDate()
    {
        return m_date;
    }

    public String getUser()
    {
        return m_strUser;
    }

    public String getAction()
    {
        return m_strAction;
    }
}
