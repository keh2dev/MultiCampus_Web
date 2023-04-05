<%@page import="org.json.simple.JSONObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//스크릿트릿
	JSONObject json = new JSONObject();
	json.put("name", "hong"); //{name : hong}
	json.put("age", 100); //{name : hong}
	json.put("id", "apple"); //{name : hong}
	
	//out.print(json.toJSONString());
	
%><%= json.toJSONString() %>