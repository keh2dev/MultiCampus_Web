<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 전체 리스트</title>
<!-- 부트스트랩 5 CDN 링크 -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" integrity="sha384-rJpK8+7hzTUCv2phV7YzukUEb+q7mzFGvQ2Kj6DskDW6dPi3a3xUjKz+ag1XyDDn" crossorigin="anonymous">
<style>
	body {
		background-color: #f8f9fa;
		font-family: 'Noto Sans KR', sans-serif;
	}
	.container {
		padding-top: 50px;
	}
	.table td, .table th {
		vertical-align: middle;
		text-align: center;
		font-weight: bold;
	}
	.bg-dark {
		background-color: #343a40 !important;
	}
	.text-white {
		color: #fff !important;
	}
	.btn-primary {
		background-color: #17a2b8;
		border: none;
	}
	.btn-primary:hover {
		background-color: #0c8b9b;
	}
</style>
</head>
<body>
<div class="container">
	<div class="row justify-content-center">
		<div class="col-lg-8">
			<h2 class="text-center mb-4">게시판 전체 리스트</h2>
			<a href="bbs.jsp" class="btn btn-primary mb-4"><button>첫 페이지로</button></a>
			<hr class="border-danger mb-5">
			<table class="table table-bordered">
				<thead>
					<tr class="bg-dark text-white">
						<th scope="col">번호</th>
						<th scope="col" style="width: 300px;">제목</th>
						<th scope="col">작성자</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${list}" var="bag">
						<tr>
							<td>${bag.no}</td>
							<td><a href="one2.multi?no=${bag.no}" class="text-decoration-none">${bag.title}</a></td>
							<td>${bag.writer}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<a href="insert22.multi" class="btn btn-primary"><button>글쓰기</button></a>
		</div>
	</div>
</div>

<!-- 부트스트랩 5 의존성 라이브러리 링크 -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-a+Pf3gq3yQwUt+Zlp29Qjs1I0ys/9L/7zNfP+0a8KLJN1piFyovJcEmLnI2Qn1kf" crossorigin="anonymous"></script>
</body>
</html>
