<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="header">
	<h3>Searched for: ${ artist }</h3>
				<form action="/search">
					<input type="text" name="artist"/>
					<button>New Search</button>
				</form>
				<a href="/dashboard">Dashboard</a>
</div>
<div>
		<table>
			<thead>
				<tr>
					<th>Title</th>
					<th>Artist</th>
					<th>Rating</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${ songbyartist }" var="song">
				<tr>
					<td><a href="/${ song.id }">${ song.title }</a></td>
					<td>${ song.artist }</td>
					<td>${ song.rating }</td>
					<td><a href="/${ song.id }/delete">Delete</a></td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
</div>
</body>
</html>