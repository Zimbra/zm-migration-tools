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

public class user_info
{
    public String zimbraYahooID;
    public String username;
    public String displayname;
    public String password;
    public String ZimbraAcctStatus;
    public String description;
    public String zimbraCOSId;
    public String zimbraMailCanonicalAddress;
    public String zimbraDomainAdmin;
    public String zimbraPrefMailForwardingAddress;
    //owner_yid,reg,product_type,domain,max_accounts,active_accounts, (<---PA_FIELDS)
    //emailaddr:yid:reg:fullname:farm:sledid:silo:privileges          (<---Account fields)
    public static final int OWNERYID=0;
    public static final int PA_REG=OWNERYID+1;
    public static final int PRODUCT_TYPE=PA_REG+1;
    public static final int DOAMIN = PRODUCT_TYPE+1;        
    public static final int MAX_ACCOUNTS= DOAMIN+1;        
    public static final int ACTIVE_ACCOUNTS= MAX_ACCOUNTS+1;   
    
    public static final int PA_FIELDS=ACTIVE_ACCOUNTS+1;
    
    public static final int EMAIL_ADDR=0;
    public static final int USER_YID =EMAIL_ADDR+1;
    public static final int USER_REG= USER_YID+1;
    public static final int USER_FULLNAME=USER_REG+1;    
    public static final int FARM=USER_FULLNAME+1;
    public static final int SLEDID=FARM+1;
    public static final int SILO=SLEDID+1;
    public static final int PRIVILEGES=SILO+1;
}
    	
