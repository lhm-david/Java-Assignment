<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Dojo Survey Index</title>
	<link rel="stylesheet" href="/css/style.css"/>
</head>
<body>
	<div class="wrapper">
		<form method="POST" action="/submit">
			<h2>Your Name: <input type="text" name="name"></h2>
			<h2>Dojo Location:
				<select name="location">
					<option value="San-Jose">San Jose</option>
					<option value="San-Francisco">San Francisco</option>
					<option value="Seattle">Seattle</option>
				</select>
			</h2>
			<h2>Favorite Language:
				<select name="language">
				    <option value="Java">Java</option>
				    <option value="Python">Python</option>
				    <option value="C++">C++</option>
				</select>
			</h2>
			<h2>Comment(optional):</h2>
			<textarea name="comment"></textarea><br>
			<button>Submit</button>
		</form>
	</div>
</body>
</html>