<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DMV</title>
</head>
<body>
<div>
<a href=/create/person>Add New</a>
<a href=/create/license>Add License</a>
</div>

<div class="body">
<table>
    <tbody>
        <c:forEach items="${persons}" var="person">
        <tr>
            <td><a href="/${person.id}"><c:out value="${person.firstname}"/><c:out value="${person.lastname}"/></a></td>
            <td><a href="/${person.id}/delete">Delete</a></td>
        </tr>
        </c:forEach>
    </tbody>
</table>
</div>
</body>
</html>