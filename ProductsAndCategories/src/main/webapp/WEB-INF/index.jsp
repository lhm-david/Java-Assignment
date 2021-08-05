<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product And Category Assignment</title>
</head>
<body>
<h1><a href="/products/new">New Product</a></h1>
<h1><a href="/categories/new">New Category</a></h1>
<hr>
<div>
<c:forEach items="${products}" var="product">
<h4><a href="/products/${product.id}">${product.name}</a></h4>
</c:forEach>
<hr>
<c:forEach items="${categories}" var="cat">
<h4><a href="/categories/${cat.id}">${cat.name}</a></h4>
</c:forEach>
</div>
</body>
</html>