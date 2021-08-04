<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add New Person</title>
</head>
<body>
<h2>New Person</h2>
	<form:form action="/create/newperson" method = "post" modelAttribute = "person">
		<p>
			<form:label path="firstname">First Name:</form:label>
			<form:input path="firstname"/>
		</p>
		<p>	
			<form:label path="lastname">Last Name:</form:label>
			<form:input path="lastname"/>
		</p>
		<button>Create</button>
	</form:form>
</body>
</html>