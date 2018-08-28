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

import java.util.ArrayList;

public class DomainInfo
{
    public String name;
    public String GalMode;
    public String GalMaxresults;
    public String Notes;
    public String Description;
    public String AuthMechanism;
    public String DoaminCosID;
    public String PublicServiceHostName;
    public String DomainStatus;
    public ArrayList VirtualHosts;
    public String GalLDAPUrl;
    public String GalLDAPSearchBase;
    public String GalLDAPBindDN;
    public String GalLDAPBindPwd;
    public String GalLDAPFilter;
    public String GalAutoCLDAPFilter;
    public String ZimbraLogOutUrl;
    public String ZimbraLoginUrl;
    public String zimbraDomainMaxAccounts;
    public String preAuthkey;
    public String zimbraAuthMech;
}

