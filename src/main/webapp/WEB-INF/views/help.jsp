<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Name is ${name }</h1>
	<h2>Date And Time is : ${time }</h2>
	<hr>
	<c:forEach var="item" items="${l }">
		<h2>${item }</h2>
	</c:forEach>
</body>
</html>