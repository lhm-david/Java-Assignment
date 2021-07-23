<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>You Lost</title>
	<link rel="stylesheet" href="/css/style.css"/>
	<script type="text/javascript" src="JS/app.js"></script>
</head>
<body>
	<script>lostalert()</script>
	<div class="end">
		<h2>Game is Over!</h2>
		<p>You were sent to debtors prison as you have too much debt !!!</p>
		<a href="/clear">Try again?</a>
	</div>
</body>
</html>