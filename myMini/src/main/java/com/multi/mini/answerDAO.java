package com.multi.mini;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.util.ArrayList;
import java.util.List;
//import java.util.Locale;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class answerDAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	public List<answerVO> list() {
		List<answerVO> list = my.selectList("answer.all");
		System.out.println(list.size());
		return list;
	}

	public int insert(answerVO bag) {
		int result = my.insert("answer.create", bag);
		//						namespace.id
		return result;
	}
	
	public int update(answerVO bag) {
		int result = my.update("answer.up", bag);
		//						namespace.id
		return result;
	}
	
	public int delete(int answer_no) {
		int result = my.delete("answer.del", answer_no);
		//						namespace.id
		return result;
	}
	
	public List<answerVO> one(int ask_no) {
		List<answerVO> list = my.selectList("answer.one", ask_no);
		//						namespace.id
		System.out.println(list.size());
		return list;
	}
	
//	public answerVO one(String title) {
//		answerVO vo = my.selectOne("answer.one", title);
//		//						namespace.id
//		System.out.println(vo);
//		return vo;
//	}
}
