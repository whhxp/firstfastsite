<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>  
<%@ page import="com.bean.*" %>
<%@ page import="com.util.*" %>
<% 
		User user=SessionUtils.getUser(request);
		
		String newpassword=request.getParameter("newpassword");
		String renewpassword=request.getParameter("renewpassword");
		String password=request.getParameter("pwd");
		
		if(password==null || password.equals(""))
		{
			ErrorDeal.sendError(request, response, "旧密码没有填写");return;
		}
		if(renewpassword==null || renewpassword.equals(""))
		{
			ErrorDeal.sendError(request, response, "重复旧密码没有填写");return;
		}
		if(newpassword==null || newpassword.equals(""))
		{
			ErrorDeal.sendError(request, response, "新密码没有填写");return;
		}
		
		if(!password.equals(user.getPassword()))
		{
			ErrorDeal.sendError(request, response, "旧密码输入错误");return;
		}
		
		user.setPassword(newpassword);
		UserDAO.updatePassword(user);
		SessionUtils.removeSession(request);
%>

<html>
      <head>
	  	<meta http-equiv="content-type" content="text/html;charset=UTF-8" /> 		
        <title>退出页面</title> 
        <script>
        	alert('密码已修改,请重新登录');
        	location.href='login.jsp';
        </script>
      </head>
      <body>
		<%@include file="head.jsp" %>
	     <div id="context" align="center" >
  			如果没有正确返回请<a href="login.jsp">点击，重新登录</a>
	     </div>	     
         <%@include file="foot.jsp" %>         
      </body>
</html> 
