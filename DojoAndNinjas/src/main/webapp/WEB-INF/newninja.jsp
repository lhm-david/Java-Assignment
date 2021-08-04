<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Ninja</title>
</head>
<body>
<h2>New Ninja</h2>
<form:form method="POST" action="/createninja" modelAttribute="ninja">
	<p>
		<form:label path="dojo">Dojo:</form:label>
		<form:select path="dojo">
			<c:forEach items="${Dojos}" var="dojo">
				<option value="${dojo.id}">${dojo.name}</option>
			</c:forEach>
		</form:select>
	</p>
	<p>
		<form:label path="firstName">First Name:</form:label>
		<form:input path="firstName"/>
	</p>
	<p>
		<form:label path="lastName">Last Name:</form:label>
		<form:input path="lastName"/>
	</p>
	<p>
		<form:label path="age">Age:</form:label>
		<form:input path="age"/>
	</p>
	<button>Create</button>
</form:form>
</body>
</html>