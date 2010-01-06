<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台登陆系统</title>
</head>
<body>

<form name="form1" method="post" action="index2.jsp">
<table width="490" height="309" border="0" cellpadding="2" cellspacing="2" align="center">
  <tr>
    <td height="87"><div align="center" class="style1">JEECMS后台管理系统</div></td>
  </tr>
  <tr>
    <td height="151"><div align="center">
      <table width="478" height="113" border="0" cellpadding="2" cellspacing="2">
        <tr>
          <td width="110" height="107">&nbsp;</td>
          <td width="78"><div align="center">
            <p align="right">用户名：</p>
            <p align="right">密码：</p>
            <p align="right">验证码：</p>
          </div></td>
          <td width="142"><p>
            <input name="user" id="user" value="admin" type="text" size="15" maxlength="15">
          </p>
            <p>
              <input name="pwd" id="pwd"   value="123" type="password" size="15" maxlength="15">
            </p>
            <p>
              <input name="textfield" type="text" size="15" maxlength="15">
                  </p></td>
          <td width="112">&nbsp;</td>
        </tr>
      </table>
      <p>&nbsp;</p>
      </div></td>
  </tr>
  <tr>
    <td><div align="center">
      <input type="submit" name="Submit" value="提交">
      <input type="reset" name="Submit" value="重置">
    </div></td>
  </tr>
</table>

</form>

</body>
</html>