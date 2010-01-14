<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>  
<%@ page import="com.bean.*" %>
<%@ page import="java.util.*" %>
<%@ page import="com.tool.*" %>
<%@ page import="com.util.*" %>
<%
	List listUser=UserDAO.getUsers();
	
	int pageNum; //取得页数
	String pageStr=request.getParameter("page");
	try{
		pageNum=Integer.parseInt(pageStr);
	}catch(Exception e){
		pageNum=0;
	}
	
	PageResult pr=new PageResult(listUser,pageNum);
	User user1= SessionUtils.getUser(request);	
	if(user1==null || user1.getPurviewId()!=2)
	{
		ErrorDeal.sendError(request, response, "必须是管理员权限才能修改");return;
	}
%>


<html>
      <head>
	  	<meta http-equiv="content-type" content="text/html;charset=UTF-8" /> 	
	  	<script>
	  		function deleteUser(id,userName)
	  		{
	  			if(!confirm("你确认删除用户'"+userName+"'吗?"))
	  				return ;
	  			location.href="userDelete.jsp?id="+id;	  			
	  		}
	  		
	  		function changeIds()
	  		{
	  			var oIds=document.getElementsByName("ids");
	  			for(i=0;i<oIds.length;i++)
	  			{
	  				oId=oIds[i];
	  				oId.checked=!oId.checked;
	  			}
	  			//alert("更改所有ids");  			
	  		}
	  		
	  		function checkSelected()
	  		{
	  			var oIds=document.getElementsByName("ids");
	  			for(i=0;i<oIds.length;i++)
	  			{
	  				oId=oIds[i];
	  				if(oId.checked)
	  				{
	  					return true;
	  				}
	  			}
	  			alert("请选择一个用户");
	  			return false;
	  		}
	  		
	  		//alert("最大页数"+<%=pr.getPageNum()%>);
	  		
	  	</script>	
        <title>用户列表</title> 
      </head>
      <body>
		<%@include file="head.jsp" %>
	     <div id="context" align="center" >
	        <table><tr><td>
	     	<form action="userDeleteAll.jsp" method="get" name="delAllFrm" id="delAllFrm" onsubmit="return checkSelected();">
	     	<table border="1">
	     		<tr> <th> <a href="#" onclick="changeIds()">反选</a></th><th>用户名</th><th>昵称</th>  <th>权限</th> <th>操作</th></tr>
	     		<% for(int i=0;i<pr.getList().size();i++){%>
	     		    <% User user=(User)pr.getList().get(i);%>
	     			<tr>
	     			<td> <input type="checkbox" value="<%=user.getId()%>" name="ids" id="id<%=user.getId()%>" /></td>
	     			<td><%=user.getUserName()%></td><td><%=user.getNickname()%></td>
	     			<td><%=PurviewDAO.getNameById(user.getPurviewId())%></td>
	     			<td>
	     			 <a href="#" onclick="deleteUser(<%=user.getId()%>,'<%=user.getUserName()%>')">删除</a>|<a href="userEdit.jsp?id=<%=user.getId() %>">编辑</a>
	     			 </td></tr>	
	     		<%}%>
	     		<tr><td colspan="5"><div align="center" > <input type="submit" value="删除" > </div></td> </tr>
	     	</table>
  			</form>
  			</td></tr>
  			
  			<tr><td> <div align="right">  
  				<form action="userlist.jsp" method="get" name="pageFrm" id="pageFrm" onsubmit="return checkPageIndex()">
  				<a href="userlist.jsp?page=0">首页</a>
  				
  				<%if(pr.getPageIndex()!=0){ %>
  				<a href="userlist.jsp?page=<%=pr.getPageIndex()-1 %>">上一页</a>
  				<%} %>
  				
  				<%if(pr.getPageIndex()!=pr.getPageNum()-1){ %>
  				<a href="userlist.jsp?page=<%=pr.getPageIndex()+1 %>">下一页</a>
  				<%} %>
  				
  				<a href="userlist.jsp?page=<%=pr.getPageNum()-1 %>">尾页</a>
  				<input type="text" name="page" id="page"  value="<%=pr.getPageIndex()+1%>" style="width:20px" />
  				<input type="button" value="转向" onclick="submitPage()" >
  				<script language="JavaScript">
  					function submitPage()
  					{
  						//var oForm=document.getElementById("pageFrm");  						
  						//oForm.submit();
  						var oPage=document.getElementById("page");   					
  						if(!checkIsInteger(oPage.value)) 
  						{
  							alert("输入的页数必须是整数");
  							return;
  						}	
  						var pageIndex=parseInt(oPage.value)-1;
  						if(oPage.value>0 && oPage.value<=<%=pr.getPageNum()%>)	
  						{
  						 	location="userlist.jsp?page="+(parseInt(oPage.value)-1);
  						}
  						else
  						{
  							alert("输入的页数必须在1到<%=pr.getPageNum()%>之间");
  						}				
 
  					}
  					
  					
  					/**
					*校验字符串是否为整型
					*返回值：
					*如果为空，定义校验通过，      返回false
					*如果字串全部为数字，校验通过，返回true
					*如果校验不通过，              返回false     参考提示信息：输入域必须为数字！
					*/
					function checkIsInteger(str)
					{
					    //如果为空，则通过校验
					    if(str == "")
					        return false;
					    if(/^(\-?)(\d+)$/.test(str))
					        return true;
					    else
					        return false;
					}
  				</script>
  			</div>	</td></tr>
  			</table>
	     </div>	     
         <%@include file="foot.jsp" %>         
      </body>
</html> 