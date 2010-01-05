<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户邮箱界面</title>
<style type="text/css">
<!--
.style4 {
	color: #6C92AD;
	font-style: normal;
	text-decoration: none;
}
-->
</style>
</head>
<body>
<table width="100%"  height="100%" border="0" bordercolor="#6C92AD" >
  <tr bordercolor="#FFFFFF" >
    <td height="107"  colspan="3"><table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#333333">
        <tr>
          <td class="style4"><table width="100%" border="1" cellpadding="4" cellspacing="1" bordercolor="#6C92AD" bgcolor="#DBE8F2">
              <tr>
                <td width="22%" align="center"><p><a href="../index.html" class="style4">主页</a></p>
                </td>
                <td width="18%" align="center"><a href="../chatroom" class="style4">聊天室</a></td>
                <td width="20%" align="center"><a href="../photo" class="style4">相册</a></td>
                <td width="20%" align="center"><a href="../bbs" class="style4">论坛</a></td>
                <td width="20%" align="center"><a href="../note" class="style4">日志</a></td>
              </tr>
          </table></td>
        </tr>
      </table>
    </td>
  </tr>
  <tr> 
    <td width="17%" bordercolor="#6C92AD"><table width="100%" height="100%" border="1" cellpadding="4" cellspacing="0" bordercolor="#6C92AD" bgcolor="#DBE8F2">
      <tr bgcolor="#FFFFFF">
        <td colspan="2" class="style4"><strong>邮件列表</strong></td>
      </tr>
      <tr>
        <td colspan="2" class="style4">发件</td>
      </tr>
      <tr>
        <td class="style4">&#149;</td>
        <td class="style4"><a href="./sent.jsp" class="style4" target="mainFrame">写新邮件</a></td>
      </tr>
      <tr>
        <td class="style4">&#149;</td>
        <td class="style4"><a href="#" class="style4" target="mainFrame">已发邮件</a></td>
      </tr>
      <tr>
        <td colspan="2" class="style4" >收件</td>
      </tr>
      <tr>
        <td class="style4">&#149;</td>
        <td class="style4"><a href="#" class="style4" target="mainFrame">收件箱</a></td>
      </tr>
      <tr>
        <td class="style4">&#149;</td>
        <td class="style4"><a href="#" class="style4" target="mainFrame">草稿箱</a></td>
      </tr>
      <tr>
        <td height="29" class="style4">&#149;</td>
        <td class="style4"><a href="#" class="style4" target="mainFrame">垃圾邮件</a></td>
      </tr>
      
    </table>
      <p class="style4"> 
      <p class="style4">&nbsp;</p>
    </td>
    <td width="83%" bordercolor="#FFFFFF"><span class="style4"><iframe src="sent.jsp" name="mainFrame" width="100%" height="100%" scrolling="no"></span>
    </td>
  </tr>
</table>
</body>
</html>