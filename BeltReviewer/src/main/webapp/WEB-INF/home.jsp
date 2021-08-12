<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Welcome</title>
</head>
<body>
<div>
	<h1>Welcome, <c:out value="${user.firstName}"/></h1>
	<a href="/logout">Logout</a>
</div>
<hr>
<div class="stateEvent">
<h4>Here are some of the events in your state:</h4>
<table>
	 <thead>
	 	<tr>
	 		<th>Name</th>
	 		<th>Date</th>
	 		<th>Location</th>
	 		<th>Host</th>
	 		<th>Action</th>
	 	</tr>
	 </thead>
	 <c:forEach items="${events}" var="event">
	 <tbody>
		 <tr>
		 <td><a href="/event/${event.id}">${event.name}</a></td>
		 <td>${event.date}</td>
		 <td>${event.location}</td>
		 <td>${event.host.firstName}</td>
		 <td>
		 <c:choose>
		 <c:when test="${event.eventUsers.contains(user)}">
		 <p>Joining</p>
		 <a href="/canceljoining/${event.id}">Cancel</a>
		 </c:when>
		 <c:when test="${event.host.equals(user)}">
		 <p><a href="/edit/${event.id}">Edit</a> <a href="/delete/${event.id}">Delete</a></p>
		 
		 </c:when>
		 <c:otherwise>
		 <a href="/joinevent/${event.id}">Join</a>
		 </c:otherwise>
		 </c:choose>
		 </td>
		 </tr>
	 </tbody>
	 </c:forEach>
</table>
</div>
<hr>
<div class="otherEvent">
<h4>Here are some other events:</h4>
<table>
	 <thead>
	 	<tr>
	 		<th>Name</th>
	 		<th>Date</th>
	 		<th>Location</th>
	 		<th>Host</th>
	 		<th>Action</th>
	 	</tr>
	 </thead>
	 <c:forEach items="${otherevents}" var="event">
	 <tbody>
		 <tr>
		 <td><a href="/event/${event.id}">${event.name}</a></td>
		 <td>${event.date}</td>
		 <td>${event.location}</td>
		 <td>${event.host.firstName}</td>
		 <td>
		 <c:choose>
		 <c:when test="${event.eventUsers.contains(user)}">
		 <p>Joining</p>
		 <a href="/canceljoining/${event.id}">Cancel</a>
		 </c:when>
		 <c:when test="${event.host.equals(user)}">
		 <p><a href="/edit/${event.id}">Edit</a> <a href="/delete/${event.id}">Delete</a></p>
		 
		 </c:when>
		 <c:otherwise>
		 <a href="/joinevent/${event.id}">Join</a>
		 </c:otherwise>
		 </c:choose>
		 </td>
		 </tr>
	 </tbody>
	 </c:forEach>
</table>
</div>
<hr>
<div>
<h3>Create an Event</h3>
<form:form method="POST" action="/newevent" modelAttribute="event">
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
        <button>Add</button>
</form:form>
</div>
</body>
</html>