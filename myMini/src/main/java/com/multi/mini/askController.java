package com.multi.mini;


import java.util.List;

//import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 스프링에서 제어하는 역할로 등록! dependency
public class askController {

	@Autowired
	askDAO dao; 

	@RequestMapping("askList")
	public void list(Model model) {
		List<askVO> list = dao.list();
		model.addAttribute("list", list);
	}
	
	@RequestMapping("askInsert")
	public void insert(askVO bag) {
		System.out.println("insert요청됨.");
		System.out.println(bag);
		System.out.println(dao);
		dao.insert(bag);
	}

	@RequestMapping("askUpdate")
	public void update(askVO bag) {
		System.out.println("update요청됨.");
		System.out.println(bag);
		dao.update(bag);
	}

	@RequestMapping("askUpdateNo")
	public void updateNo(int ask_no, Model model) {
		System.out.println("updateNo요청됨.");
		System.out.println(ask_no);
		askVO vo = dao.updateNo(ask_no);
		model.addAttribute("vo", vo);
	}
	
	@RequestMapping("askDelete")
	public void delete(int ask_no) {
		System.out.println("delete요청됨.");
		System.out.println(ask_no);
		dao.delete(ask_no);
	}

	@RequestMapping("askOne")
	public void one(String title, Model model) {
		System.out.println("one요청됨.");
		System.out.println(title);
//		askVO vo = dao.one(title);
//		model.addAttribute("vo", vo);
		List<askVO> list = dao.one(title);
		model.addAttribute("list", list);
	}
	
	@RequestMapping("askOneNo")
	public void oneNo(int ask_no, Model model) {
		System.out.println("oneNo요청됨.");
		System.out.println(ask_no);
		askVO vo = dao.oneNo(ask_no);
		model.addAttribute("vo", vo);
	}
//	@RequestMapping("askOne")
//	public void one(String title, Model model) {
//		System.out.println("one요청됨.");
//		System.out.println(title);
//		askVO vo = dao.one(title);
//		model.addAttribute("vo", vo);
//	}

	@RequestMapping("askWrite")
	public void write() {
		System.out.println("write요청됨.");
	}
}
