
     <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=b11359f91c9e299d4b89d25de10ea57b"></script>
<script type="text/javascript">
	$(function() {
		
		$('#b1').click(function() {
			$('#result').empty()
			$.ajax({
				url: "json5",
				dataType : "json",
				success: function(json) {
					id1 = json.id
					pw1 = json.pw
					name1 = json.name
					tel1 = json.tel
					table = "<table><tr><td>항목명</td><td>값</td></tr>" + 
					"<tr><td>아이디</td><td>" + id1 +"</td></tr>" + 
					"<tr><td>패스워드</td><td>" + pw1 +"</td></tr>" + 
					"<tr><td>이름</td><td>" + name1 +"</td></tr>" + 
					"<tr><td>전화번호</td><td>" + tel1 +"</td></tr></table>"
					$('#result').append(table)
				} //success
			}) // ajax
		}) //b1
	
		$('#b2').click(function() {
			$('#result').empty()
			$.ajax({
				url: "json6",
				dataType : "json",
				success: function(json) {
					for (var i = 0; i < json.length; i++) {
						id1 = json[i].id
						pw1 = json[i].pw
						name1 = json[i].name
						tel1 = json[i].tel
						$('#result').append(id1 + " " + pw1 + " " + name1 + " " + tel1 + "<br>")
					}
				} //success
			}) //ajax
		})//b2
		
		$('#b3').click(function() {
			$('#result').empty()
			$.ajax({
				url: "json6",
				dataType : "json",
				success: function(json) {
					$('#result').append("<table>")
					for (var i = 0; i < json.length; i++) {
						id1 = json[i].id
						pw1 = json[i].pw
						name1 = json[i].name
						tel1 = json[i].tel
						table = "<tr><td>" + id1 + "</td><td>" + pw1 + "</td><td>" + name1 +"</td><td>" + tel1 +"</td></tr>"
						$('#result').append(table)
					}
					$('#result').append("</table>")
				} //success
			}) //ajax
		})//b3

		
		
 		$('#b4').click(function() {
			$('#result').empty()
			$.ajax({
				url: "json7",
				dataType : "json",
				success: function(json) {
					latitude1 = json.latitude
					longitude1 = json.longitude
					var mapContainer = document.getElementById('result'), // 지도를 표시할 div 
				    mapOption = { 
				        center: new kakao.maps.LatLng(latitude1, longitude1), // 지도의 중심좌표
				        level: 3 // 지도의 확대 레벨
				    };

				// 지도를 표시할 div와  지도 옵션으로  지도를 생성합니다
				var map = new kakao.maps.Map(mapContainer, mapOption); 
					
				} //success
			}) //ajax
		})//b4 
		
}) //$function
	
</script>
</head>
<body>
<hr>
<h3>심화 REST 정리 문제</h3>
<button id="b1">MemberVO 항목 하나 가지고 오기</button> <br>
<button id="b2">MemberVO 리스트 가지고 오기</button> <br>
<button id="b3">MemberVO 테이블로 가지고 오기</button> <br>
<button id="b4">카카오맵이용 지도표시하기</button> <br>
<button id="b9">test</button> <br>
<hr color="red">
<div id="result" style="background: yellow"></div>
</body>
</html>