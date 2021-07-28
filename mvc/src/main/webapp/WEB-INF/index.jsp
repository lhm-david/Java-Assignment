<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Books</title>
</head>
<body>
	<h1>All Books</h1>
		<table>
		    <thead>
		        <tr>
		            <th>Title</th>
		            <th>Description</th>
		            <th>Language</th>
		            <th>Number of Pages</th>
		        </tr>
		    </thead>
		    <tbody>
		        <c:forEach items="${book}" var="book">
		        <tr>
		            <td><c:out value="${book.title}"/></td>
		            <td><c:out value="${book.description}"/></td>
		            <td><c:out value="${book.language}"/></td>
		            <td><c:out value="${book.numberOfPages}"/></td>
		            <td><form action="/${book.id}/delete" method="post">
					    <input type="hidden" name="_method" value="delete">
					    <input type="submit" value="Delete">
					    </form></td>
		        </tr>
		        </c:forEach>
		    </tbody>
		</table>
<a href="/newbook">New Book</a>

</body>
</html>