<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page import="org.apachechina.fsnote.htool.*"%>
<%@ page import="org.apachechina.fsnote.*"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%
	List list = Hibernatenote.getnote();
    
    request.setAttribute("list",list);
%>

<%@page import="org.hibernate.cfg.HbmBinder"%>
<%@page import="org.hibernate.Hibernate"%>
<%@page import="org.apachechina.fsnote.htool.HibernateUtil"%><html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>日志管理</title>
</head>
<body>
<div style=""><c:import url="top.jsp"></c:import></div>

<div class=banner>
<div class=test>留住已经逝去的峥嵘岁月<br />
记住曾绽现的万种风情<br />
在记忆即将淡漠之时<br />
来把它重新回味<br />
</div>

</div>
<div><c:import url="head.jsp"></c:import></div>
<table width="90%" align="center">
	<tr>
		<td width="20%" valign="top">
		<table width="100%">
			<tr>
				<td><c:import url="*" /></td>
			</tr>
			<tr>
				<td>
				<table bgcolor="white" width="100%" border="1" cellspacing="0"
					cellpadding="0" bgcolor="#0564a4">
					<tr>
						<td align="center"><c:import url="*" />
						</td>
					</tr>
				</table>
				</td>
			</tr>
			<tr>
				<td><c:import url="*" /></td>
			</tr>
		</table>
		</td>
		<td width="75%" valign="top"><c:import url="*" />
		</td>
	</tr>
</table>
<c:import url="foot.jsp" />
</body>
</html>