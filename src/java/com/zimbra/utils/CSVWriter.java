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

import java.io.FileWriter;
import java.io.IOException;

public class CSVWriter 
{
    private String fqfile;
    private FileWriter filewriter;
    private final String separator=",";
    private final String lineSeparator = System.getProperty("line.separator");
    private boolean iquotesforempty;
    public CSVWriter(String file, boolean quotesforempty)
    {
        fqfile= file;
        iquotesforempty= quotesforempty;
        try
        {
            filewriter= new FileWriter(fqfile);
        }
        catch(IOException ioex)
        {
            ioex.printStackTrace();
        }
    }
    
    public void close()
    {
        try
        {
            filewriter.close();
        }
        catch(IOException ioex)
        {
            ioex.printStackTrace();
        }
    }
    
    public synchronized void write(String str)
    {
        try
        {
            if ((str==null)||(iquotesforempty)&&(!(str != null && str.length() == 0)))
                str="\"\"";
            filewriter.append(str);
            filewriter.append(separator);
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
    }
    
    public synchronized void writeln()
    {
        try
        {
            filewriter.append(lineSeparator);
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
        
    }
    
    public synchronized void writearr(String[] strarray)
    {
        int len= strarray.length;
        for (int i=0;i<len;i++)
        {
            try
            {
                filewriter.append(strarray[i]);
                if (i<(len-1))
                    filewriter.append(separator);
                else
                    writeln();
            }
            catch(IOException ex)
            {
                ex.printStackTrace();
            }
        }
    }
}   