<%@page import="multi.PlayerDAO"%>
<%@page import="multi.PlayerVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 1. 전달된 값 받아주세요.(request이용) -->
    <!-- 2. dao에게 값 전달.(DAO이용) 생략-->
    <!-- 3. 전달된 값을 출력하는 결과를 브라우저에 Html로 보내주세요.  -->
 <%
 	String no = request.getParameter("no"); 
 	String team = request.getParameter("team"); 
 
 	PlayerVO bag = new PlayerVO();
 	bag.setNo(no);
 	bag.setTeam(team);
 	
 	//2.
 	
 	PlayerDAO dao = new PlayerDAO();
 	dao.update(bag);
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
수정한 등번호 : <%= no %> <br>
수정한 팀명 : <%= team %> <br>
</body>
</html>