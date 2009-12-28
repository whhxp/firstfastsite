<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>日志编写</title>
</head>
<body>
<table>
	<tbody>
		<tr>
			<td width="17%"><span class=redColo style="color: #FF0000">*</span>
			标题：</td>
			<td width="83%"><select id=cid name=cid>
				<option value=0>请选择</option>
				<option value=1>开心</option>
				<option value=2>感伤</option>
				<option value=3>无奈</option>
			</select>&nbsp;&nbsp;&nbsp;&nbsp;<input style="height: 21px; width: 197px"/>
			</td>
		</tr>
		<tr>
		<td><span class=redColo style="color: #FF0000">*</span> 天气：</td>
		<td>
		<select name=weather>
		<option value=0>晴天</option>
		<option value=1>雨</option>
		<option value=2>阴天</option>
		<option value=3>雪</option>
		<option value=4>风</option>		
		</select>
		</td>
		</tr>
		<tr>
    <td align=center><span class=redColo style="color: #FF0000">*</span>内容:</td>
    <td>
      <div style="WIDTH: 500px"><textarea id=content style="DISPLAY: none; width: 345px" name=content rows=12 cols=40></textarea>
      
    </div>
    </td>
	</tr>
	</tbody>
</table>
</body>
</html>

