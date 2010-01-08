<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<style type="text/css">
      <!--背景-->
      <!--
       body {
	        background-image: url(images/back.jpg);
	        background-repeat:inherit;
      }
      -->
      </style>
<script type="text/javascript">
           function chkLogout()
           {
               var bol=confirm('确定要退出吗？');
               if(bol)
               {
                   location.href="*";
               }
           }  
      </script>
<table width="100%">
	<tr>
		<td>
		<table width="100%">
			<tr>
				<td align="right"><c:if test="${user==null}">
					<a href="DengLu.jsp">登录</a>
				</c:if> 
				<c:if test="${user!=null}">
					<c:out value="${user.nickname}" />--<a onclick="chkLogout()"
						href="#">退出</a>
				</c:if></td>
			</tr>
		</table>
		</td>
	</tr>
</table>