<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% if(session.getAttribute("id")==null){ %>
<h3>로그인 화면입니다. </h3>
<hr color="red">
<form action="login" method="get">
	id : <input name="id" value="apple"><br>
	pw : <input name="pw" value="1234"><br>
	<button type="submit">서버로 전송</button>
</form>
<%} else {%>
${id}님 로그인 중 확인
<hr color="red">
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

<%} %>
<hr color="red">
</body>
</html>