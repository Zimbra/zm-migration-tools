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
package com.zimbra.common;

public class ZCSProvParams 
{
    public boolean cmdmode;
    public boolean lock;
    public boolean unlock;
    public boolean create;
    public long recordstoprocess;
    public String csvfile;
    public String ytozconfigfile;
    public String zcsurl;
    public String zcsport;
    public String zcs_nonssl_port;
    public String adminname;
    public String adminpwd;
    public String imapsyncfile;
    public String yurl;
    public String yport;
    public String yuser;
    public String ypasswd;
    public String zcsimapport;
    public String yisurl;
    public String yisport;
    public String yisfarm;
    public String default_cos;
    public String zimbraAuthMech;
    public String sbsNotifyUrl;
    public long csvrec_numbers;
    public long csvoffset;
    public boolean importyaccounts;
    public boolean importmail;
    public boolean importyab;
    public boolean changedns;
    public boolean revertdns;
    public boolean miratezflkeys;
    public boolean setflkey;
    public boolean deleteflkey;
    public boolean notifysbs;
    public boolean rmpassword;
    public boolean addzmauthmech;
    public String testpasswd; //for test purpose without UDB auth
    public String defaultpassword;
    public int threadcount;
    public boolean customrun;// no zimbraAuthMech & with default a/c pwd
    public String IMAPSyncUrl;
    public boolean excludeargs;
    public String DNSUrl;
    public String testdomainext;
    public ZCSProvParams()
    {
        cmdmode=false;
        lock=false;
        create=false;
        recordstoprocess=-1;
        csvfile=null;
        zcsurl=null;
        zcsport=null;
        adminname=null;
        adminpwd=null;
        imapsyncfile=null;
        yurl=null;
        yport=null;
        yuser=null;
        ypasswd=null;
        yisurl=null;
        yisport=null;
        yisfarm=null;
        default_cos=null;
        csvrec_numbers=-1;
        csvoffset=0;
        ytozconfigfile=null;
        importmail=false;
        importyab=false;
        importyaccounts=false;
        changedns=false;
        revertdns=false;
        miratezflkeys=false;
        setflkey=false;
        deleteflkey=false;
        notifysbs=false;
        rmpassword=false;
        addzmauthmech=false;
        zcsimapport="7143";
        sbsNotifyUrl=null;
        testpasswd=null;
        customrun=false;
        IMAPSyncUrl=null;
        excludeargs =false;
        DNSUrl=null;
        testdomainext="";
    }
}
