<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	faq 검색 게시글 리스트
	<hr>
	<table border="1">
		<tr>
			<td>no</td>
			<td>title</td>
			<td>content</td>
			<td>writer</td>
		</tr>
		<c:forEach items="${list}" var="vo">
			<tr>
				<td>${vo.faq_no}</td>
				<td>${vo.title}</td>
				<td>${vo.content}</td>
				<td>${vo.writer}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>