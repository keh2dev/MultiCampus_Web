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
public class faqDAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	public List<faqVO> list() {
		List<faqVO> list = my.selectList("faq.all");
		System.out.println(list.size());
		return list;
	}

	public int insert(faqVO bag) {
		int result = my.insert("faq.create", bag);
		//						namespace.id
		return result;
	}
	
	public int update(faqVO bag) {
		int result = my.update("faq.up", bag);
		//						namespace.id
		return result;
	}
	
	public int delete(int faq_no) {
		int result = my.delete("faq.del", faq_no);
		//						namespace.id
		return result;
	}
	
	public List<faqVO> one(String title) {
		List<faqVO> list = my.selectList("faq.one", title);
		//						namespace.id
		System.out.println(list.size());
		return list;
	}
	
//	public faqVO one(String title) {
//		faqVO vo = my.selectOne("faq.one", title);
//		//						namespace.id
//		System.out.println(vo);
//		return vo;
//	}
}
