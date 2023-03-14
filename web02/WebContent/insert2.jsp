<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 1. 전달된 값 받아주세요. -->
    <%
   	String no = request.getParameter("no");
   	String title = request.getParameter("title");
	String content = request.getParameter("content");
	String writer = request.getParameter("writer");
   	%>
   	<!-- 2. DAO에게 값 전달.(DAO이용) 생략 -->
   	<!-- 3. 전달된 값을 출력하는 결과를 브라우저에 html로 보내주세요. -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body {
	background: #D7FFF1;
}
</style>
</head>
<body>
게시판 글쓰기 요청 완료!
<hr color="red">
작성한 게시물 no : <%= no %> <br>
작성한 게시물 title : <%= title %> <br>
작성한 게시물 content : <%= content %> <br>
작성한 게시물 writer : <%= writer %>
</body>
</html>