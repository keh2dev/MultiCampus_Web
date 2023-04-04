<%@page import="com.multi.mvc200.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript">
$(function() {
	$('#b2').click(function() {
		$.ajax({
			url : 'reply',
			data : {
				writer : $('#writer').val(),
				content : $('#content').val(),
				bbsno : $('#bbsno').val()
			},
			success : function(x) {
				alert('댓글 추가')
				alert(x)
				$('#result').append(x+'<br>')
			},
			error : function() {
				alert('실패')
			}
		})
	})
})
</script>
<style>
body {
	background: pink;
}
</style>
</head>
<body>게시물검색 처리 요청이 완료되었습니다.<br>
<a href="bbs.jsp"><button>첫페이지로</button></a>
<a href="list2.multi"><button>게시물리스트로</button></a>
<hr>
<table border="1">
	<tr>
		<td>
		no
		</td>
		<td>
		${bag.no}
		</td>
	</tr>
	<tr>
		<td>
		title
		</td>
		<td>
		${bag.title}
		</td>
	</tr>
	<tr>
		<td>
		content
		</td>
		<td>
		${bag.content}
		</td>
	</tr>
		<tr>
		<td>
		writer
		</td>
		<td>
		${bag.writer}
		</td>
	</tr>
</table>
<hr>
<%
	String id = (String)session.getAttribute("id");
	BbsVO bag = (BbsVO)request.getAttribute("bag");
	String writer = bag.getWriter();
	if(id != null){
	if(id.equals(writer)){
%>
<a href="delete2.multi?no=${bag.no}"><button>삭제</button></a>
<a href="update22.multi?no=${bag.no}"><button>수정</button></a>
<hr color="red">
<% }} %>

<!-- result내에 댓글 리스트 -->
<div id="result">
<c:forEach items="${list}" var="bag">
${bag.writer} / ${bag.content} <br>
</c:forEach>
</div>
<hr>
작성자 : <input id="writer" value="banana"> <br>
댓글 내용 : <input id="content" value="test">
<input id="bbsno" value="${bag.no}" type="hidden">
<input id="b2" value="댓글쓰기" type="button">
<hr color="red">

</body>
</html>