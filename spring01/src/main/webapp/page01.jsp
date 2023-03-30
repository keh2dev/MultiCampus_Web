<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	//1. 쿠키객체 생성, 브라우저에 저장할 정보 1개당 쿠키 1개
	Cookie c1 = new Cookie("category", "운동");
	Cookie c2 = new Cookie("sports", "축구");
	//2. 쿠키를 서버에서 브라우저로 보낸다!
	response.addCookie(c1);
	response.addCookie(c2);
%>
<hr>선호하는 카테고리 : 운동, 선호하는 운동 종류 : 축구를 쿠키로 저장!<br>
<a href="page02.jsp">page02.jsp 레츠고</a>
</body>
</html>