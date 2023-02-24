<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!-- if necessary for removing $ symbol from the view page shoed by expression language -->

    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- ***** using jsp expression tags ***** -->
<%
// String name=(String)request.getAttribute("name");
//int rno=(int)request.getAttribute("rno");
// LocalDateTime time=(LocalDateTime)request.getAttribute("time");
%>


<!-- ********** Jsp expression language ******* -->


<h1>This is ${name } and roll no is ${rno  }</h1>
<h1>This is help page and time is ${time }<!--  --></h1>
<h1>${mark }</h1>
</body>
</html>