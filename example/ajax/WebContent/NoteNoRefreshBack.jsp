<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%@ page import="example.ajax.*" %><%@ page import="java.util.*" %><%
	Note note=Note.getInstance();
	note.up();
	request.setAttribute("note",note);
	//request.setAttribute("br",Note.randomBr());
%>${note.upNum}