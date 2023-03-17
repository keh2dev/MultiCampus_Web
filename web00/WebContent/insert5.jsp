<%@page import="multi.PlayerDAO"%>
<%@page import="multi.PlayerVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="bag" class="multi.PlayerVO"></jsp:useBean>
    <jsp:setProperty property="*" name="bag"/>
    
 <%
	String no = request.getParameter("no"); 
	String name = request.getParameter("name"); 
 	String height = request.getParameter("height"); 
 	String weight = request.getParameter("weight");
 	String team = request.getParameter("team");
 	String img = request.getParameter("img");
 	
 	PlayerDAO dao = new PlayerDAO();
 	dao.insert(bag);
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>선수 등록 완료</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
  </head>
<body style = "margin-left: 20px; margin-right: 20px"  >
	<h3>선수 등록 완료</h3>
	<hr>
	<a href="player.html">
		<button>첫페이지로</button>
	</a>
		<table class="table" border="1" style="width:300px">
			<tr class="table-primary">
				<td>등번호 :</td>
				<td><%= no %></td>
			</tr>
			<tr class="table-success">
				<td>이름 :</td>
				<td><%= name %></td>
			</tr>
			<tr class="table-danger">
				<td>키 :</td>
				<td><%= height %></td>
			</tr>
			<tr class="table-info">
				<td>몸무게 :</td>
				<td><%= weight %></td>
			</tr>
			<tr class="table-warning">
				<td>소속팀 :</td>
				<td><%= team %></td>
			</tr>
			<tr class="table-Secondary">
				<td>이미지 :</td>
				<td><%= img %></td>
			</tr>
		</table>

</body>
</html>