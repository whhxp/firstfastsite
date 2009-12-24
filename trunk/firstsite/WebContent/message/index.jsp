<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>    
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="org.springframework.beans.factory.*" %>
<%@ page import="org.apachechina.fsmessage.manager.*" %>
<%@ page import="org.apachechina.fscore.api.UserManager" %>
   
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<% 
	/*Spring支持*/
	BeanFactory factory = WebApplicationContextUtils
	.getRequiredWebApplicationContext(request.getSession()
			.getServletContext());
	MessageManager messageManager=(MessageManager)factory.getBean("messageManager");
	UserManager userManger=(UserManager)factory.getBean("userManager");
	 
	//
	request.setAttribute("currentUser",userManger.getCurrentUser());
	request.setAttribute("list",messageManager.getAllList());
%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>信息发送页面</title>
</head>
<body>
<table width="100%"  height="100%" border="1" >
  <tr >
    <td height="107"  colspan="3">主页连接等广告区域...
     </td>
  </tr>
  <tr>
    <td width="20%">当前用户信息条的题目列表...</td>
    <td width="69%">
	<form name="sendpage" method="post" action="">
	<p>发件人&nbsp;&nbsp;</p>
    <p>收件人&nbsp;&nbsp;<input type="text" height="20"  size="60%" name="to"></p>
    <p>主&nbsp;&nbsp;题&nbsp;&nbsp;<input type="text" height="20"  size="60%" name="theme"></p>
    <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <textarea  name="textarea" cols="60%"  rows="20"></textarea>
    </p>
    <p> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
      <input type="submit" name="Submit" value="发送">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<INPUT TYPE=button ID=btnEmergency VALUE="出现紧急情况时请按此钮!"
		onClick="alert('铃……铃……!!!!')">


    </p>
    <p>&nbsp;  </p>
	</form>
	</td>
	<td width="11%">以后要自动生成联系人的区域...</td>
	
  </tr>
</table>
</body>
</html>