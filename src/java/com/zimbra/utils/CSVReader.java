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

import com.zimbra.zcsprov.ZmProvGenericException;

import java.io.*;

public class CSVReader
{
    private String ffqname;
    private EventNotifier eventnotifier;
    private long csvoffset;
    private long recs_number;
    private String separator;
    private final String commentPrefix="#";
    public void set_eventnotifier(EventNotifier en)
    {
        eventnotifier=en;
    }
    
    public CSVReader(String fqfname,long offset, long rec_numbers) throws FileNotFoundException
    {
        ffqname=fqfname;
        eventnotifier=null;
        csvoffset= offset;
        recs_number = rec_numbers;
        separator=",";
        //if -1, set it to highest long value
        if (rec_numbers==-1)
            recs_number=Long.MAX_VALUE;
        //check for config file existance 
        File f = new File(fqfname);
        if(!f.exists())
        {
            throw new FileNotFoundException(fqfname+" input file does not exists.");
        }
    }
    
    public void ProcessFile() throws ZmProvGenericException
    {
        long lineno=0;
        long processed_lines=0;
        BufferedReader br = null;
        FileReader fr=null;
        try 
        {
            fr=new FileReader(ffqname);
            br = new BufferedReader(fr);
            String line = null; 
            while ((line = br.readLine()) != null) 
            {
                //read if line is not comment or empty
                if (!line.startsWith(commentPrefix)&&(!(line != null && line.length() == 0)))
                {
                    lineno++;
                    //read if current lineno is greater than specified offset
                    if (lineno>=csvoffset)
                    {                      
                        //read if processed lines are less than specified records to read
                        if (processed_lines<recs_number)
                        {
                            line.trim();
                            String[] values = line.split(separator);
                            if(eventnotifier!=null)
                            {
                                eventnotifier.notifCUyevent(values);
                            }
                            else
                            {
                                throw new ZmProvGenericException("No notify event associated");
                            }
                            processed_lines++;
                        }
                        else
                        {
                            break;
                        }
                    }
                }
                else
                {
                    //System.out.println(Level.INFO, "Line is either commented or Empty. No processing done.");
                }
            }
        }
        catch (FileNotFoundException ex) 
        {
            throw new ZmProvGenericException("ProcessFile"+": ("+ffqname + ") File Not found.");
        }
        catch (IOException ex) 
        {
            throw new ZmProvGenericException("ProcessFile: "+ex.getMessage());
        }
        catch (Exception e)
        {
            throw new ZmProvGenericException("ProcessFile: "+e.getMessage());

        }
        finally 
        {
            try 
            {
                if (br != null)
                    br.close();
                if (fr !=null)
                    fr.close();
            }
            catch (IOException ex) 
            {
               throw new ZmProvGenericException("ProcessFile final exception");
            }
        }
    }
}
