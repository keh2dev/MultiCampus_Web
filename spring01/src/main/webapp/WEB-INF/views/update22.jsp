<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>${bag.no} 번 게시물수정 화면입니다. </h3>
<a href="bbs.jsp"><button>첫페이지로</button></a>
<a href="list2.multi"><button>게시물리스트로</button></a>
<hr>
<form action="update2.multi" method="get">
	<input type="hidden" name="no" value="${bag.no}"><br>
	title : <input name="title" value="${bag.title}"><br>
	content : <input name="content" value="${bag.content}"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">
</body>
</html>