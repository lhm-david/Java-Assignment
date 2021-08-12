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
<h2><c:out value="${event.name}"/></h2>

<div>
<h3>Host:<c:out value="${event.host.firstName}"/></h3>
<h3>Date:<c:out value="${event.date}"/></h3>
<h3>Location:<c:out value="${event.location}"/>,<c:out value="${event.state}"/></h3>
<h3>People who are attending this event:<c:out value="${event.eventUsers.size()+1}"/></h3>
</div>
<div>
	<table>
		<thead>
			<tr>
				<th>Name</th>
				<th>Location</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${event.eventUsers}" var="user">
			<tr>
					<td>${user.firstName} ${user.lastName}</td>
					<td>${user.location}</td>	
			</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
<hr>
<div class="messagewall">
<h3>Message Wall</h3>
<c:forEach items="${event.messages}" var="comment">
<p>${comment.text}</p>
<p>Posted By ${comment.userMessage.firstName}</p>

</c:forEach>
</div>
<div class="newcomment">
<h3>Add Comment:</h3>
<form:form method="POST" action="/event/${event.id}/newcomment" modelAttribute="message">
 		<p>
            <form:textarea path="text"/>
        </p>
        <form:hidden path="userMessage" value="${user.id}"/>
        <form:hidden path="eventMessage" value="${event.id}"/>
        <button>Submit</button>
</form:form>
</div>

<button><a href="/home">Go Back</a></button>
</body>
</html>