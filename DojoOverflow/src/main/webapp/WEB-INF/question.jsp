<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Detail</title>
</head>
<body>
<h2><c:out value="${Q.questioninfo}"/></h2>
<div>
	<ul>
		<c:forEach items="${Q.tags}" var="tag">
			<li> ${tag.subject} </li>
		</c:forEach>
	</ul>
</div>
<div>
<h2>Answers</h2>
<c:forEach items="${Q.answer}" var="answer">
<p>${answer.answerinfo}</p>
</c:forEach>
</div>
<div>
<h3>Add An Answer</h3>
	<form:form method="POST" action="/addanswer" modelAttribute="A">
		<p>
		<form:label path="answerinfo"></form:label>
		<form:errors path="answerinfo"/>
		<form:input path="answerinfo"/>
		<form:hidden path="question" value="${Q.id}"/>
		</p>
		<button>Add Answer</button>
	</form:form>
</div>
</body>
</html>