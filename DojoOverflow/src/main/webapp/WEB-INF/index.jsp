<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Question Dashboard</title>
</head>
<body>
<h1>Questions Dashboard</h1>
<table>
	<thead>
		<tr>
			<th>Question</th>
			<th>Tags</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${Q}" var="q">
			<tr>
			<td><a href="/${q.id}">${q.questioninfo}</a></td>
			<c:forEach items="${q.tags}" var="tag">
			<td>"${tag.subject}"</td>
			</c:forEach>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="/newquestion">New Question</a>
</body>
</html>