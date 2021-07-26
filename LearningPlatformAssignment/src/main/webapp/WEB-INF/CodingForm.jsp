<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>CodingForm</title>
</head>
<body>
	<div class="header">
		<h1>Fortran!</h1>
		<a href="/m/38/0553/0733/">Set Up</a>
		<a href="/m/38/0483/0345/">Forms</a>
		<a href="/m/38/0553/0342/">Cards</a>
		<a href="/m/26/0553/0348/">Advanced</a>
		<a href="/m/26/0483/2342/">Binary</a>
		<a href="/m/100/0123/1/">Quiz</a>
	</div>
	<div class="content">
	<input type="checkbox" name="assignment"/>
	<label for="assignment">Assignment Completed</label>
	</div>
	<div>
	<c:out value="${assignmentinfo}"/>
	</div>
</body>
</html>