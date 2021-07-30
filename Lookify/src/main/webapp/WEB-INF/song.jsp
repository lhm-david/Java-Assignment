<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Details</title>
</head>
<body>
<a href = "/dashboard">Dashboard</a>
<h3>Title</h3>
<c:out value = "${song.title}"/>
<h3>Artist</h3>
<c:out value = "${song.artist}"/>
<h3>Rating (1-10)</h3>
<c:out value = "${song.rating}"/>

<a href="/${song.id}/delete">Delete</a>
</body>
</html>