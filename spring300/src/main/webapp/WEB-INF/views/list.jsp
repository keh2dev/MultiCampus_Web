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
</style>
</head>
<body>
<!--  표현식(expression) --> 
회원검색 처리 요청이 완료되었습니다.<hr>
<!-- bag.getId()  -->
<!--model의 속성으로 전달받은 bag은 EL로 출력한다. --!>
<!-- EL: 속성으로 지정한 값 꺼내서 출력해주세요.!라는 의미! -->
<!-- 	for (String s : list) {
			
		}
 -->
<table>
<tr>
<td>id</td>
<td>pw</td>
<td>name</td>
<td>tel</td>
</tr>
<c:forEach items="${list}" var="bag">
<tr>
<td>${bag.id}</td><!-- 출력용(expression language-EL)  -->
<td>${bag.pw}</td>
<td>${bag.name}</td>
<td>${bag.tel}</td>
</tr>
</c:forEach>
</table>
</body>
</html>




