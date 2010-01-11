<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.util.*" %>
<%@ page import="com.bean.*" %>
<%
		User user=SessionUtils.getUser(request);
		if(user==null)
		{
			ErrorDeal.sendError(request, response, "请先登录");return;
		}
		
		String method=request.getParameter("method");
		if(method==null || method.equals(""))
		{
			//不进行任何操作
		}
		else if(method.equals("back"))  //表明是后台程序
		{
			String nickname=request.getParameter("nickname");
			if(nickname==null || nickname.equals(""))
			{
				ErrorDeal.sendError(request, response, "昵称必须填写");return;
			}
			
			user.setNickname(nickname);
			UserDAO.updateInfo(user);	 //更改昵称等信息				
		}
		else
		{
			ErrorDeal.sendError(request, response, "不可能到达的位置");return;		 
		}
%>	
<html>
      <head>
	  	<meta http-equiv="content-type" content="text/html;charset=UTF-8" /> 
		
        <title>编辑页面</title> 
      </head>
      <body>
		<%@include file="head.jsp" %>	
         <form name="regFrm" id="regFrm" action="edit.jsp?method=back" method="post">			
			<table align="center">
				<tr><td>姓名：</td>
					<td><input type="text" name="user" id="user" value="<%=user.getUserName() %>" size="40" maxlength="5" style='width:200px' disabled='false'/>用户名不能修改</td>
					</tr>
				<tr> <td>昵称：</td> <td><input type="text" name="nickname" id="nickname"   value="<%=user.getNickname() %>" size="41"  style='width:200px' /></td></tr>
				
				<tr> <td colspan="2" align="center"> <input type="reset" value="复位"  />
				&nbsp; <input type="submit" value="提交" /> </td> </tr>
			</table>
		 </form>
		 <%@include file="foot.jsp" %>	
</body>
</html>



