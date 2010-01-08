<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>   

<%@ page import="org.hibernate.Session.*"%>
<%@ page import="org.hibernate.Transaction"%>
<%@ page import="org.apachechina.fscms.domain.CMS"%>
<%@ page import="org.apachechina.fscore.api.*"%>
<%@ page import="org.hibernate.classic.Session"%>

<%
    String BiaoTi=request.getParameter("BiaoTi");
	String jianBiaoTi=request.getParameter("jianBiaoTi");
	String NeiRong=request.getParameter("NeiRong");
	String Tu=request.getParameter("Tu");
	String ShiJian=request.getParameter("ShiJian");
	
	if(BiaoTi==null)
		BiaoTi="";
	if(jianBiaoTi==null)
		jianBiaoTi="";
	if(NeiRong==null)
		NeiRong="";
	if(Tu==null)
		Tu="";
	if(ShiJian==null)
		ShiJian="";
	
    /*
    private String title; // 文章标题
	private String title_jian; // 文章简要标题
	private String gut;// 文章的内容
	private Date date;// 发表时间
	private String picture; //图片*/
    Session session1=HibernateUtil.getSessionFactory().openSession();
	    
    CMS event=new CMS(BiaoTi,jianBiaoTi,NeiRong,Tu,ShiJian);
	    
	    Transaction tx= session1.beginTransaction();
	    
	    session1.save(event);
	    
	    tx.commit();
	    
	    session1.close();
	%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	以提交成功
</body>
</html>