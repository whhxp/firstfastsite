<?xml version="1.0" encoding="utf-8" ?>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>新建邮件</title>
<style type="text/css">

body {
	background-color: #F6F9FC;
}

</style></head>

<body>
<form name="msgSave" method="post" action="msgSave.action">
  <table width="100%"  border="0">
    <tr>
      <td width="10%">收件人:</td>
      <td width="90%"><input name="addressee" type="text" size="60%"></td>
    </tr>
    <tr>
      <td>主题：</td>
      <td><input name="title" type="text" size="60%"></td>
    </tr>
    <tr>
      <td>内容：</td>
      <td><textarea name="context" cols="60%" rows="10"></textarea></td>
    </tr>
    <tr>
      <td>&nbsp;</td>
      <td><input type="submit" name="Submit" value="提交">
      <input name="save" type="button" id="save" value="保存草稿">
      <input type="checkbox" name="checkbox" value="yes">
保存 至发件箱     </td>
    </tr>
  </table>
</form>
<p>&nbsp;</p>
<p>&nbsp; </p>
</body>
</html>
