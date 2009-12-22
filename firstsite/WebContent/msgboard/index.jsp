<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%
	
%>   
 
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>模板</title>
</head>
<body>
 
 	<table>
		<tr><th>用户名</th><th>密码</th><th>昵称</th><tr>
		<c:forEach items="${list}" var="item" varStatus="myIndex">
		<tr style="color:${myIndex.index%2==0?"ff0000":"00ff00"}">
		    <td> ${myIndex.index+1} </td>
		    <td>${item.id}</td>
			<td>${item.title}</td>
			<td>${item.context}</td>
			<td>${item.author}</td>
		<tr>
		</c:forEach>	
	</table>

</body>
</html>