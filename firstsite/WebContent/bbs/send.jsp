<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta name="keyword" lang="zh-cn" content="Firstfastsit 论坛 bbs" />
<!-- 设置页面关键字 -->
<meta name="copyright" content="NIIT技术团队" />
<meta name="description" content="本站关于Firstfastsit的论坛" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>发表帖子</title>
</head>
<body>
<div align="center">
<form style="width: 100px; height: 100px" action="OK.action" method="post">
<table>
	<caption></caption>
	<tr>
		<td>
		<h1><font size="5">标题: </font><input id="title" name="title"
			type="text" size="50"></input></h1>
		</td>
	</tr>
	<tr>
		<td><textarea id="gut" name="gut" cols="50" rows="20"> </textarea></td>
	</tr>
</table>
<h1 align="center"><input type="submit" value="提交"
	title="点击后会提交本页到服务器" name="submit1" style="width: 60px; height: 20px" />
<input type="button" value="取消" title="返回论坛主页" name="submit2"
	style="width: 60px; height: 20px" /></h1>
</form>
</div>
</body>
</html>