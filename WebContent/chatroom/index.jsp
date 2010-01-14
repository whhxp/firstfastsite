<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Sample - CKEditor</title>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8" />
<script type="text/javascript" src="./ckeditor/ckeditor.js"></script>
<script src="./ckeditor/_samples/sample.js" type="text/javascript"
	xml:space="preserve"></script>
<link href="./ckeditor/_samples/sample.css" rel="stylesheet"
	type="text/css" />

<style type="text/css">
<!--
body {
	background-image: url(image/4.png);
}
-->
</style>
</head>

<body>
	<form name="addChat" id="addChat" method="post" action="addChat.action">

<table width="871" height="609" border="1" align="center">
	<tr>
		<td width="558" valign="top"><textarea cols="88" id="messages"
			name="messages" rows="35">
 		<c:forEach items="${messages}" var="message" varStatus="myIndex">
		   ${message.author}: ${message.context}
		</c:forEach>	
		
	      </textarea></td>
		<td width="126" rowspan="2" valign="top">

		<table>
			<tr>
				<th>昵称</th>
				<tr>
					<c:forEach items="${list}" var="item" varStatus="myIndex">
						<td>&nbsp;&nbsp;${item.name}</td>
						<tr>
					</c:forEach>
		</table>
		</td>
	</tr>
	<tr>

		<td height="164" valign="top">
		<p><textarea cols="88" id="editor1" name="editor1" rows="10"></textarea>
		<input type="submit" value="提交" /></p>
		</td>

	</tr>
</table>
	</form>
</body>
</html>