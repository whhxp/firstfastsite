<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.util.*" %>
<%@ page import="com.bean.*" %>

<%
		String userName=request.getParameter("user");
		String pwd=request.getParameter("pwd");
		if(userName==null)
			userName="";
		if(pwd==null)
			pwd="";

		
		if(UserDAO.checkUser(userName, pwd))
		{
			//UserDAO.setCurrentUser(u);
			SessionUtils.addSession(request, userName);	
			String isCookie=request.getParameter("isCookie");
			//System.out.println("isCookie"+isCookie);
			if("true".equals(isCookie))			
			{
				//System.out.println("------------添加cookie---------------------");
				SessionUtils.addCookies(response,SessionUtils.getUser(request));
			}			
			
			//response.sendRedirect("edit.jsp");
		}
		else
		{
			String msg="用户名或密码错误";
			request.setAttribute("errorMsg", msg);
			request.getRequestDispatcher("./error.jsp").forward(request, response);
			return ;
		}

%>

<script>
	parent.topFrame.location.reload();
	location.href="edit.jsp";	
</script>


