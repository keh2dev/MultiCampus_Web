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
public class askDAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	public List<askVO> list() {
		List<askVO> list = my.selectList("ask.all");
		System.out.println(list.size());
		return list;
	}

	public int insert(askVO bag) {
		int result = my.insert("ask.create", bag);
		//						namespace.id
		return result;
	}
	
	public int update(askVO bag) {
		int result = my.update("ask.update", bag);
		//						namespace.id
		return result;
	}
	
	public int delete(int ask_no) {
		int result = my.delete("ask.del", ask_no);
		//						namespace.id
		return result;
	}
	
	public List<askVO> one(String title) {
		List<askVO> list = my.selectList("ask.one", title);
		//						namespace.id
		System.out.println(list.size());
		return list;
	}

	
	public askVO oneNo(int ask_no) {
		askVO vo = my.selectOne("ask.oneNo", ask_no);
		//						namespace.id
		System.out.println(vo);
		return vo;
	}
	
	public askVO updateNo(int ask_no) {
		askVO vo = my.selectOne("ask.updateNo", ask_no);
		//						namespace.id
		System.out.println(vo);
		return vo;
	}
}


