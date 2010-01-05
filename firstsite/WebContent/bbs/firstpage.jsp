<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="org.apachechina.fsbbs.domain.*"%>
<%@ page import="org.apachechina.fsbbs.domain.htool.*"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%
	List list = HibernatebbsTools.getbbs();
    
    request.setAttribute("list",list);
%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta name="keyword" lang="zh-cn" content="Firstfastsit 论坛 bbs" />
<!-- 设置页面关键字 -->
<meta name="copyright" content="NIIT技术团队" />
<meta name="description" content="本站关于Firstfastsit的论坛" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>论坛首页</title>
</head>
<body>
   <br/>
   <br/>
   <div align="left" style=>
     <dir>
        <li><a href="send.jsp">发表新帖</a></li> 
        <li><a href="#">查看精华帖</a></li> 
     </dir>
    </div>
   <div align="center">
   <table border="2" align="center">	
         <thead>
               <caption> 论坛</caption>
			
			<tr height="10" width="50">
			  <th>主题</th>
			  <th>作者</th>
			  <th>留言条数</th>
			  <th>浏览次数</th>
			  <th>发表时间</th>
			</tr>
         </thead> 
         <c:forEach items="${list}" var="bbs">
         <tr height="4">
            <td  align="center" width="100"><a href="#">${bbs.title}</a></td>
            <td  align="center" width="70"></td>
            <td  align="center" width="70">${bbs.liuyan}</td>
            <td  align="center" width="70">${bbs.guankan}</td>
            <td  align="center" width="70">${bbs.date}</td>
         </tr>
         </c:forEach>
   </table>
   </div>
</body>
</html>
