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
if(session == null){
	out.print("아무도 방문하지 않았어...");
} else {
	out.print("조회수 :" + session.getAttribute("count") );
}
%>

<hr>
</body>
</html>