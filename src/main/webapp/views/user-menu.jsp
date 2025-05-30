<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.html"%>

	<%
	
	String fullname = (String) session.getAttribute("fullName");
	
	%>
	<p>ようこそ！<%= fullname %>さん</p>

<%@ include file="../footer.html"%>