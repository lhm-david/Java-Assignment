<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo</title>
</head>
<body>
<div>
<a href=/newdojo>Add New Dojo</a>
<a href=/newninja>Add New Ninja</a>
</div>
<div>
<c:forEach items="${Dojos}" var="dojo">
<h5><a href="/${dojo.id}">${dojo.name}</a></h5>
</c:forEach>
</div>
</body>
</html>