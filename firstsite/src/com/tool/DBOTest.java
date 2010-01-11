package com.tool;

public class DBOTest
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int result=DBO.executeUpdate("insert into user values("+DBO.getNextId("user")+",'admin','admin',2)");
		System.out.println(result);
		result=DBO.executeUpdate("insert into user values("+DBO.getNextId("user")+",'admin','admin',2)");
		System.out.println(result);
		result=DBO.executeUpdate("insert into user values("+DBO.getNextId("user")+",'admin','admin',2)");
		System.out.println(result);
		result=DBO.executeUpdate("insert into user values("+DBO.getNextId("user")+",'admin','admin',2)");
		System.out.println(result);
		
	}

}
