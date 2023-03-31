<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% if(session.getAttribute("id")==null) {%>

<h3>로그인 화면입니다. </h3>
<hr color="red">
<form action="login" method="get">
	id : <input name="id" value="apple"><br>
	pw : <input name="pw" value="1234"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

<h3>회원가입 화면입니다. </h3>
<hr color="red">
<form action="insert" method="get">
	id : <input name="id" value="apple"><br>
	pw : <input name="pw" value="1234"><br>
	name : <input name="name" value="park"><br>
	tel : <input name="tel" value="011"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

<% } else {%>
${id} 님이 로그인 중입니다.
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
<hr color="red">
<h3>회원 전화번호 수정 화면입니다. </h3>
<hr color="red">
<form action="update" method="get">
	id : ${id} <input type="hidden" name="id" value="${id}"><br>
	tel : <input name="tel" value="011"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

<h3>회원탈퇴 화면입니다. </h3>
<hr color="red">
<form action="delete" method="get">
	id : ${id} <input type="hidden" name="id" value="${id}"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

<% } %>
<br><br><br><br>
<hr color="green">
<h3>아래는 추가 기능으로 추후 수정 예정</h3>
<hr color="green">
<h3>전체 검색 화면입니다.</h3>
<a href="list">모든 회원정보 가지고오기!</a>

<h3>회원검색 화면입니다. </h3>
<hr color="red">
<form action="one" method="get">
	id : <input name="id" value="apple"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

<button type="button">먹통버튼(아무 기능이 없음)</button>
</body>
</html>