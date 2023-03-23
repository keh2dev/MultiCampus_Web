<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%><%
String won = request.getParameter("won"); //"1000"
int won2 = Integer.parseInt(won);
double dollar = 0.00078;
double result = won2*dollar;
%><%=result%>