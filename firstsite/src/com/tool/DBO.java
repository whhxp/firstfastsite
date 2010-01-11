package com.tool;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBO {
	

	private DBO(){
		
	}
	
	static public Connection getConn()
	{
		String driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/firstsite?useUnicode=true&characterEncoding=UTF-8";
		String user="root";
		String password="root";
		
		Connection conn=null;
		try
        {
	        Class.forName(driver);/*1.加载驱动*/			
	        conn = DriverManager.getConnection(url, user, password);/*2.建立连接*/
	        return conn;
        }
        catch (Exception e)
        {
	        e.printStackTrace();
	        close(null, conn);
	        return null;
        }
	}
	
	/**
	 * 依次关闭ResultSet、Statement、Connection
	 * @param rs
	 * @param stat
	 * @param conn
	 */
	static public void close(ResultSet rs,Statement stat,Connection conn)
	{
		if(rs!=null)
		{
			try
            {
	            rs.close();
            }
            catch (SQLException e)
            {
	            e.printStackTrace();
            }
		}
		
		if(stat!=null)
		{
			try
            {
				stat.close();
            }
            catch (SQLException e)
            {
	            e.printStackTrace();
            }
		}
		
		
		if(conn!=null)
		{
			try
            {
				conn.close();
            }
            catch (SQLException e)
            {
	            e.printStackTrace();
            }
		}
		

	}
	
	/**
	 * 执行一条sql语句，返回更改了数据库中数据的条数
	 * @param sql 传入的sql
	 * @return
	 */
	static public int executeUpdate(String sql)
	{

		int result=0;
		Connection conn=DBO.getConn();
		Statement stat=null;
		
		try
        {
	        stat=conn.createStatement();
	        result=stat.executeUpdate(sql);
        }
        catch (SQLException e)
        {
	        e.printStackTrace();
        }
        finally
        {
        	DBO.close(stat, conn);
        }	
		
		return result;

	}
	
	
	/**
	 * 生成一个新的主键值，取值为表的当前最大主键值+1，如果表不包含记录，就返回1
	 * @param tableName 表名
	 * @return
	 */
	static public  int getNextId(String tableName)
	{
		int nextId = 0;
		Connection conn=DBO.getConn();
		Statement stat=null;
		ResultSet rs=null;
		
		try
		{
			stat=conn.createStatement();
			rs =stat.executeQuery("select max(ID) from " + tableName);;
			if (rs.next())
			{
				nextId = rs.getInt(1) + 1;
				if (rs.wasNull())
				{
					nextId = 1;
				}
			}
			else
			{
				nextId = 1;
			}
		}
        catch (SQLException e)
        {
	        e.printStackTrace();
        }
        finally
        {
        	DBO.close(stat, conn);
        }	
		
		return nextId;
	}
	
	
	
	/**
	 * 依次关闭Statement、Connection
	 * @param stat
	 * @param conn
	 */
	static public void close(Statement stat,Connection conn)
	{
		close(null,stat,conn);		
	}

}
