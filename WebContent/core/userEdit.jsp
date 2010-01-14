<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>  
<%@ page import="com.bean.*" %>
<%@ page import="java.util.*" %>
<%@ page import="com.util.*" %>
<%


	String idStr=request.getParameter("id");
	if(idStr==null || idStr.equals(""))
	{
		ErrorDeal.sendError(request, response, "标识不存在,请确认你点击的是页面链接");return;
	}
	
	int id=Integer.parseInt(idStr);	
	User user=UserDAO.getUserById(id); 	

	
	String method=request.getParameter("method");
	if(method==null || !method.equals("back"))  //第一次显示edit页面
	{	
		request.setAttribute("user",user);
	}
	else   //后台提交的时候
	{
			
			String nickname=request.getParameter("nickname");
			String purviewIdStr=request.getParameter("purviewId");
			
			
			if(purviewIdStr==null || purviewIdStr.equals(""))
			{
				ErrorDeal.sendError(request, response, "权限必须填写");return;
			}			
			if(nickname==null || nickname.equals(""))
			{
				ErrorDeal.sendError(request, response, "昵称必须填写");return;
			}
			
			int purviewId=Integer.parseInt(purviewIdStr);
			user.setNickname(nickname);
			user.setPurviewId(purviewId);
			
			UserDAO.updateInfo(user);	 //更改昵称等信息	
			
			if(request.getParameter("saveStyle").equals("saveFrm"))
			{
				request.setAttribute("user",user);
			}				
			else if(request.getParameter("saveStyle").equals("submitFrm"))
			{
				response.sendRedirect("userlist.jsp");return;
			}
			else
			{
				ErrorDeal.sendError(request, response, "错误的方式");return;
			}
		
	}


	
%>

<html>
      <head>
	  	<meta http-equiv="content-type" content="text/html;charset=UTF-8" /> 	
	  	<script>
	  	
	  		var $=document.getElementById;
	  		function saveFrm()
	  		{
	  			$('saveStyle').value="saveFrm";
	  			$('editFrm').submit();
	  		}
	  		
	  		function submitFrm()
	  		{
	  			$('saveStyle').value="submitFrm";
	  			$('editFrm').submit();
	  		}
	  	</script>	
        <title>用户列表</title> 
      </head>
      <body>
		<%@include file="head.jsp" %>
	     <div id="context" align="center" >

  		<form name="editFrm" id="editFrm" action="userEdit.jsp" method="post">	
  			<input type="hidden" name="method" id="method" value="back" />	
  			<input type="hidden" name="saveStyle" id="saveStyle" value="" />	
  			<input type="hidden" name="id" id="id" value="${user.id}" />		
			<table align="center">
				<tr><td>姓名：</td>
					<td><input type="text" name="user" id="user" value="${user.userName}" size="40" maxlength="5" style='width:200px' disabled='false'/>用户名不能修改</td>
					</tr>
				<tr> <td>昵称：</td> <td><input type="text" name="nickname" id="nickname"   value="${user.nickname}" size="41"  style='width:200px' /></td></tr>
				<tr> <td>权限：</td> 
				<td>
					<select name="purviewId" id="purviewId">
						<option value="1">普通用户</option>
						<option value="2"  ${user.purviewId==2?"selected='true'":""} }>系统管理员</option>
					<select>
				</td></tr>
				
				
				<tr> <td colspan="2" align="center">
				 <input type="button"  value="保存" onclick="saveFrm()" /> &nbsp;  <input type="button"  value="提交"  onclick="submitFrm()" /> &nbsp; <input type="button" value="取消"  onclick="location.href='userlist.jsp'" /> </td> </tr>
			</table>
		 </form>
	     </div>	     
         <%@include file="foot.jsp" %>         
      </body>
</html> 