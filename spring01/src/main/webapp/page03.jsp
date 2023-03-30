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
	session.setAttribute("count", 100);
%>
<hr>조회수 100 세션 저장
<a href="page04.jsp">page04.jsp레츠고</a>
</body>
</html>