<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
세션 카운트 1 증가!
<% 
	int count = (int)session.getAttribute("count");
	count++;
	session.setAttribute("count", count);
%>
<hr>
현재 세션 카운트는 <%=	session.getAttribute("count") %> , ${count}
<hr>
</body>
</html>