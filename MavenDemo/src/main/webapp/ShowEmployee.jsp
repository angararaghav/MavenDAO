<%@page import="com.playstation.web.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
</head>
<body>
<div class="login">
<%
	Employee empInfo = (Employee) request.getAttribute("Employee");
	out.println(empInfo);
%>

</div>
</body>
</html>