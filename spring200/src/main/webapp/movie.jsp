<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript">
$(function() {
	$('#b1').click(function() {
		$.ajax({
			url : 'movie',
			data : {
				title : $('#title').val(),
				price : $('#price').val()
			},
			success : function(x) {
				alert('영화 성공')
				alert(x)
				$('#result').append(x+'<br>')
			},
			error : function() {
				alert('실패')
			}
		})
	})
	
	$('#b2').click(function() {
		$.ajax({
			url : 'fruit',
			success : function(x) {
				alert('과일 성공')
				alert(x)
				$('#result').append(x+'<br>')
			},
			error : function() {
				alert('실패')
			}
		})
	})
	
	$('#b3').click(function() {
		$.ajax({
			url : 'tour',
			success : function(x) {
				alert('여행 성공')
				alert(x)
				$('#result').append(x+'<br')
			},
			error : function() {
				alert('실패')
			}
		})
	})
})

</script>

</head>
<body>
영화 매표소
<hr>
영화제목 :
<input id="title" value="스즈메의 문단속"><br>
영화관람료 : 
<input id="price" value="15000"><br>
<input id="b1" value="영화관람 확인" type="button"><br>
<input id="b2" value="과일목록 가지고 오기" type="button"><br>
<input id="b3" value="여행목록 가지고 오기" type="button">
<hr color="red">
<div id="result"></div>
</body>
</html>