<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
<h1>Send an Omikuji</h1>
<form action="/omikuji/render" method="Post" id="form">
	<label for="number">Pick any number from 5 to 25</label>
	<input type="number" name="number"/>
	<label for="city">Enter the name of any city</label>
	<input type="text" name="city" />
	<label for="person">Enter the name of any real person</label>
	<input type="text" name="person" />
	<label for="hobby">Enter professional endeavor or hobby</label>
	<input type="text" name="hobby" />
	<label for="pet">Enter any type of living thing</label>
	<input type="text" name="pet" />
	<label for="nice">Say something nice to someone</label>
	<input type="text" name="nice" />
	<label for="submit">Send and show a friend</label>
	<input type="submit" />
	
</form>
</body>
</html>