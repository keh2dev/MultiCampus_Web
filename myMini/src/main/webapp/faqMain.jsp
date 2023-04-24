<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>FAQ</h3>
<hr color="red">
<h3>FAQ 검색</h3>
<hr color="red">
<form action="one" method="get">
	제목 <input type="search" name="title" size="60" placeholder="검색할 문의사항을 입력해주세요." 
	onfocus="this.placeholder=''" onblur="this.placeholder='검색할 문의사항을 입력해주세요.'">
	<button type="submit">검색</button>
</form>
<hr color="red">
<div id="faqMainList">
faq 게시글 리스트
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
</div>

</body>
</html>