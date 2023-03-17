<%@page import="multi.PlayerDAO"%>
<%@page import="multi.PlayerVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String no = request.getParameter("no"); 
    	
    PlayerDAO dao = new PlayerDAO();
    PlayerVO bag2 = dao.one(no);
    
    System.out.println(no);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>선수 검색 확인</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>


<h3>당신이 검색을 원하는 등번호는 <%= no %> </h3>

<br>
<%
	if(bag2==null){
		%>
		<br>검색값 없음
		<%
	} else {
%>
<hr color="red">
		<table class="table" border="1" style="width:500px">
			<tr class="table-primary">
				<td>등번호 :</td>
				<td><%= bag2.getNo() %></td>
			</tr>
			<tr class="table-success">
				<td>이름 :</td>
				<td><%= bag2.getName() %></td>
			</tr>
			<tr class="table-danger">
				<td>키 :</td>
				<td><%= bag2.getHeight() %></td>
			</tr>
			<tr class="table-info">
				<td>몸무게 :</td>
				<td><%= bag2.getWeight() %></td>
			</tr>
			<tr class="table-warning">
				<td>소속팀 :</td>
				<td><%= bag2.getTeam() %></td>
			</tr>
			<tr class="table-Secondary">
				<td>이미지 :</td>
				<td><img src = "img/<%=bag2.getImg()%>" width=250 height=250></td>
			</tr>
 	</table>
 		<%
	} 
%>
</body>
</html>