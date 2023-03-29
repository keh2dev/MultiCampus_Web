<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
	background: pink;
}
</style>
</head>
<body>북마크 검색 처리 요청이 완료되었습니다.<br>
<hr>
id : ${bag.id}<br>
name : ${bag.name}<br>
url : ${bag.url}<br>
img : <img src="resources/img/${bag.img}">

</body>
</html>