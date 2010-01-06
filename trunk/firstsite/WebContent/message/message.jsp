<?xml version="1.0" encoding="utf-8" ?>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>邮件信息显示页面</title>

<style type="text/css">
<!--
body {
	background-color: #F6F9FC;
}
-->
</style></head>
<body>
<table width="100%"  border="1" cellspacing="0">
      <tr>
        <td width="10%">收件人：</td>
        <td width="90%">&nbsp;</td>
      </tr>
      <tr>
        <td>发件人：</td>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td>主题：</td>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td height="236">内容：</td>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td>&nbsp;</td>
        <td>
          <input name="back" type="button" id="back" value="返回主页">
          <input name="delete" type="button" id="delete" value="删除信息">
          <input name="save" type="button" id="save" value="存至草稿箱">
       </td>
      </tr>
</table>
</body>
</html>