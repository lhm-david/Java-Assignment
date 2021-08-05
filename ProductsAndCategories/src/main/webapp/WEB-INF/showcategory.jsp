<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title><c:out value="${category.name}"/></title>
</head>
<body>
<h1><c:out value="${category.name}"/></h1>

<div>
<h3>Products:</h3>
<ul>
<c:forEach items="${products}" var="product">
<li>${product.name}</li>
</c:forEach>
</ul>
</div>
<div>
<form method="POST" action="/categories/${category.id}/addproduct">
	<p>
		<label>Add Category:</label>
		<select name="products">
		<c:forEach items="${otherproducts}" var="product">
		<option value="${product.id}">${product.name}</option>
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