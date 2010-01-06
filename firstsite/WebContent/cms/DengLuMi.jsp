<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	String userName=request.getParameter("user");//通过标签名了得到v值
	String pwd=request.getParameter("pwd");
	if(userName==null)
		userName="";
	if(pwd==null)
		pwd="";
	
	if(userName.equals("admin") && pwd.equals("123"))
	{
		//request.getRequestDispatcher("./error.jsp").forward(request, response);
		request.getRequestDispatcher("./index2.jsp").forward(request, response);
	 
	}
	
%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>



</body>
</html>