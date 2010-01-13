<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>   
<%@ page import="com.bean.*" %>
<%@ page import="com.util.*" %>
<% 
  	User _niit_user= SessionUtils.getUser(request);
%>

<html>
      <head>
	  	<meta http-equiv="content-type" content="text/html;charset=UTF-8" /> 		
        <title>主页</title> 
        <style>
        	a {display:block}
        </style>
      </head>
<body> 
<span id="welcome" align="center"> 
<%if(_niit_user==null){ %>
	您未登录
<%}else{ %>
	<%=_niit_user.getUserName() %> 
<%} %>
</span><div id="bottom" align="right" > 
	<%if(_niit_user==null){ %>
	    <a target="mainFrame" href="info.jsp">主页</a> 
	    <a target="mainFrame" href="login.jsp">登录</a>   
	    <a target="mainFrame" href="reg.jsp">注册</a>  
	<%}else if(_niit_user.getPurviewId()==2){%> 
		<a target="mainFrame" href="info.jsp">主页</a>  
	    <a target="mainFrame" href="login.jsp">登录</a> 
	     <a target="mainFrame" href="reg.jsp">注册</a>  
	     <a target="mainFrame" href="edit.jsp"> 修改信息</a> 
	     <a target="mainFrame" href="userlist.jsp"> 用户列表</a> 
	     <a target="mainFrame" href="changePwd.jsp">修改密码 </a>
	      <a target="mainFrame" href="logout.jsp">退出 </a>   
	       <ul>   <li><a target="mainFrame" href="../board/index.action">留言板 </a> </li> 
  <li><a target="mainFrame" href="../cms/index.action">信息管理系统</a> </li> 
  <li><a target="mainFrame" href="../message/index.action">发送信息页面 </a> </li> 
  <li><a target="mainFrame" href="../note/index.action">日志</a></li>
  <li><a target="mainFrame" href="../photo/index.action">相册</a></li>
  <li><a target="mainFrame" href="../bbs/index.jsp">论坛</a></li>
  <li><a target="mainFrame" href="../chatroom/index.action">聊天室</a></li>
 </ul> 
 
 <div> 管理</div>
   <ul>
     <li><a target="mainFrame" href="../config-browser/index.action"> Strus.xml管理 </a> </li> 

   </ul> 
	<%}else {%> 
	   <a target="mainFrame" href="info.jsp">主页</a> 
	    <a target="mainFrame" href="login.jsp">登录</a> 
	     <a target="mainFrame" href="reg.jsp">注册</a>  
	     <a target="mainFrame" href="edit.jsp"> 修改信息</a> 
	     <a target="mainFrame" href="changePwd.jsp">修改密码 </a>
	      <a target="mainFrame" href="logout.jsp">退出 </a>    
	<%}%> 
	</div>
</body>	  
</html> 