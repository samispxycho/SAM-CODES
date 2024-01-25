//Expression language for simplifying the data access


/*
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
		request.setAttribute("r1", "Sameer");
		//out.print(request.getAttribute("r1"));
	%>
	<h3>${requestScope.r1} </h3>    //requestScope is an implicit object
	
	<%
		session.setAttribute("ses", "samispxycho");
		//out.print(session.getAttribute("ses"));
	%>
	<h3> ${ses} </h3>       //While dealing with sessions, we dont even need requestScope implicit object
	
</body>
</html>
*/