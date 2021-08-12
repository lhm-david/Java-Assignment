<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title><c:out value="${event.name}"/></title>
</head>
<body>
<h1>GoT Party</h1>
<h3>Edit Event</h3>
<form:form method="POST" action="/update/${event.id}" modelAttribute="event">
 		<p>
            <form:label path="name">Name:</form:label>
            <form:input type="name" path="name"/>
        </p>
        <p>
            <form:label path="date">Date:</form:label>
            <form:input type="date" path="date"/>
        </p>
        <p>
            <form:label path="location">Location:</form:label>
            <form:input type="location" path="location"/>
            <form:select path="state">
	            <option value="CA">CA</option>
	            <option value="TX">TX</option>
	            <option value="NY">NY</option>
	            <option value="WA">WA</option>
            </form:select>
        </p>
        <form:hidden path="host" value="${user.id}"/>
        <button>Edit</button>
</form:form>
<button><a href="/home">Cancel</a></button>
</body>
</html>