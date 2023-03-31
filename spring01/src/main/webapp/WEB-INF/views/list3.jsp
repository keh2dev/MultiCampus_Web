<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<title>Insert title here</title>
<style>
body {

}

th {
	text-align: center; 
	vertical-align: middle;
}

td {
	text-align: center; 
	vertical-align: middle;
}



.short {
	  
	width : 150px
}

.long {
	width : 200px
}

</style>
</head>
<body>북마크 리스트<br>
<button onclick="location.href='book.jsp'">첫 페이지로</button>
<a href="book.jsp"><button>첫페이지로~</button></a>
<hr color="red">
<table class="table" style="width: 500px">
    <thead class="table-dark">
     <tr>
        <th>ID</th>
        <th>NAME</th>
        <th>URL</th>
        <th>IMG</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var = "bag">
      <tr>
        <td class="short">${bag.id}</td>
        <td class="short">${bag.name}</td>
        <td class="long"><a href="${bag.url}">${bag.url}</a></td>
        <td><img src="resources/img/${bag.img}" width="100" height="50"></td>
      </tr>
	</c:forEach>
    </tbody>
  </table>
	
</body>
</html>