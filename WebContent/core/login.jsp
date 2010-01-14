<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>  
<html>
      <head>
	  	<meta http-equiv="content-type" content="text/html;charset=UTF-8" /> 
		
        <title>登录页面</title> 
      </head>
      <body>
		<%@include file="head.jsp" %>
			
			
	     <div id="context" align="center" >
         <form name="regFrm" id="regFrm" action="loginBack.jsp" method="post">			
			<table align="center">
				<tr><td>姓名：</td>
					<td><input type="text" name="user" id="user" value="" size="40" maxlength="5" style='width:200px' /></td>
					</tr>
				<tr><td>密码：</td> <td><input type="password" name="pwd" id="pwd"   value="" size="41"  style='width:200px' /></td></tr>

				<tr> <td colspan="2" align="center"> <input type="checkbox" name="isCookie" id="isCookie" value='true' >是否保存密码</input> </td> </tr>
				<tr> <td colspan="2" align="center"> <input type="reset" value="复位"  />
				&nbsp; <input type="submit" value="提交" /> </td> </tr>
			</table>
		 </form>
	     </div>
	     
         <%@include file="foot.jsp" %>         
      </body>
</html> 