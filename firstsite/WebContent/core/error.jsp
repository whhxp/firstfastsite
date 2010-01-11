<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>  
<html>
      <head>
	  	<meta http-equiv="content-type" content="text/html;charset=UTF-8" /> 	
	  	<script>
			alert('${errorMsg}');
			history.back();
	  	</script>	
        <title>错误信息</title> 
      </head>
      <body>
		<%@include file="head.jsp" %>
         <%@include file="foot.jsp" %>         
      </body>
</html> 