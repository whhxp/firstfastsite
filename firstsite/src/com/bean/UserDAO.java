package com.bean;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Vector;

import com.tool.DBO;

public class UserDAO
{

	static public boolean checkUser(String name, String pwd)
	{
		User user=getUserByName(name);
		return user.checkPassword(pwd);
	}

	static public int insert(User user)
	{
		return DBO
		        .executeUpdate("insert into user(name,password,nickname)values('"
		                + user.getUserName()
		                + "','"
		                + user.getPassword()
		                + "','" + user.getNickname() + "')");
	}

	static public int updatePassword(User user)
	{
		return DBO.executeUpdate("update user set password='"
		        + user.getPassword() + "' where name='" + user.getUserName()
		        + "'");
	}

	static public int updateInfo(User user)
	{
		return DBO.executeUpdate("update user set nickname='"
		        + user.getNickname() + "' where name='" + user.getUserName()
		        + "'");
	}

	static public User getUserByName(String name)
	{
		User user = null;

		Connection conn = DBO.getConn();
		Statement stat = null;
		ResultSet rs = null;

		try
		{
			stat = conn.createStatement();
			rs = stat.executeQuery("select * from user where name='" + name
			        + "'");

			if (rs.next())
			{
				String password = rs.getString("password");
				String userName = rs.getString("name");
				String nickname = rs.getString("nickname");
				int purviewId = rs.getInt("purview_id");
				user = new User(userName, password, nickname);
				user.setId(rs.getInt("id"));
				user.setPurviewId(purviewId);
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			DBO.close(rs, stat, conn);
		}

		return user;
	}



	public static List getList()
	{

		List result = new Vector();

		Connection conn = DBO.getConn();
		ResultSet rs = null;
		Statement stat = null;

		try
		{
			stat = conn.createStatement();

			String sql = "select * from user ";
			rs = stat.executeQuery(sql);
			while (rs.next())
			{
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setUserName(rs.getString("name"));
				user.setPassword(rs.getString("password"));

				result.add(user);
			}
		}
		catch (SQLException e)
		{
			throw new RuntimeException("不能进行登陆判断", e);
		}
		finally
		{
			DBO.close(rs, stat, conn);
		}

		return result;

	}

	public static void updateCookieid(String userName, String cookieid)
	{
		String sql = "update user set cookieid='" + cookieid + "' where name='"
		        + userName + "'";
		DBO.executeUpdate(sql);
	}

	public static User getUserByCookieid(String cookieid)
	{
		User user = null;

		Connection conn = DBO.getConn();
		Statement stat = null;
		ResultSet rs = null;

		try
		{
			stat = conn.createStatement();
			rs = stat.executeQuery("select * from user where cookieid='"
			        + cookieid + "'");

			if (rs.next())
			{
				String password = rs.getString("password");
				String userName = rs.getString("name");
				String nickname = rs.getString("nickname");
				user = new User(userName, password, nickname);
				user.setId(rs.getInt("id"));
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			DBO.close(rs, stat, conn);
		}

		return user;
	}
	

	static public User getUserById(int id)
	{
		User user=null;
		
		Connection conn=DBO.getConn();
		Statement stat=null;
		ResultSet rs=null;
		
		try
        {
	        stat=conn.createStatement();
	        rs=stat.executeQuery("select * from user where id="+id);
	        
	        
	        if(rs.next())
	        {
	        	String password=rs.getString("password");
	        	String userName=rs.getString("name");
	        	String nickname=rs.getString("nickname");
	        	int purviewId=rs.getInt("purview_id");
	        	user=new User(id,userName,password,nickname);
	        	user.setPurviewId(purviewId);
	        }
        }
        catch (SQLException e)
        {
	        e.printStackTrace();
        }
        finally
        {
        	DBO.close(rs,stat, conn);
        }
			
		return user;
	}
	
	
	static public boolean checkHasUser(String name)
	{
		boolean result=false;
		
		Connection conn=DBO.getConn();
		Statement stat=null;
		ResultSet rs=null;
		
		try
        {
	        stat=conn.createStatement();
	        rs=stat.executeQuery("select * from user where name='"+name+"'");
	        
	        
	        if(rs.next())
	        {
	        	result=true;
	        }
        }
        catch (SQLException e)
        {
	        e.printStackTrace();
        }
        finally
        {
        	DBO.close(rs,stat, conn);
        }
			
		return result;
	}
	
	
	public static List getUsers(){
		
		List result=new Vector();
		
		Connection conn=DBO.getConn();
		Statement stat=null;
		ResultSet rs=null;
		
		try
        {
	        stat=conn.createStatement();
	        String sql="select * from user";
	        rs=stat.executeQuery(sql);
	        
	        
	        while(rs.next())
	        {	        
	        	String password=rs.getString("password");
	        	String userName=rs.getString("name");
	        	String nickname=rs.getString("nickname");
	        	int purviewId=rs.getInt("purview_id");
	        	int id=rs.getInt("id");
	        	User user=new User(id,userName,password,nickname);
	        	user.setPurviewId(purviewId);
	        	result.add(user);
	        }
        }
        catch (SQLException e)
        {
	        e.printStackTrace();
        }
        finally
        {
        	DBO.close(rs,stat, conn);
        }
			
		return result;
	}
	
	
	static public boolean deleteById(int id)
	{
		int result=DBO.executeUpdate("delete from user where id="+id);
		return result>=1?true:false;
	}

}
