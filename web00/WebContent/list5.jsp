
<%@page import="multi.PlayerDAO"%>
<%@page import="multi.PlayerVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	
 	PlayerDAO dao = new PlayerDAO();
    //5,6)dao가 리턴한 BbsVO가 들어간 ArrayList를 받는다. 
    	ArrayList<PlayerVO> list = dao.list();
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>선수 목록 확인</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
등록된 선수 : <%= list.size()  %> 명
<% if(list.size() == 0) { %>
<h3>등록된 선수가 없습니다.</h3>
<img src="img/empty.png" width=250 height="250">
<%}else{ %>
		<table class="table" border="1" style="width:500px">
 <tr>
 	<td>등번호</td>
 	<td>이름</td>
 	<td>소속팀</td>
 </tr>
<% 
	for(PlayerVO bag2: list){
%>
 <tr>
 	<td><%= bag2.getNo() %></td>
 	<td>
 	        <!-- one4.jsp?id=102 -->
 		<a href="one5.jsp?id=<%= bag2.getNo() %>">
			<%= bag2.getName() %>
		</a>
 	</td>
 	<td><%= bag2.getTeam() %></td>
 </tr>
 <% } //for %>
 </table>
 <% } //else %>
</body>
</html>