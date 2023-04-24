package com.multi.mini;


import java.util.List;

//import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 스프링에서 제어하는 역할로 등록! dependency
public class answerController {

	@Autowired
	answerDAO dao; 

	@RequestMapping("answerList")
	public void list(Model model) {
		List<answerVO> list = dao.list();
		model.addAttribute("list", list);
	}
	
	@RequestMapping("answerInsert")
	public void insert(answerVO bag) {
		System.out.println("insert요청됨.");
		System.out.println(bag);
		System.out.println(dao);
		dao.insert(bag);
	}

	@RequestMapping("answerUpdate")
	public void update(answerVO bag) {
		System.out.println("update요청됨.");
		System.out.println(bag);
		dao.update(bag);
	}

	@RequestMapping("answerDelete")
	public void delete(int answer_no) {
		System.out.println("delete요청됨.");
		System.out.println(answer_no);
		dao.delete(answer_no);
	}

	@RequestMapping("answerOne")
	public void one(int ask_no, Model model) {
		System.out.println("one요청됨.");
		System.out.println(ask_no);
//		answerVO vo = dao.one(title);
//		model.addAttribute("vo", vo);
		List<answerVO> list = dao.one(ask_no);
		model.addAttribute("list", list);
	}

//	@RequestMapping("answerOne")
//	public void one(String title, Model model) {
//		System.out.println("one요청됨.");
//		System.out.println(title);
//		answerVO vo = dao.one(title);
//		model.addAttribute("vo", vo);
//	}

}
