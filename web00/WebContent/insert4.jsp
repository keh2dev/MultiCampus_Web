<%@page import="multi.MovieDAO"%>
<%@page import="multi.MovieVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="bag" class="multi.MovieVO"></jsp:useBean>
    <jsp:setProperty property="*" name="bag"/>
    
    <!-- 1. 전달된 값 받아주세요.(request이용) -->
    <!-- 2. dao에게 값 전달.(DAO이용) 생략-->
    <!-- 3. 전달된 값을 출력하는 결과를 브라우저에 Html로 보내주세요.  -->
 <%
/*  ps.setString(1, bag.getId() ); // ps.setInt(1, no);
	ps.setString(2, bag.getName());
	ps.setString(3, bag.getContent());
	ps.setInt(4, bag.getPrice());
	ps.setString(5, bag.getCompany());
	ps.setString(6, bag.getImg()); */
 
	String id = request.getParameter("id"); 
	String title = request.getParameter("title"); 
 	String content = request.getParameter("content"); 
 	String location = request.getParameter("location");
 	String director = request.getParameter("director");
 	
 
 	/* ProductVO bag = new ProductVO();
 	bag.setId(id);
 	bag.setName(name);
 	bag.setContent(content);
 	bag.setPrice(Integer.parseInt(price));
 	bag.setCompany(company);
 	bag.setImg(img); */
 	
 	//2.
 	
 	MovieDAO dao = new MovieDAO();
 	dao.insert(bag);
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
id : <%= id %> <br>
title : <%= title %> <br>
content : <%= content %> <br>
location : <%= location %> <br>
director : <%= director %> <br>

</body>
</html>