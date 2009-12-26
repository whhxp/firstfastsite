<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%@ page  import="org.apachechina.fsphoto.domain.*" %>
<%@ page  import="java.io.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%!
	//定义,使用JSP模拟Web.xml,和Web.xml的表现完全一致
	//上传到C:\\test\\目录,没有的话会创建这个目录
	String outDir="C:/test/123";
	UploadAction action=new UploadAction(new File(outDir));
%>

<%action.process(request,response); //后台处理页%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>上传内容</title>
</head>

<body>
已经上传到服务器<%=outDir%> 目录<a href="file:///<%=outDir%>" target="_black"> 点击查看</a>
<br />
<a href="index.html"> 返回</a>
</body>
</html>
