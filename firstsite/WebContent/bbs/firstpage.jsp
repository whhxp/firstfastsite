<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="org.apachechina.fsbbs.domain.*"%>
<%@ page import="org.apachechina.fsbbs.domain.htool.*"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%
	List list = Hibernatebbs.getbbs();

    request.setAttribute("list",list);
%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta name="keyword" lang="zh-cn" content="Firstfastsit 论坛 bbs" />
<!-- 设置页面关键字 -->
<meta name="copyright" content="NIIT技术团队" />
<meta name="description" content="本站关于Firstfastsit的论坛" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>论坛首页</title>
</head>
<body>
   <table>
           <c:forEach items="${list}" var="bbs">
           
           </c:forEach>
   </table>
</body>
</html>
