<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
	background: yellow;
}
td {
	width : 50px;
		text-align: center; 
	vertical-align: middle;
}

.top{
	background: black;
	color: white;
}



</style>
</head>
<body>
게시판 전체 리스트<br>
<a href="bbs.jsp"><button>첫페이지로</button></a>
<hr color="red">
 <table border="1">
	<tr class="top">
		<td>
			번호
		</td>
		<td style="width: 300px;">
			제목
		</td>
		<td>
			작성자
		</td>
	</tr>
 
<c:forEach items="${list}" var="bag">
	<tr>
		<td>
			${bag.no}
		</td>
		<td>
			<a href="one2.multi?no=${bag.no}">${bag.title}</a>
		</td>
		<td>
			${bag.writer}
		</td>
	</tr>
</c:forEach>

</table>
<br>
<a href="insert22.multi"><button>글쓰기</button></a>



</body>
</html>