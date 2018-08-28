/*
 * ***** BEGIN LICENSE BLOCK *****
 * Zimbra Collaboration Suite CSharp Client
 * Copyright (C) 2009, 2010, 2013, 2014, 2016 Synacor, Inc.
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
package com.zimbra.tarformatter;

import java.util.HashMap;
import java.util.ArrayList;

public class ZtoZImportParams
{
    public String SourceZCSServer;
    public String TargetZCSServer;
    public String SrcZCSPort;
    public String TrgtZCSPort;
    public String SrcAdminUser;
    public String TrgtAdminUser;
    public String SrcAdminPwd;
    public String TrgtAdminPwd;
    public String ZimbraMailTransport;
    public String ZMResolve;
    public int Threads;
    public String cfgfile;
    public String WorkingDirectory;
    public String FailedDirectory;
    public String SuccessDirectory;
    public String LogDirectory;
    public String KeepSuccessFiles;
    public HashMap<String,String> DomainMap;
    public String SourceServerURI;
    public String TrgtServerURI;
    public ArrayList<String> AccountsList;
    public ArrayList<String> DomainList;
    public boolean debug_mig;
    public boolean IsAllAccounts;
    public String ItemTypes;

    ZtoZImportParams()
    {
        SourceZCSServer="";
        TargetZCSServer="";
        SrcZCSPort="7071";
        TrgtZCSPort="7071";
        SrcAdminUser="";
        TrgtAdminUser="";
        SrcAdminPwd="";
        TrgtAdminPwd="";
        ZimbraMailTransport="";
        ZMResolve="";
        Threads=1;
        WorkingDirectory="";
        FailedDirectory="";
        SuccessDirectory="";
        LogDirectory="";
        KeepSuccessFiles="";
        DomainMap =new HashMap<String,String>();
        SourceServerURI="";
        AccountsList=new ArrayList<String>();
        DomainList = new ArrayList<String>();
        debug_mig=false;
        IsAllAccounts=false;
        ItemTypes="";
    }
}
