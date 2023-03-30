<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
<a href="delete2.multi?no=${bag.no}"><button>삭제</button></a>
<a href="update22.multi?no=${bag.no}"><button>수정</button></a>
</body>
</html>