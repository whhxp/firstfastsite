package com.filter;

import java.io.IOException;

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

import com.bean.User;
import com.bean.UserDAO;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class UserFilter implements Filter
{
	static Log log = LogFactory.getLog(UserFilter.class);
	
	String nofilter;
	String nofilterFiles[];
	String sendRedirect;
	public void destroy()
    {
	   
	    
    }

	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException
    {
		
		HttpServletRequest request=(HttpServletRequest)req;
		HttpServletResponse response=(HttpServletResponse)res;
		String path=request.getServletPath();
		log.debug("userFilter getting");
		if(isInArray(path,nofilterFiles))
		{
			chain.doFilter(request, response);
			log.debug("userFilter doFilter");
		}
		else
		{	
			if(checkUser(request, response))
			{
				chain.doFilter(request, response);
				log.debug("userFilter doFilter");
			}
			else
			{
				response.sendRedirect(sendRedirect);
				log.debug("userFilter sendRedirect");
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
		User u=UserDAO.getUserByCookieid(userCookieid);
		
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
}
