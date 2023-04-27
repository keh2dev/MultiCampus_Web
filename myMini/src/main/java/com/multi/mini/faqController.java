package com.multi.mini;


import java.util.List;

//import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 스프링에서 제어하는 역할로 등록! dependency
public class faqController {

	@Autowired
	faqDAO dao; 

	@RequestMapping("faqList")
	public void list(Model model) {
		List<faqVO> list = dao.list();
		model.addAttribute("list", list);
	}
	
	@RequestMapping("faqInsert")
	public void insert(faqVO bag) {
		System.out.println("insert요청됨.");
		System.out.println(bag);
		System.out.println(dao);
		dao.insert(bag);
	}

	@RequestMapping("faqUpdate")
	public void update(faqVO bag) {
		System.out.println("update요청됨.");
		System.out.println(bag);
		dao.update(bag);
	}

	@RequestMapping("faqDelete")
	public void delete(int faq_no) {
		System.out.println("delete요청됨.");
		System.out.println(faq_no);
		dao.delete(faq_no);
	}

	@RequestMapping("faqOne")
	public void one(String title, Model model) {
		System.out.println("one요청됨.");
		System.out.println(title);
//		faqVO vo = dao.one(title);
//		model.addAttribute("vo", vo);
		List<faqVO> list = dao.one(title);
		model.addAttribute("list", list);
	}
	
	@RequestMapping("faqOne2")
	public void one2(String category, Model model) {
		System.out.println("one2요청됨.");
		System.out.println(category);
//		faqVO vo = dao.one(title);
//		model.addAttribute("vo", vo);
		List<faqVO> list = dao.one2(category);
		model.addAttribute("list", list);
	}

//	@RequestMapping("faqOne")
//	public void one(String title, Model model) {
//		System.out.println("one요청됨.");
//		System.out.println(title);
//		faqVO vo = dao.one(title);
//		model.addAttribute("vo", vo);
//	}

}
