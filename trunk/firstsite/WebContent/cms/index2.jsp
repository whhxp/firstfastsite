<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

 <% 
	String userName=request.getParameter("user");//通过标签名了得到v值
	String pwd=request.getParameter("pwd");
	if(userName==null)
		userName="";
	if(pwd==null)
		pwd="";
	
	if(!(userName.equals("admin") && pwd.equals("123")))
	{
		//request.getRequestDispatcher("./error.jsp").forward(request, response);
		request.getRequestDispatcher("./index.jsp").forward(request, response);
	 return;
	}
	
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>内容发布系统</title>


<table width="965" height="550" border="1" cellpadding="2" cellspacing="2">
  <tr>
    <td height="103" colspan="2">&nbsp;</td>
  </tr>
  <tr>
    <td width="179">&nbsp;</td>
    <td width="535">&nbsp;</td>
  </tr>
</table>

	<frameset rows="140,*" cols="*" frameborder="1"  framespacing="1" scrolling="yes" border="0">
	           <!-- 水平分割                                 是否显示框架边框            框架宽度                 -->
			  <frame src="top.jsp" name="topFrame" noresize  />
	    <frameset cols="230,*">
			  <frame src="zuo.jsp" name="mainFrame2"  />
			  
			  <frame src="info.jsp" name="mainFrame1" scrolling="yes" />
		</frameset>
	</frameset>
	
	
	
	<noframes>
	<body>
		你的浏览器不支持框架
    </body>	  
	</noframes>
</head>
<body>
   <div>栏目1 </div>
   
   
  

   
   
   
   

</body>
</html>