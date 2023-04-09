package com.multi.mvc300;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Locale;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//import 화면DB연결.BookVO;
//스프링에 dao는 싱글톤으로 하나만 만들어서 사용할게! 라고 설정해야함!
//2가지 방법!
//어노테이션(표시) 방법과 XML방법!

@Component
public class BookDAO { 

	@Autowired
	SqlSessionTemplate my;
	
	public int insert(BookVO bag) {
		System.out.println("------"+my);
		int result = my.insert("book.create", bag);
		return result;
	}
	
	public int update(BookVO bag) {
		System.out.println("------"+my);
		int result = my.update("book.update", bag);
		return result;
	}
	
	public int delete(int id) {
		System.out.println("------"+my);
		int result = my.delete("book.delete", id);
		return result;
	}

}
