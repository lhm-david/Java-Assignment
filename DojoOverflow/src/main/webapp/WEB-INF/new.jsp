<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>What is your question?</h1>
<form:form method="POST" action="/addquestion" modelAttribute="Qs">
<p>
<form:label path="questioninfo">Question:</form:label>
<form:errors path="questioninfo"/>
<form:textarea path="questioninfo"/>
</p>
<p>
<form:label path="tagsFromFrontEnd">Tags (separate by comma):</form:label>
<form:errors path="tagsFromFrontEnd"/>
<form:input path="tagsFromFrontEnd"/>
<button>Submit</button>
</form:form>
</body>
</html>