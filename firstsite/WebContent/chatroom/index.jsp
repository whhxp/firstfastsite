<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>     
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%--
ChatUserList.add(UserManager.getCurrentUser)

--%>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>人在江湖</title>
</head>

<body>
<table width="871" height="628" border="1" align="center">
  <tr>
    <td width="558" height="138">&nbsp;</td>
    <td width="126" rowspan="3">&nbsp;</td>
  </tr>
  <tr>
    <td height="196">&nbsp;</td>
  </tr>
  <tr>
    <td height="106">&nbsp;</td>
  </tr>
</table>


 	<table>
		<tr><th>序号</th><th>密码</th><th>昵称</th><tr>
		<c:forEach items="${list}" var="item" varStatus="myIndex">
		<tr style="color:${myIndex.index%2==0?"ff0000":"00ff00"}">
		    <td> ${myIndex.index+1} </td>
		    <td>${item.name}</td>
		<tr>
		</c:forEach>	
	</table>
	
</body>
</html>