<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lookify!</title>
</head>
<body>
<div class = "header">
<a href="/addNew">Add New</a>
<a href="/topTen">Top Songs</a>
<form action="/search">
	<input type=text name=artist>
	<button>Search Artists</button>
</form>
</div>
<div class="body">
<table>
    <thead>
        <tr>
            <th>Name</th>
            <th>Rating</th>
            <th>Actions</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${songlist}" var="song">
        <tr>
            <td><a href="/${song.id}"><c:out value="${song.title}"/></a></td>
            <td><c:out value="${song.rating}"/></td>
            <td><a href="/${song.id}/delete">delete</a></td>
        </tr>
        </c:forEach>
    </tbody>
</table>
</div>
</body>
</html>