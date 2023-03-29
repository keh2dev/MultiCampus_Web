<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
	background: yellow;
}
</style>
</head>
<body>북마크 리스트<br>
<hr color="red">

	<c:forEach var = "bag" items="${list}">
		id : ${bag.id}<br>
		name : ${bag.name}<br>
		url : <a href="${bag.url}">${bag.url}</a><br>
		img : <img src="resources/img/${bag.img}">
		<hr>
	</c:forEach>
</body>
</html>