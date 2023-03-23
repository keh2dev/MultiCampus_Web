<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%><%
	//입력한 값 받아오기.
String tel = request.getParameter("tel");
String pre = tel.substring(0,3);
String result ="";
switch(pre){
case "010":
	result = "100";
	break;
	
case "011":
	result = "111";
	break;
	
default :
	result = "222";
}

Random r = new Random();
int post = r.nextInt(900) + 100; //100~999
result = result + post;

//결과를 응답하자.
%><%= result %>