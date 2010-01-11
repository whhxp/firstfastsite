package org.apachechina.fscore.webfilter;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apachechina.fscore.dao.UserDao;
import org.apachechina.fscore.domain.User;


/**
 * 用户过滤器,跟用户相关的内容都放到这里
 * @author nisen.cn@gmail.com
 */
public class UserFilter implements Filter
{

	final public static String USER_NAME="user";
	
	
	String nofilter;
	String nofilterFiles[];
	String sendRedirect;
	
	static public UserDao userDao=UserDao.getInstance();
	
	
	static Log log = LogFactory.getLog(UserFilter.class);
	
	public void destroy()
    {
	   
	    
    }

	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException
    {
		
		HttpServletRequest request=(HttpServletRequest)req;
		HttpServletResponse response=(HttpServletResponse)res;
		String path=request.getServletPath();
		System.out.println(path);
		if(isInArray(path,nofilterFiles))
		{
			chain.doFilter(request, response);
		}
		else
		{	
			if(checkUser(request, response))
			{
				chain.doFilter(request, response);
			}
			else
			{
				response.sendRedirect(sendRedirect);
				return ;
			}
		}

    }
	
	private boolean isInArray(String path,String nofilterFiles[])
	{
		for (int i = 0; i < nofilterFiles.length; i++) {
			String nofilterFile=nofilterFiles[i];
			if(nofilterFile.equals(path))
			{
				return true;
			}
		}
		return false;
	}

	private boolean checkUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
	
		if(checkSession(request)) //
		{
			return true;
		}
		else{			
			if(checkCookieAddSession(request, response))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	}

	/**
	 * 检查session
	 * @param request
	 * @return
	 */
	private boolean checkSession(HttpServletRequest request)
    {
	    HttpSession session=request.getSession(false);//如果不存在返回空
		if(session==null)
		{
			return false;
		}		
		Object obj=session.getAttribute("user");
		if(obj==null)
		{
			return false;
		}
		return true;
    }
	
	
	public boolean checkCookieAddSession(HttpServletRequest request, HttpServletResponse response)
	{
		Cookie []cookies=request.getCookies();
		
		if(cookies==null || cookies.length==0)
		{
			return false;
		}
		
		String userCookieid=getCookieValue(cookies, "userCookieid");
		if(userCookieid==null)
		{
			return false;
		}
		
		User u=userDao.getUserByCookieid(userCookieid);
		
		HttpSession session=request.getSession();//如果不存在就创建
		session.setAttribute("user", u);
		
		return true;
		
	}

	public void init(FilterConfig config) throws ServletException
    {		
		nofilter=config.getInitParameter("nofilter");
		nofilterFiles=nofilter.split(",");
		sendRedirect=config.getInitParameter("sendRedirect");
		//System.out.println(Arrays.asList(nofilterFiles));
    }
	
	
	/**
	 * @param cookies 所有cookie
	 * @param name cookie的名称
	 * @return cookie的值 如果cookie不存在返回null
	 */
	public String getCookieValue(Cookie cookies[],String name)
	{
		for (int i = 0; i < cookies.length; i++)
        {
	        Cookie cookie=cookies[i];
	        if(cookie.getName().equals(name))
	        {
	        	return cookie.getValue();
	        }
        }
		return null;
		
	}
	
	
	/**
	 * 添加一个Session到request中
	 * @param request
	 * @param name
	 */
	static public void addSession(HttpServletRequest request,String name)
	{
		HttpSession session=request.getSession();//如果不存在就创建			
		User u=userDao.getUserByName(name);
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
		userDao.updateCookieid(user.getName(),userCookieid); //数据库更新		
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
