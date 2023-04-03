//package com.multi.mvc200;
//
//import java.util.ArrayList;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@Controller // 스프링에서 제어하는 역할로 등록!
//public class BbsController {
//	
//	@Autowired
//	BbsDAO dao;
//	
//	@Autowired
//	ReplyDAO dao2;
//	
//	@RequestMapping("insert2.multi")
//	public void insert(BbsVO bag) {
//		System.out.println("insert요청됨.");
//		System.out.println(bag);
//		System.out.println(dao);
//		dao.insert(bag);
//	}
//
//	@RequestMapping("update2.multi")
//	public void update(BbsVO bag) {
//		System.out.println("update요청됨.");
//		System.out.println(bag);
//		System.out.println(dao);
//		dao.update(bag);
//	}
//
//	@RequestMapping("delete2.multi")
//	public void delete(int no) {
//		System.out.println("delete요청됨.");
//		System.out.println(no);
//		System.out.println(dao);
//		dao.delete(no);
//	}
//
//	@RequestMapping("one2.multi")
//	public void one(int no, Model model) {
//		System.out.println("one요청됨.");
//		System.out.println(no);
//		System.out.println(dao);
//		
//		BbsVO bag = dao.one(no);
//		//게시판 댓글 추가
//		ArrayList<ReplyVO> list = dao2.list(no);
//		model.addAttribute("list", list);
//		model.addAttribute("bag", bag);
//	}
//
//	@RequestMapping("list2.multi")
//	public void list(Model model) {
//		ArrayList<BbsVO> list = dao.list();
//		model.addAttribute("list", list);
//	}
//	
//	@RequestMapping("update22.multi")
//	public void update2(int no, Model model) {
//		System.out.println("update22요청됨.");
//		System.out.println(no);
//		System.out.println(dao);
//		BbsVO bag = dao.one(no);
//		model.addAttribute("bag", bag);
//	}
//	
//	@RequestMapping("insert22.multi")
//	public void insert2() {
//		System.out.println("insert22요청됨.");
//		
//	}
//	
//	@RequestMapping("reply")
//	public void reply(ReplyVO vo, Model model) {
//		dao2.insert(vo);
//		System.out.println(vo);
//		model.addAttribute("vo", vo);
//	}
//	
//}
