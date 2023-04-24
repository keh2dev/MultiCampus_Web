<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script>
</script>
</head>
<body>
    <h3>FAQ</h3>
    <hr color="red">
    <h3>FAQ 검색</h3>
    <hr color="red">
    <form action="faqOne" method="get">
        제목 <input type="search" name="title" size="60"
            placeholder="검색할 문의사항을 입력해주세요." onfocus="this.placeholder=''"
            onblur="this.placeholder='검색할 문의사항을 입력해주세요.'">
        <button type="submit">검색</button>
    </form>
    <hr color="red">
    <h3>faq 리스트</h3>
    <hr>
    <div>
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