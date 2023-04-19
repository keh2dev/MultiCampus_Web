package com.multi.mvc901;

//import java.util.ArrayList;
import java.util.List;

//import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 스프링에서 제어하는 역할로 등록! dependency
public class MemberController {

	@Autowired
	MemberDAO dao; 
	
	@RequestMapping("insert")
	public void insert(MemberVO bag) {
		System.out.println("insert요청됨.");
		System.out.println(bag);
		System.out.println(dao);
		dao.insert(bag);
	}

	@RequestMapping("update")
	public void update(MemberVO bag) {
		System.out.println("update요청됨.");
		System.out.println(bag);
		dao.update(bag);
	}

	@RequestMapping("delete")
	public void delete(String id) {
		System.out.println("delete요청됨.");
		System.out.println(id);
		dao.delete(id);
	}

	@RequestMapping("one")
	public void one(String id, Model model) {
		System.out.println("one요청됨.");
		System.out.println(id);
	}

	@RequestMapping("one5")
	public void one5(String id, Model model) {
		System.out.println("one요청됨.");
		System.out.println(id);
	}

	@RequestMapping("list")
	public void list(Model model) {
		List<MemberVO> list = dao.list();
		model.addAttribute("list", list);
	}

}
