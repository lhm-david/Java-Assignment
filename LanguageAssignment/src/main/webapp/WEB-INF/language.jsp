<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>
<c:out value = "${Language.name}"/>
<c:out value = "${Language.creator}"/>
<c:out value = "${Language.version}"/>
</h3>
<a href = "/">Dashboard</a>
<a href="/${Language.id}/edit">Edit</a>
<a href="/${Language.id}/delete">Delete</a>
</body>
</html>