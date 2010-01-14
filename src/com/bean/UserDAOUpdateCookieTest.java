package com.bean;

import java.util.UUID;

public class UserDAOUpdateCookieTest
{
	public static void main(String[] args)
    {
		UserDAO.updateCookieid("admin","1111");
		User user=UserDAO.getUserByCookieid("1111");
		System.out.println(user);
    }
}
