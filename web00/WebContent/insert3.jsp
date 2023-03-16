<%@page import="multi.ProductDAO"%>
<%@page import="multi.ProductVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="bag" class="multi.ProductVO"></jsp:useBean>
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
	String name = request.getParameter("name"); 
 	String content = request.getParameter("content"); 
 	String price = request.getParameter("price");
 	String company = request.getParameter("company");
 	String img = request.getParameter("img");
 	
 
 	/* ProductVO bag = new ProductVO();
 	bag.setId(id);
 	bag.setName(name);
 	bag.setContent(content);
 	bag.setPrice(Integer.parseInt(price));
 	bag.setCompany(company);
 	bag.setImg(img); */
 	
 	//2.
 	
 	ProductDAO dao = new ProductDAO();
 	dao.insert(bag);
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
작성한 id : <%= id %> <br>
작성한 name : <%= name %> <br>
작성한 content : <%= content %> <br>
작성한 price : <%= price %> <br>
작성한 company : <%= company %> <br>
작성한 img : <%= img %> <br>
<img src="img/<%= img %>" width="200" height="200">

</body>
</html>