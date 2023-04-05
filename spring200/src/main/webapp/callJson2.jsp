<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {
		$('#b1').click(function() {
			$('#result').empty()
			$.ajax({
				url: "json1",
				dataType : "json",
				success : function(json) {
					id = json.id
					pw = json.pw
					name = json.name
					tel = json.tel
					$('#result').append(id + " " + pw + " " + name + " " + tel + "<br>")
				} // success
			}) // ajax
		}) //b1
		
		$('#b11').click(function() {
			$('#result').empty()
			$.ajax({
				url: "json1",
				dataType : "json",
				success: function(json) {
					id = json.id
					pw = json.pw
					name = json.name
					tel = json.tel //json에서 tel키로 값을 추출
					table = "<table><tr><td>항목명</td><td>값</td></tr>" + 
					"<tr><td>아이디</td><td>" + id +"</td></tr>" + 
					"<tr><td>패스워드</td><td>" + pw +"</td></tr>" + 
					"<tr><td>이름</td><td>" + name +"</td></tr>" + 
					"<tr><td>전화번호</td><td>" + tel +"</td></tr></table>"
					$('#result').append(table)
				} //success
			}) //ajax
		})//b11
		
		$('#b111').click(function() {
			$('#result').empty()
			$.ajax({
				url: "json1",
				dataType : "json",
				success: function(json) {
					id = json.id
					pw = json.pw
					name = json.name
					tel = json.tel //json에서 tel키로 값을 추출
					ol = "<ol><li>항목명 : 값</li>" + 
					"<li>아이디 : " + id +"</li>" + 
					"<li>패스워드 : " + pw +"</li>" + 
					"<li>이름 : " + name +"</li>" + 
					"<li>전화번호 : " + tel +"</li></ol>"
					$('#result').append(ol)
				} //success
			}) //ajax
		})//b11
		
		$('#b2').click(function() {
			$('#result').empty()
			$.ajax({
				url: "json2",
				dataType : "json",
				success: function(json) {//[{}, {id: "", name: "", pw : "", tel: ""}]
					id1 = json[1].id
					name1 = json[1].name
					$('#result').append("json배열 중 2번째 것>> " + name1 + " " + id1 + "<br>")
					
				} //success
			}) //ajax
		})//b2
		
		$('#b3').click(function() {
			$('#result').empty()
			$.ajax({
				url: "json3",
				dataType : "json",
				success: function(json) {
					no = json.no
					title = json.title
					content = json.content
					writer = json.writer 
					ol =
					"<ol><li>no : " + no +"</li>" + 
					"<li>title : " + title +"</li>" + 
					"<li>content : " + content +"</li>" + 
					"<li>writer : " + writer +"</li></ol>"
					$('#result').append(ol)
				} //success
			}) //ajax
		})//b3
		
		$('#b4').click(function() {
			$('#result').empty()
			$.ajax({
				url: "json4",
				dataType : "json",
				success: function(json) {
					no1 = json[0].no
					title1 = json[0].title
					content1 = json[0].content
					no2 = json[1].no
					title2 = json[1].title
					content2 = json[1].content
					
					$('#result').append("배열첫번째" + no1 + " " + title1 + " " + content1 + "<br>" +
							"배열두번째" + no2 + " " + title2 + " " + content2 + "<br>")
					
				} //success
			}) //ajax
		})//b4
	})
</script>
</head>
<body>
<button id="b1">컨트롤러에서 JSON을 받아오자.!</button><br>
<button id="b11">컨트롤러에서 JSON(다른 모양, table, li)을 받아오자.!</button><br>
<button id="b111">컨트롤러에서 JSON(다른 모양, table, li)2을 받아오자.!</button><br>
<button id="b2">컨트롤러에서 JSONArray를 받아오자.!</button><br>
<button id="b3">컨트롤러에서 JSON3를 받아오자.!</button><br>
<!--  bbs vo에 값을 하나 넣어서 json으로 받아와서 출력! -->
<button id="b4">컨트롤러에서 JSONArray4를 받아오자.!</button><br>
<!--  url : json4, bbs vo 2개가 들어간 arraylist를 만들어서 
      json array로 받아와서 출력!-->
<hr color="red">
<div id="result"></div>
</body>
</html>