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
		$('#result').empty()
		$.ajax({
			url : "list5",
			success : function(x) {
				$('#result').append(x)
			} //success
		}) // ajax
		
		$('#b1').click(function() {
			//기존의 것 삭제됨!
			$('#result').empty()
			$.ajax({
				url : "list5",
				success : function(x) {
					$('#result').append(x)
				} //success
			}) // ajax
		}) //b1
		
		$('#b2').click(function() {
			//기존의 것 삭제됨!
			$('#result').empty()
			$.ajax({
				url : "list6",
				data : {
					bbsno : 27
				},
				success : function(x) {
					$('#result').append(x)
				} //success
			}) // ajax
		}) //b2
	
		$('#b3').click(function() {
			//기존의 것 삭제됨!
			$('#result').empty()
			$.ajax({
				url : "list6",
				data : {
					bbsno : 7
				},
				success : function(x) {
					$('#result').append(x)
				} //success
			}) // ajax
		}) //b3
		
		$('#b4').click(function() {
			//기존의 것 삭제됨!
			$('#result').empty()
			$.ajax({
				url : "one5",
				data : {
					id : "apple"
				},
				success : function(x) {
					$('#result').append(x)
				} //success
			}) // ajax
		}) //b4
		
		$('#b5').click(function() {
			//기존의 것 삭제됨!
			$('#result').empty()
			$.ajax({
				url : "one6",
				data : {
					no : 7
				},
				success : function(x) {
					$('#result').append(x)
				} //success
			}) // ajax
		}) //b5

		$('#b6').click(function() {
			//기존의 것 삭제됨!
			$('#result').empty()
			$.ajax({
				url : "list7",
				success : function(x) {
					$('#result').append(x)
				} //success
			}) // ajax
		}) //b6
		
		$('#b7').click(function() {
			//기존의 것 삭제됨!
			$('#result').empty()
			
			var no = prompt("수정할 no를 입력하세요.")
			var content = prompt("수정할 content를 입력하세요.")
			
			$.ajax({
				url : "update",
				data : {
					no : no,
					content : content
				},
				success : function(x) {
					$('#result').append(x)
				} //success
			}) // ajax
		}) //b7
	
		$('#b8').click(function() {
			$('#result').empty()
			
			no = $('#no2').val()
			$.ajax({
				url : "delete2.multi",
				data : {
					no : no
				},
				success : function() {
					
/* 					$(function() {
						$('#result').empty()
						$.ajax({
							url : "list5",
							success : function(x) {
								$('#result').append(x)
							} //success
						})
					}) */
					
				//	return "redirect:파일명.jsp"
					
					document.location.reload()
					
				} //success
			}) // ajax
		}) //b8
		
		$('#b9').click(function() {
			$('#result').empty()
			$.ajax({
				url : 'http://api.openweathermap.org/data/2.5/weather?q=seoul&lang=kr&appid=3a203368d9097515b05f697adf45eec8&units=metric',
				success : function(x) {
						$('#result').append(
						"위치 : " + x.name +
						"<br> 날씨 : <br> <img src='http://openweathermap.org/img/w/" + x.weather[0].icon + ".png'>" +
						"<br> 기온 : " + x.main.temp
						)
				} //success
			}) // ajax
		}) //b9
		
}) //$function
	
</script>
</head>
<body>
<button id="b1">bbs리스트 가지고 오기</button> <br>
<!-- <button id="b2">bbs번호 27번 reply리스트 가지고 오기</button> <br>
<button id="b3">bbs번호 7번 reply리스트 가지고 오기</button> <br>
<button id="b4">member id가 apple인 사람의 정보 가지고 오기</button><br>
one5, id : apple, views/one5.jsp
<button id="b5">bbs no가 7인 게시물의 상세 정보 가지고 오기</button><br>
one6, no : 7, views/one6.jsp
<button id="b6">member의 모든 리스트 가지고 오기</button>
list7, id : apple, views/list7.jsp -->
<hr>
<h3>심화문제</h3>
<button id="b7">bbs수정</button><br>
삭제할 번호 : <input id="no2">  <button id="b8">bbs삭제</button><br>
<button id="b9">날씨api사용</button><br>
<hr color="red">
<div id="result" style="background: yellow"></div>
</body>
</html>