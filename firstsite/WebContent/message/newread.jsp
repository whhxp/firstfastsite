<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>未读信息列表</title>
<style type="text/css">

body {
	background-color: #F6F9FC;
	text-decoration: none;
}

</style>
</head>
<body>
<form action="Delete" name="msgDelete" method="post" >
 	<table width="100%" border="1" cellpadding="4" cellspacing="0">
		<c:forEach items="${listnew}" var="item" varStatus="myIndex">
		<tr >
	      <td width="6%">
		      <input type="checkbox" name="${item.id}" value="checkbox" />
	       	</td>
			<a href="./sent.jsp?id=${item.id}">
			<td width="16%">${item.thefrom}</td>
			<td width="59%">${item.title}</td>
			<td width="19%">${item.date}</td>
			</a>
		</tr>
		<tr >
		  <td>&nbsp;</td>
		  <td><input type="submit" name="Submit" value="删除选中项" /></td>
		  <td>&nbsp;</td>
		  <td>&nbsp;</td>
	    </tr>
	  </c:forEach>	
  </table>
</form>
</body>
</html>