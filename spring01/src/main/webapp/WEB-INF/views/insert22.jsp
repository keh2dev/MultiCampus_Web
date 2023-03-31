<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<body>
<h3>게시물등록 화면입니다. </h3>
<hr>
<form action="insert2.multi" method="get">
	title : <input name="title" value="오늘은~목요일"><br>
	content : <input name="content" value="내일은~금요일"><br>
	writer : ${id} <input type="hidden" name="writer" value="${id}"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">
</body>
</html>