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
	  	<script>
	  		function regFrmCheck()
	  		{
	  			return true;
	  		}
	  	</script>	
        <title>注册页面</title> 
      </head>
      <body>
		<%@include file="head.jsp" %>
	     <div id="context" align="center" >
  		  <form name="regFrm" id="regFrm" action="regBack.jsp" method="post" onsubimt="return regFrmCheck()">			
			<table align="center">
				<tr><td>姓名：</td>
					<td><input type="text" name="user" id="user" value="" size="40" maxlength="5" style='width:200px' /></td>
					</tr>
				<tr><td>密码：</td> <td><input type="password" name="pwd" id="pwd"   value="" size="41"  style='width:200px' /></td></tr>

				<tr> <td>昵称：</td> <td><input type="text" name="nickname" id="nickname"   value="" size="41"  style='width:200px' /></td></tr>
				<tr> <td colspan="2" align="center"> <input type="reset" value="复位"  />
				&nbsp; <input type="submit" value="提交" /> </td> </tr>
			</table>
		 </form>
	     </div>	     
         <%@include file="foot.jsp" %>         
      </body>
</html> 