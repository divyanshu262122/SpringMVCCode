<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

String name=(String)request.getAttribute("name");
Integer id=(Integer)request.getAttribute("id");

List<String> friends=(List<String>)request.getAttribute("f");

%>
<h2>i m <%=name %></h2>
<h2>i m <%=id %></h2>
<h2>i m <%=friends %></h2>
</body>
</html>