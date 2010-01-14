<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>  
<%@ page import="com.bean.*" %>
<%@ page import="java.util.*" %>
<%@ page import="com.util.*" %>
<%
	String idStr=request.getParameter("id");
	if(idStr==null || idStr.equals(""))
	{
		ErrorDeal.sendError(request, response, "标识不存在,请确认你点击的是页面链接");return;
	}
	
	int id=Integer.parseInt(idStr);
	
	boolean result=UserDAO.deleteById(id);
	if(result)
	{
		response.sendRedirect("userlist.jsp");
	}
	else
	{
		ErrorDeal.sendError(request, response, "未能删除id="+id+"的用户");return;
	}
	
%>
