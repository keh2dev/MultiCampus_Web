<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
	background: cyan;
}
</style>
</head>
<body>
로그인 성공!<br>
${id} 님 환영합니다!
<hr>
<a href="news.jsp">
	<button style="background: yellow">뉴스사이트로</button>
</a><br>
<a href="cafe.jsp">
	<button style="background: orange">카페사이트로</button>
</a><br>
<a href="bbs.jsp">
	<button style="background: pink">게시판으로</button>
</a><br>
<a href="member.jsp">
	<button style="background: lightgreen">회원 정보</button>
</a><br>
<hr color="red">
<hr>
<img src="resources/img/yes.jpg" width="200" height="200">
</body>
</html>