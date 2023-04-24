<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>FAQ 검색 테스트 화면입니다. </h3>
<hr color="red">
<h3>FAQ 모든 리스트 가지고 오기</h3>
<hr>
<a href="faqList">모든 faq리스트 가지고 오기</a>
<a href="faqOne?title=테스트">테스트 포함된 faq리스트 가지고 오기<button type="submit"></button></a>
<hr color="red">

<h3>FAQ 게시글 검색</h3>
<hr>
<form action="faqOne" method="get">
	title : <input name="title" value="제목추가테스트2"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

<h3>FAQ 추가 화면입니다. </h3>
<hr>
<form action="faqInsert" method="get">
	title : <input name="title" value="제목추가테스트1"><br>
	content : <input name="content" value="내용추가테스트1"><br>
	writer : <input name="writer" value="apple"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

<h3>FAQ 수정 화면입니다. </h3>
<hr>
<form action="faqUpdate" method="get">
	no : <input name="faq_no" value=1><br>
	title : <input name="title" value="제목수정테스트1"><br>
	content : <input name="content" value="내용수정테스트1"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

<h3>FAQ 삭제 화면입니다. </h3>
<hr>
<form action="faqDelete" method="get">
	no : <input name="faq_no" value=1><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">
</body>
</html>