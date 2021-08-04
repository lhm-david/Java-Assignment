<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile Page</title>
</head>
<body>
<h3><c:out value="${person.firstname}"/><c:out value="${person.lastname}"/></h3>
<h4><c:out value="${person.license.returnlicenseNumbers()}"/></h4>
<h4><c:out value="${person.license.expiration_date}"/></h4>
<h4><c:out value="${person.license.state}"/></h4>

</body>
</html>