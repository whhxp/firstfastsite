package com.bean;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.tool.DBO;

public class PurviewDAO
{
	static public String getNameById(int id)
	{
		
		
		Connection conn=DBO.getConn();
		Statement stat=null;
		ResultSet rs=null;
		
		try
        {
	        stat=conn.createStatement();
	        rs=stat.executeQuery("select name from purview where id="+id);
	        
	        
	        if(rs.next())
	        {
	        	String name=rs.getString("name");
	        	return name;
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

		return null;
		
	}
}
