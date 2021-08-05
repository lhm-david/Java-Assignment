<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Category</title>
</head>
<body>
<h1>New Category</h1>
<div>
<form:form method="POST" action="/categories/create" modelAttribute="category">
	<p>
		<form:label path="name">Name:</form:label>
		<form:input path="name"/>
	</p>
	<button>Create</button>
</form:form>
</div>
</body>
</html>