package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class EncodingFilter implements Filter{

	
	  private FilterConfig filterConfig;
	  private String targetEncoding = "UTF-8";

	  public void init(FilterConfig filterConfig)
	    throws ServletException
	  {
	    this.filterConfig = filterConfig;
	    this.targetEncoding = filterConfig.getInitParameter("encoding");
	  }

	  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
	    throws IOException, ServletException
	  {
	      request.setCharacterEncoding(this.targetEncoding);
	      chain.doFilter(request, response);
	  }

	  public void destroy()
	  {
	    this.filterConfig = null;
	    this.targetEncoding = null;
	  }

}
