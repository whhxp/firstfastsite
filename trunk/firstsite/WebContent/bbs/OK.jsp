<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="org.apachechina.fsbbs.domain.*"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String title = request.getParameter("title");
	String gut = request.getParameter("gut");
	Date date = new Date();
	BBS bbs = new BBS(title, gut, date);
	HibernatebbsTools.addbbs(bbs);
%>

<%@page import="java.util.Date"%><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="refresh" content="1;url=firstpage.jsp" />
<title>提交成功</title>
</head>
<body>
发表成功！！！！
</body>
</html>