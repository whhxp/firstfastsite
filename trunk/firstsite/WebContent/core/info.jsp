<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>  
<%@ page import="com.bean.*" %>
<%@ page import="com.util.*" %>
<% 
  	User user= SessionUtils.getUser(request);
  	request.setAttribute("user",user);
%>
<html>
      <head>
	  	<meta http-equiv="content-type" content="text/html;charset=UTF-8" /> 		
        <title>主页</title> 
      </head>
      <body>
		<%@include file="head.jsp" %>
	     <div id="context" align="center" >
  			用户名：${user.userName},昵称：${user.nickname}  
	     </div>	     
         <%@include file="foot.jsp" %>         
      </body>
</html> 