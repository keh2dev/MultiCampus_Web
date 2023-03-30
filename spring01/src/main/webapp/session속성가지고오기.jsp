<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

아이디는 <%=	session.getAttribute("user") %><br>
방문 횟수는 <%=	session.getAttribute("count") %>
<hr>
</body>
</html>