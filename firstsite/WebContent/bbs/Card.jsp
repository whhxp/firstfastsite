<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="org.apachechina.fsbbs.domain.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String str = request.getParameter("id");
	long in = Long.parseLong(str);
	BBS bbs = HibernatebbsTools.getOne(in);

	request.setAttribute("bbs", bbs);
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${bbs.title}</title>
</head>
<body>
   <table>
      
   </table>
</body>
</html>