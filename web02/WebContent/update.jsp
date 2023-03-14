<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 브라우저가 보낸 데이터를 받아야 함.==> 자바로 짜야함! -->
   	<!-- 브라우저가 보낸 데이터를 받을 때 사용하는 부품이 필요함. -->
   	<%
   	// 자바 코드를 넣는 부분!!
   	// HttpServletRequest request = new HttpServletRequest();
   	// tomcat은 미리 request를 만들어서 내장시켜놨어요!
   	String id = request.getParameter("id");
   	String tel = request.getParameter("tel");
   	%>
   	<!-- 3.브라우저에게 결과를 알려주기 위한 html코드가 미리 들어가 있음. -->
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
회원수정 요청되었음.
<hr color="red">
수정한 id : <%= id %> <br>
수정한 tel : <%= tel %>
</body>
</html>