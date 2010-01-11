<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<table width="690" border="1" cellspacing="20" cellpadding="2">
  <tr>
    <td width="304" height="203"><div align="center">图</div></td>
    <td width="366"><table width="357" height="201" border="1" cellpadding="2" cellspacing="2">
        <tr>
          <td width="360" height="10"><img src="C:\Documents and Settings\Administrator\桌面\新建文件夹 (2)/ico_2.gif"/> 最新资讯 </td>
        </tr>
        <tr>      
          <td height="151"><div>          
	        <c:forEach items="${list}" var="item" varStatus="myIndex">
			  <p><a href="#">${item.title} </a><span>item.date</span> </p>
			</c:forEach>
          </div></td>
        </tr>
      </table></td>
  </tr>
  <tr>
    <td height="109" colspan="2"><table width="678" border="1" cellspacing="2" cellpadding="2">
      <tr>
        <td width="154" height="91">&nbsp;</td>
        <td width="154">&nbsp;</td>
        <td width="154">&nbsp;</td>
        <td width="180">&nbsp;</td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td height="126" colspan="2">&nbsp;</td>
  </tr>
  <tr>
    <td height="133" colspan="2">&nbsp;</td>
  </tr>
</table>

</body>
</html>