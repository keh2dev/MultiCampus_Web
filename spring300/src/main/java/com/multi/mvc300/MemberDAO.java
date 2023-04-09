package com.multi.mvc300;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberDAO { // CRUD
	
	//mybatis 싱글톤 객체 찾아서 주소를 넣어주세요!
	@Autowired
	SqlSessionTemplate my;
	
	
//특정한 방법으로 실행하는 클래스(model, 방법) 
//	public int login(MemberVO bag) {
//		return result;
//	}
//
	public List<MemberVO> list() {
		List<MemberVO> list = my.selectList("member.list");
		
		return list;
	}


	public int insert(MemberVO bag) {
		System.out.println("------"+my);
		int result = my.insert("member.create", bag);
		//						namespace.id
		return result;
	}
	
	public int update(MemberVO bag) {
		int result = my.update("member.up", bag);
		//						namespace.id
		return result;
	}
	
	public int delete(String id) {
		int result = my.delete("member.del", id);
		//						namespace.id
		return result;
	}
}
