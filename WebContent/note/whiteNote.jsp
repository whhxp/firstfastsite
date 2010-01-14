<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>写日志</title>
</head>
<body>
<div style=""><c:import url="top.jsp"></c:import></div>
<c:import url="head.jsp" />
<form name="addFrm" id="addFrm" action="article.do?operate=add"
	method="post" onsubmit="return checkForm();"></form>
<table width="90%" align="center">
	<tr>
		<td valign="top">
		<table width="100%" bgcolor="#FFFFFF" height="408" border="1"
			cellspacing="0" cellpadding="0" bordercolor="#000000"
			bordercolordark="#0564a4" bgcolor="#0564a4">
			<tr>
				<td valign="top">
				<table width="100%">
					<tr>
						<td valign="top">标题:<input type="text" id="title"
							name="title" size="30" /></td>
					</tr>
					<tr>
						<td>分类:<select name="group" id="group">
							<c:forEach items="${requestScope.groups}" var="g">
								<option value="${g.id}">${g.name}</option>
							</c:forEach>
						</select> <!--a href="#">添加分类</a--></td>
					</tr>
					<tr>
						<td><!--input type="hidden" name="content" id="content">
                                <iframe src="Edit/editor.htm?id=content&ReadCookie=0"  frameBorder="0" marginHeight="0" marginWidth="0" scrolling="No" width="100%" height="460"></iframe-->
						<textarea rows="" cols="" style="width: 628px; height: 262px"></textarea>
						</td>
					</tr>
					<tr>
						<td><input type="submit" id="" value="发表日志" /> <input
							type="button" onclick="location.href='article.do'" value="返回" />
						</td>
					</tr>
				</table>
				</td>
			</tr>
		</table>
		</td>
	</tr>
</table>

</body>
</html>