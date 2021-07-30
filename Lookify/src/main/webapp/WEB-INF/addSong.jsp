<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Song</title>
</head>
<body>
<div class="header">
	<a href = "/dashboard">Dashboard</a>
</div>

	<form:form action="/addNew/create" method="post" modelAttribute="song">
	    <div>
	    <p>
	        <form:label path="title">Title</form:label>
	        <form:errors path="title"/>
	        <form:input path="title"/>
	    </p>
	    <p>
	        <form:label path="artist">Artist</form:label>
	        <form:errors path="artist"/>
	        <form:input path="artist"/>
	    </p>
	    <p>
	        <form:label path="rating">Rating</form:label>
	        <form:errors path="rating"/>
	        <form:select path="rating">
		        <c:forEach var="i" begin="1" end="10">
		        	<option><c:out value = "${i}"/></option>
		        </c:forEach>
	        </form:select>
	    </p>
	    <button>Add Song</button>
	    </div>
	</form:form>
	
</body>
</html>