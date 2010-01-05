<?xml version="1.0" encoding="utf-8" ?>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">


<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>Sample - CKEditor</title>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<script type="text/javascript" src="./ckeditor/ckeditor.js"></script>
	<script src="./ckeditor/_samples/sample.js" type="text/javascript" xml:space="preserve"></script>
	<link href="./ckeditor/_samples/sample.css" rel="stylesheet" type="text/css"/>

<style type="text/css">
<!--
body {
	background-image: url(image/4.png);
}
-->
</style>
<script language="JavaScript">
			function addToMessages()
			{		

				oUserName=document.getElementById("editor1");
				oUserid=document.getElementById("messages");
				//alert(oUserName.innerHTML);
				
				oUserid.innerHTML=oUserid.innerHTML+"<br />"+oUserName.innerHTML;
			 
			}
		
		</script>
</head>

<body>
<form name="fschatroomForm" id="fschatroomForm"  method="post" >
<table width="871" height="609" border="1" align="center" >
  <tr>
    <td width="558" height="138" valign="top">
    
    <textarea  cols="90" id="chatroomadmin" name="chatroomadmin" rows="12"></textarea>
    </td>
    <td width="126" rowspan="3" valign="top">		

 	<table>
		<tr><th>昵称</th><tr>
		<c:forEach items="${list}" var="item" varStatus="myIndex">
		    <td>&nbsp;&nbsp;${item.name}</td>
		    <tr>
		</c:forEach>	
		
	</table>
	</td>
  </tr>
  <tr>
    <td height="206" valign="top" >
 	<textarea  cols="90" id="messages" name="messages" rows="17"></textarea>
	</td>
  </tr>
  <tr>
    <td height="164" valign="top"><p>	
				<textarea  cols="80" id="editor1" name="editor1" rows="10">asdf</textarea>
				<input type="button" value="提交" onclick="addToMessages();" />
			</p>
	</td> 
  </tr>
</table>
</form>
</body> 
</html>