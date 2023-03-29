<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>북마크 전체검색</h3>
<hr>
<a href="list3">가져오기</a>
<hr color="red">
<h3>북마크 검색</h3>
<hr>
<form action="one3" method="get">
	id : <input name="id" value="2"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">
<h3>북마크 url 수정</h3>
<hr>
<form action="update3" method="get">
	id : <input name="id" value="4"><br>
	url : <input name="url" value="http://www.naver.com"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">
<h3>북마크 삭제</h3>
<hr>
<form action="delete3" method="get">
	id : <input name="id" value="1"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">
<h3>북마크 추가</h3>
<hr>
<form action="insert3" method="get">
	name : <input name="name" value="naver"><br>
	url : <input name="url" value="http://www.naver.com"><br>
	img : <input name="img" value="naver.png"><br>
	<button type="submit">서버로 전송</button>
</form>

</body>
</html>