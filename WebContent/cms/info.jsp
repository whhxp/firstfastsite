<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

	<form action="XieRu_shuJuKu.jsp" method="post" enctype="multipart/form-data" name="form1">
 <table width="513" height="408" border="1" cellpadding="2" cellspacing="2">
  <tr>
    <td width="501" height="34">标题：
      <input name="BiaoTi" type="text" size="30"> 
      &nbsp;
栏目：
<select name="select" size="1">
  <option>栏目1</option>
  <option>栏目2</option>
</select></td>
  </tr>
  <tr>
    <td height="33">简短标题：
      <input name="jianBiaoTi" type="text" size="30">
</td>
  </tr>
  <tr>
    <td height="151"> 
      <div align="left">内容： 
        <textarea name="NeiRong" cols="60" rows="10" wrap="VIRTUAL">
                  </textarea>
    </div>
      </div></td>
  </tr>
  <tr>
    <td>缩略图：<input name="Tu" type="file" size="20" />
</td>
  </tr>
  <tr>
    <td>发布时间：
      <input name="ShiJian" type="text" size="20" maxlength="20"> 
      格式：2009年01月01日</td>
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
