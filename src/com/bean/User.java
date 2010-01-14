package com.bean;

import com.util.MD5;


public class User
{	
	
	String userName;
	String password; //从数据库中得到的内容
	String nickname;
	int purviewId; 
	int id;
	
	public User()
	{
		
	}
	
	public User(String userName, String password, String nickname) {
		this.userName = userName;
		this.password = password;
		this.nickname = nickname;
	}
	
	
	public User(int id, String userName, String password, String nickname) {
		this(userName,password,nickname);
		this.id=id;		
	}

	public String getPassword()
    {
    	return password;
    }
	public void setPassword(String password)
    {
    	this.password = password;
    }
	public String getUserName()
    {
    	return userName;
    }
	public void setUserName(String userName)
    {
    	this.userName = userName;
    }
	 
	
	public int getPurviewId() {
		return purviewId;
	}

	public void setPurviewId(int purviewId) {
		this.purviewId = purviewId;
	}

	public String toString()
	{

		return " userName="+userName+" password="+password+" nickname="+nickname;
		//+" likes="+Arrays.asList(likes);
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getId()
    {
    	return id;
    }

	public void setId(int id)
    {
    	this.id = id;
    }

	public boolean checkPassword(String newPassword)
	{
		return  MD5.encode(newPassword).equals(password);
	}
	
	public void setPasswordThenEncode(String newPassword)
	{
		password=MD5.encode(newPassword);
	}
	
	
}
