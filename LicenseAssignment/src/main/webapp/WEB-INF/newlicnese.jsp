<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New License</title>
</head>
<body>
<h2>New License</h2>
<form:form method = "POST" action="/create/newlicense"  modelAttribute = "license">
		<p>
			<form:label path="person">Person:</form:label>
			<form:select path="person">
				<c:forEach items="${persons}" var="person">
					<option value="${person.id}">${person.firstname} ${person.lastname}</option>
				</c:forEach>
			</form:select>
		</p>
		<p>	
			<form:label path="state">State:</form:label>
			<form:input path="state"></form:input>
		</p>
		<p>
			<form:label path="expiration_date">Expiration Date:</form:label>
			<form:input type="date" path="expiration_date"/>
		</p>
		<button>Create</button>
</form:form>
</body>
</html>