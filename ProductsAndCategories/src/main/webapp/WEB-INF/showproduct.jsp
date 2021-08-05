<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title><c:out value="${product.name}"/></title>
</head>
<body>
<h1><c:out value="${product.name}"/></h1>
<h2>Description: <c:out value="${product.description}"/></h2>
<div>
<h3>Categories:</h3>
<ul>
<c:forEach items="${productcategories}" var="category">
<li>${category.name}</li>
</c:forEach>
</ul>
</div>
<div>
<form method="POST" action="/products/${product.id}/addcategory">
	<p>
		<label>Add Category:</label>
		<select name="categories">
		<c:forEach items="${categories}" var="category">
		<option value="${category.id}">${category.name}</option>
		</c:forEach>
		</select>
	</p>
	<button>Add</button>
</form>
</div>
<div>
<a href="/">Go Back</a>
</div>
</body>
</html>