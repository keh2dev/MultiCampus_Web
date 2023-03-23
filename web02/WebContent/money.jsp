<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%><%
	//입력한 값 받아오기.
String m = request.getParameter("money"); //"1000"
String choice = request.getParameter("choice");
int money = Integer.parseInt(m);
if (choice.equals("1")){
	money = money - 1000;
} else if (choice.equals("2")){
	money = money + 1000;
}
//결과를 응답하자.
%><%= money %>