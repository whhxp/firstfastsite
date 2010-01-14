<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>  
<%@ page import="com.bean.*" %>
<%@ page import="com.util.*" %>
<% 
 	String userName=request.getParameter("user");
		String pwd=request.getParameter("pwd");
		String nickname=request.getParameter("nickname");
		if(userName==null || userName.equals(""))
		{
			ErrorDeal.sendError(request, response, "用户名不存在");return;
		}
		if(pwd==null || pwd.equals(""))
		{
			ErrorDeal.sendError(request, response, "密码未填写");return;
		}
		if(nickname==null)
		{
			nickname="";
		}
		
		
		if(UserDAO.checkHasUser(userName))
		{
			ErrorDeal.sendError(request, response, "用户名已经存在");return;
		}
		
		User user=new User(userName,pwd,nickname);
		int result=UserDAO.insert(user);
		
        if(result!=0)
        {
        	response.sendRedirect("login.jsp");
        }
        else
        {
        	ErrorDeal.sendError(request, response, "注册失败");return;
        }
%>
