<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>  
<%@ page import="com.bean.*" %>
<%@ page import="com.util.*" %>
<% 
		SessionUtils.removeSession(request);
		SessionUtils.removeCookies(response);
%>

<html>
      <head>
	  	<meta http-equiv="content-type" content="text/html;charset=UTF-8" /> 		
        <title>退出页面</title> 
        <script>
        	alert('已经退出,请重新登录');
			parent.location.reload();
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