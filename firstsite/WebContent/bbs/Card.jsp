<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="org.apachechina.fsbbs.domain.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${bbs.title}</title>
</head>
<body>
<dir>
	<li><a href="send.jsp">发表新帖</a></li>
	<li><a href="#">查看精华帖</a></li>
</dir>
<table width="766" border="1" align="center">
	<caption align="left">&nbsp;</caption>
	<tr>
		<td height="39" colspan="2">标题 ：${bbs.title}</td>
	</tr>
	<tr>
		<td width="92" rowspan="2">&nbsp;</td>
		<td width="658" height="57">楼主： ${bbs.date}</td>
	</tr>
	<tr>
		<td height="154">${bbs.gut}</td>
	</tr>
</table>
<br />
<br />
<br />
<form name="form3" method="post" action="Pinglunok.action"><textarea
	name="pinglun" cols="50" rows="20"></textarea> <input type="submit"
	name="Submit" value="提交"></form>

</body>
</html>