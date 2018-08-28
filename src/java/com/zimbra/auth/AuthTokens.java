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
package com.zimbra.auth;

import java.util.HashMap;

public class AuthTokens
{
    private static HashMap<String,String> AdminAuthTokenMap = new HashMap<String,String>();
    private static HashMap<String,String> AdminSessionIDMap=new HashMap<String,String>();
    private static HashMap<String,String> NonAdminAuthTokenMap = new HashMap<String,String>();
    private static HashMap<String,String> NonAdminSessionIDMap=new HashMap<String,String>();
    private static HashMap<String,String> AdminDestAuthTokenMap = new HashMap<String,String>();
    private static HashMap<String,String> AdminDestSessionIDMap=new HashMap<String,String>();

    public static void set_admin_auth_token(String ZCSUrl,String auth_token)
    {
        if(!AdminAuthTokenMap.containsKey(ZCSUrl))
        {
            AdminAuthTokenMap.put(ZCSUrl,auth_token);
        }
    }

    public static void set_non_admin_auth_token(String ZCSUrl,String auth_token)
    {
        if(!NonAdminAuthTokenMap.containsKey(ZCSUrl))
        {
            NonAdminAuthTokenMap.put(ZCSUrl,auth_token);
        }
    }

    public static void set_dest_admin_auth_token(String ZCSUrl,String auth_token)
    {
        if(!AdminDestAuthTokenMap.containsKey(ZCSUrl))
        {
            AdminDestAuthTokenMap.put(ZCSUrl,auth_token);
        }
    }

    public static String get_admin_auth_token(String ZCSUrl)
    {
        if(AdminAuthTokenMap.containsKey(ZCSUrl))
        {
            return AdminAuthTokenMap.get(ZCSUrl);
        }
        return null;
    }

    public static String get_non_admin_auth_token(String ZCSUrl)
    {
        if(NonAdminAuthTokenMap.containsKey(ZCSUrl))
        {
            return NonAdminAuthTokenMap.get(ZCSUrl);
        }
        return null;
    }

    public static String get_dest_admin_auth_token(String ZCSUrl)
    {
        if(AdminDestAuthTokenMap.containsKey(ZCSUrl))
        {
            return AdminDestAuthTokenMap.get(ZCSUrl);
        }
        return null;
    }

    public static void set_admin_sessionid(String ZCSUrl,String sessionid)
    {
        if(!AdminSessionIDMap.containsKey(ZCSUrl))
        {
            AdminSessionIDMap.put(ZCSUrl,sessionid);
        }
    }

    public static void set_non_admin_sessionid(String ZCSUrl,String sessionid)
    {
        if(!NonAdminSessionIDMap.containsKey(ZCSUrl))
        {
            NonAdminSessionIDMap.put(ZCSUrl,sessionid);
        }
    }

    public static void set_dest_admin_sessionid(String ZCSUrl,String sessionid)
    {
        if(!AdminDestSessionIDMap.containsKey(ZCSUrl))
        {
            AdminDestSessionIDMap.put(ZCSUrl,sessionid);
        }
    }

    public static String get_admin_sessionid(String ZCSUrl)
    {
        if(AdminSessionIDMap.containsKey(ZCSUrl))
        {
            return AdminSessionIDMap.get(ZCSUrl);
        }
        return null;
    }

    public static String get_non_admin_sessionid(String ZCSUrl)
    {
        if(NonAdminSessionIDMap.containsKey(ZCSUrl))
        {
            return NonAdminSessionIDMap.get(ZCSUrl);
        }
        return null;
    }

    public static String get_dest_admin_sessionid(String ZCSUrl)
    {
        if(AdminDestSessionIDMap.containsKey(ZCSUrl))
        {
            return AdminDestSessionIDMap.get(ZCSUrl);
        }
        return null;
    }
}

