package com.bean;

import java.util.UUID;

public class UserDAOTest
{
	public static void main(String[] args)
    {
	   System.out.println(UserDAO.checkUser("admin", "admin"));
//	   String name = "test"+UUID.randomUUID();
//	   User user=new User(name,"11","test2");
//	   
//	   UserDAO.insert(user);
//	   user.setNickname("nickname");
//	   UserDAO.updateInfo(user);
//	   
//	   user.setPassword("22");
//	   UserDAO.updatePassword(user);
//	   
//	   System.out.println(UserDAO.getUserByName(name));
//	   System.out.println(UserDAO.checkHasUser("admin"));
    }
}
