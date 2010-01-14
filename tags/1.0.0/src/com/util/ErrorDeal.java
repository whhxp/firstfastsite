package com.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ErrorDeal
{
 
	static public void sendError(HttpServletRequest request,HttpServletResponse response,String msg)
	{
		request.setAttribute("errorMsg", msg);
		try {
			request.getRequestDispatcher("./error.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
