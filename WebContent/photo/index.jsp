<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="org.apachechina.fsphoto.domain.*"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8" />
<title>相册</title>
</head>
<body>
<%@include file="head.jsp"%>

<table>
	<tr>
		<c:forEach items="${list}" var="pho">
			<td><a href="pic.action">${pho.album}</a></td>
		</c:forEach>
	</tr>
	<tr>
		<c:forEach items="${list}" var="pho">
			<td>${pho.description}</td>
		</c:forEach>
	</tr>
</table>

</body>
</html>