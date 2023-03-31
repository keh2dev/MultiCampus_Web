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
<hr>
시작 세션 카운트 : <%= session.getAttribute("count")%>, ${count}
<a href="session속성가지고오기2.jsp">session속성가지고오기2.jsp</a>
</body>
</html>