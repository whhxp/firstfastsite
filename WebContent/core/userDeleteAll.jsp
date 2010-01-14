<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>  
<%@ page import="com.bean.*" %>
<%@ page import="java.util.*" %>
<%@ page import="com.util.*" %>
<%
	String[] ids=request.getParameterValues("ids");
	
	
	if(ids==null)
	{
		ErrorDeal.sendError(request, response, "未选中内容");return;
	}
	
	for(int i=0;i<ids.length;i++)
	{
		String idStr=ids[i];
		int id=Integer.parseInt(idStr);	
		UserDAO.deleteById(id);		
	}

	response.sendRedirect("userlist.jsp");
%>
