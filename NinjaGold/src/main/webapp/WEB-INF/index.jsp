<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Ninja Gold Game</title>
	<link rel="stylesheet" href="/css/style.css"/>
</head>
<body>
	<div class = "score">
	<h3>Your Gold:<c:out value="${score}"/></h3>
	</div>
	<div class="game">
		<div class="subclass">
			<form method="POST" action="/findGold">
			<input type="hidden" value="farm" name="location">
				<h3>Farm</h3>
				<p>(earns 10-20 gold)</p>
				<button>Find Gold!</button>
			</form>
		</div>
		<div class="subclass">
			<form method="POST" action="/findGold">
			<input type="hidden" value="cave" name="location">
				<h3>Cave</h3>
				<p>(earns 5-10 gold)</p>
				<button>Find Gold!</button>
			</form>
		</div>
		<div class="subclass">
			<form method="POST" action="/findGold">
			<input type="hidden" value="house" name="location">
				<h3>House</h3>
				<p>(earns 2-5 gold)</p>
				<button>Find Gold!</button>
			</form>
		</div>
		<div class="subclass">
			<form method="POST" action="/findGold">
			<input type="hidden" value="casino" name="location">
				<h3>Casino</h3>
				<p>(earns/takes 0-50 gold)</p>
				<button>Find Gold!</button>
			</form>
		</div>
		<div class="subclass">
			<form method="POST" action="/findGold">
			<input type="hidden" value="spa" name="location">
				<h3>Spa</h3>
				<p>(takes 5-20 gold)</p>
				<button>Find Gold!</button>
			</form>
		</div>
	</div>
	<div class="showact">
		<h2>Activities:</h2>
		<a href = "/clear">Reset</a>
		<c:forEach items= "${ActivityList}" var="message">
		<p class='${message.contains("Ouch") ? "red" : "green"}'>${message} <fmt:formatDate pattern="'jspFormatway' MMMM dd, yyy hh:mm a" value="${Date}"/></p>
		
		</c:forEach>
	</div>
</body>
</html>