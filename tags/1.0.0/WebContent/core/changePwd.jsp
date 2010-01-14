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
			 var $=document.getElementById; 
			function checkAll(){
			  if($('pwd').value.length==0)
			  {
					alert('旧密码必须填写');
					return false;
			  }
				return true;
			} 
		</script>		
        <title>修改密码页面</title> 
      </head>
      <body>
		<%@include file="head.jsp" %>
	     <div id="context" align="center" >
  			       <form name="regFrm" id="regFrm" action="changePwdBack.jsp" method="post" onsubmit='return checkAll();'>			
			<table align="center">
				<tr><td>姓名：</td>
					<td><input type="text" name="user" id="user" value="${user.userName} " size="40" maxlength="5" style='width:200px' disabled='false'/>用户名不能修改</td>
					</tr>
				<tr><td>旧密码：</td> <td><input type="password" name="pwd" id="pwd"   value="" size="41"  style='width:200px' /></td></tr>
				<tr><td>新密码：</td> <td><input type="password" name="newpassword" id="newpassword"   value="" size="41"  style='width:200px' /></td></tr>
				<tr> <td>重复新密码：</td> <td><input type="password" name="renewpassword" id="renewpassword"   value="" size="41"  style='width:200px' /></td></tr>
				<tr> <td colspan="2" align="center"> <input type="reset" value="复位"  />
				&nbsp; <input type="submit" value="提交" /> </td> </tr>
			</table>
		 </form>
	     </div>	     
         <%@include file="foot.jsp" %>         
      </body>
</html> 