<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<table class="table">
	<thead class="table-primary">
		<tr>
			<th style="width: 50px">writer</th>
			<th style="width: 300px">content</th>
			<th style="width: 200px">답변시간</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${list}" var="vo">
			<tr>
				<td>${vo.writer}</td>
				<td>${vo.content}</td>
				<td><fmt:formatDate value="${vo.writtentime}" 
                pattern="yyyy-MM-dd HH:mm:ss" /></td>
			</tr>
		</c:forEach>
	</tbody>
</table>