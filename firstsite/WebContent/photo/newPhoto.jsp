<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" type="text/css" href="./css/button.css"></link>
<title>相册</title>
</head>
<body>
<form action="nph.action" method="post" />
<table align="center">
	<tr>
		<td>
		<ul>
			<li class="txt_1">相册名称： <input type="text" name="album"
				maxlength="20" size="15" /> <br />
			<br />
			</li>
			<li class="txt_1">相册描述: <br />
			<textarea name="description" cols="40" rows="10"></textarea></li>
		</ul>
		</td>
	</tr>
	<tr>
		<td align="right"><br />
		<br />
		<input type="submit" class="btn1" value="确定" /> &nbsp;&nbsp; <input
			type="button" class="btn1" value="取消" /></td>
	</tr>
</table>
</body>
</html>