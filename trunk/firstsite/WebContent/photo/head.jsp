<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<div id="bottom" align="right"></div>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" type="text/css" href="./css/button.css"></link>
<script language="JavaScript">
	function openWindow() {
		var popwin = window.open("newPhoto.jsp", "_blank", "menubar=no");
	}
</script>
<a href="text.html">我的相册</a>
<input type="button" value="创建相册" class="btn1" onclick=openWindow();/>