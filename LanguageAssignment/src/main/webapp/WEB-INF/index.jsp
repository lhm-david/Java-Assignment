<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Languages</title>
</head>
<body>

<table>
    <thead>
        <tr>
            <th>Name</th>
            <th>Creator</th>
            <th>Version</th>
            <th>Action</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${Languages}" var="language">
        <tr>
            <td><a href="/${language.id}"><c:out value="${language.name}"/></a></td>
            <td><c:out value="${language.creator}"/></td>
            <td><c:out value="${language.version}"/></td>
            <td><a href="/${language.id}/delete">delete</a>
				<a href="/${language.id}/edit">edit</a> </td>
        </tr>
        </c:forEach>
    </tbody>
</table>
<div>
<form:form action="/create" method="POST" modelAttribute="language">
	<h4>
	<form:label path="name">Name</form:label>
        <form:errors path="name"/>
        <form:input path="name"/>
	</h4>
	<h4>
	<form:label path="creator">Creator</form:label>
        <form:errors path="creator"/>
        <form:input path="creator"/>
	</h4>
	<h4>
	<form:label path="version">Version</form:label>
        <form:errors path="version"/>
        <form:input path="version"/>
	</h4>
	<input type="submit" value="Submit"/>
</form:form>
</div>
</body>
</html>