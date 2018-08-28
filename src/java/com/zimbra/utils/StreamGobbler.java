/*
 * ***** BEGIN LICENSE BLOCK *****
 * Zimbra Collaboration Suite CSharp Client
 * Copyright (C) 2009, 2013, 2014, 2016 Synacor, Inc.
 *
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software Foundation,
 * version 2 of the License.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program.
 * If not, see <https://www.gnu.org/licenses/>.
 * ***** END LICENSE BLOCK *****
 */
package com.zimbra.utils;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.logging.Logger;
import java.util.logging.Level;

public class StreamGobbler implements Runnable
{
    private String name;
    private InputStream is;
    private Thread thread;
    private Logger str_logger;
    private volatile boolean bstop;
    private volatile boolean active;
    public StreamGobbler (String name, InputStream is,Logger logger)
    {
        this.name = name;
        this.is = is;
        str_logger=logger;
        bstop=false;
        active=false;
    }

    public boolean get_active()
    {
        return active;
    }

    public void start ()
    {
        thread = new Thread (this);
        thread.start ();
    }

    public void stop()
    {
        bstop=true;
    }

    private synchronized void writeLogger(String str)
    {
        if(str_logger!=null)
        {
            str_logger.log(Level.INFO,   str);
        }
    }

    public void run ()
    {
        try
        {
            active=true;
            InputStreamReader isr = new InputStreamReader (is);
            BufferedReader br = new BufferedReader (isr);

            while (true)
            {
                if(bstop) break;
                String s = br.readLine ();
                if (s == null) break;
                writeLogger("[" + name + "] "+s);
            }
            active=false;
        }
        catch (Exception ex)
        {
            str_logger.log(Level.INFO,"Problem reading stream " + name + "... :" + ex);
            str_logger.log(Level.INFO, ZCSUtils.stack2string(ex));
        }
    }

}

