
<%@page import="multi.MovieVO"%>
<%@page import="multi.MovieDAO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String location = request.getParameter("location"); 
    	MovieDAO dao = new MovieDAO();
    //5,6)dao가 리턴한 BbsVO가 들어간 ArrayList를 받는다. 
    	ArrayList<MovieVO> list2 = dao.list2(location);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
장소로 조회한 전체 영화 갯수: <%= list2.size()  %>
<% if(list2.size() == 0) { %>
<h3>등록된 영화가 없습니다.</h3>
<img src="img/empty.png" width=250 height="250">
<%}else{ %>
<table class="table table-warning table-striped">
 <tr>
 	<td>id</td>
 	<td>name</td>
 	<td>content</td>
 	<td>location</td>
 </tr>
<% 
	for(MovieVO bag2: list2){
%>
 <tr>
 	<td>
		<a href="one4.jsp?id=<%= bag2.getId() %>">
		<%= bag2.getId() %>
		</a>
		</td>
 	<td>
 	<a href="one44.jsp?title=<%= bag2.getTitle() %>">
 	<%= bag2.getTitle() %>	
 	</a></td>
 	<td><%= bag2.getContent() %></td>
 	<td><%= bag2.getLocation() %></td>
 </tr>
 <% } //for %>
 </table>
 <% } //else %>
</body>
</html>