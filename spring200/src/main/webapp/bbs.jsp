<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- 현재 게시물 조회수 ${count}--%>

<% if(session.getAttribute("id")!=null) {%>

<h4>${id}님이 로그인 중입니다.</h4>
<hr color="green">
<a href="news.jsp">
	<button style="background: yellow">뉴스사이트로</button>
</a><br>
<a href="cafe.jsp">
	<button style="background: orange">카페사이트로</button>
</a>
<br>
<a href="member.jsp">
	<button style="background: lightgreen">회원 정보</button>
</a>
<hr color="red">
<h3>게시물등록 화면입니다. </h3>
<hr>
<form action="insert2.multi" method="get">
	title : <input name="title" value="오늘은~"><br>
	content : <input name="content" value="화요일~"><br>
	writer : <input name="writer" value="${id}"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

<h3>게시물수정 화면입니다. </h3>
<hr>
<form action="update2.multi" method="get">
	no : <input name="no" value="11"><br>
	title : <input name="title" value="화요일?"><br>
	content : <input name="content" value="화요일~인가?"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

<h3>게시물삭제 화면입니다. </h3>
<hr>
<form action="delete2.multi" method="get">
	no : <input name="no" value="11"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

<% } else {%>
<br>게시물 생성 등을 하기위해 로그인 해주세요!
<a href="login.jsp"><button>로그인페이지로</button></a>
<% } %>

<hr>
<hr color="red">
<h3>게시물 리스트 전체 화면입니다. </h3>
<hr>
<a href="list2.multi">리스트 가져오기</a>
<hr color="red">

<h3>게시물검색 화면입니다. </h3>
<hr>
<form action="one2.multi" method="get">
	no : <input name="no" value="27"><br>
	<button type="submit">서버로 전송</button>
</form>

<hr color="red">
<button type="button">먹통버튼(아무 기능이 없음)</button>
</body>
</html>