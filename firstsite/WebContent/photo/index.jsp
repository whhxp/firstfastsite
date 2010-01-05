<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>相册</title>
</head>
<body>
<%@include file="head.jsp"%>
<div align="center">
<table>
	<tr>
		<th>序号</th>
		<th>相册</th>
		<th>描述</th>
	</tr>
	<c:forEach items="${list}" var="item">
		<tr>
			<td>${item.id}</td>
			<td>${item.album}</td>
			<td>${item.describe}</td>
		</tr>
	</c:forEach>
</table>
</div>
</body>
</html>