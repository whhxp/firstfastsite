package com.util;

import java.util.UUID;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.User;
import com.bean.UserDAO;

public class SessionUtils
{
	final public static String USER_NAME="org.apachechina.firstsite.user";
	
	static public User getUser(HttpServletRequest request)
	{
		Object obj=request.getSession().getAttribute(USER_NAME);
		User user=(User)obj;
		return user;
	}
	
	
	/**
	 * 添加一个Session到request中
	 * @param request
	 * @param name
	 */
	static public void addSession(HttpServletRequest request,String name)
	{
		HttpSession session=request.getSession();//如果不存在就创建			
		User u=UserDAO.getUserByName(name);
		session.setAttribute(USER_NAME, u);
	}
	
	/**
	 * 让session失效
	 * @param request
	 */
	static public void removeSession(HttpServletRequest request)
	{
		HttpSession session = request.getSession();
		session.removeAttribute(USER_NAME);
		session.invalidate();
	}
	
	/**
	 * 增加cookie
	 * @param response
	 * @param user
	 */
	static public void addCookies(HttpServletResponse response,User user)
	{
		
		String userCookieid = UUID.randomUUID().toString();
		Cookie cookie=new Cookie("userCookieid",userCookieid);
		UserDAO.updateCookieid(user.getUserName(),userCookieid); //数据库更新		
		cookie.setMaxAge(60*60*24*365*2);		
		response.addCookie(cookie);

	}
	
	/**
	 * 删除cookie
	 * @param response
	 */
	static public void removeCookies(HttpServletResponse response)
	{
		
		Cookie cookie=new Cookie("userCookieid","");
		cookie.setMaxAge(0);		
		response.addCookie(cookie);
		
		//
	}
	
	
	
}
