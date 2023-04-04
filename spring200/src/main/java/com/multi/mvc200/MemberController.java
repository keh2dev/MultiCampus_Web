package com.multi.mvc200;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 스프링에서 제어하는 역할로 등록!
public class MemberController {
	
	@Autowired
	// MemberDAO의 싱글톤 객체 램의 어디에 있는지 찾아
	// 그 주소를 아래 변수에 넣어주세요!
	MemberDAO dao;
	// 컨트롤 하는 기능(CRUD!)
	// 회원가입, 수정, 탈퇴, 정보검색

	// 클래스 내에서 기능처리 담당
	// 멤버변수 + 멤버메서드!(기능처리 담당!)
	// 하나의 요청당 하나의 메서드
	// 하나의 버튼 호출당 하나의 함수 연결!!
	// 요청된 주소가 어떻게 될 때
	// 바로 아래에 있는 메서드가 호출이 될지를 써줘야한다
	@RequestMapping("login3")
	public String login(MemberVO bag, HttpSession session) {
		// 메서드의 입력변수(파라메터)로 변수를
		// 선언해두면, 컨트롤러내의 메서드내에서는
		// 1) bag을 만들어서
		// 2) 클라이언트로부터 전달된 데이터도 다 받아줌.
		// 3) bag에 데이터 다 넣어줌.
		System.out.println("login요청됨.");
		System.out.println(bag);
		// dao에게 insert요청!!!
		int result = dao.login(bag);//1, 0
		if (result ==1) {
			session.setAttribute("id", bag.getId());
			return "ok";
		} else {
			//view아래가 아니고, webapp아래
			//member.jsp로 돌아가고 싶은경우
			return "redirect:member.jsp";
		}
	}
	
	@RequestMapping("insert3")
	public void insert(MemberVO bag) {
		// 메서드의 입력변수(파라메터)로 변수를
		// 선언해두면, 컨트롤러내의 메서드내에서는
		// 1) bag을 만들어서
		// 2) 클라이언트로부터 전달된 데이터도 다 받아줌.
		// 3) bag에 데이터 다 넣어줌.
		System.out.println("insert요청됨.");
		System.out.println(bag);
		//System.out.println(dao);
		// dao에게 insert요청!!!
		dao.insert(bag);
	}

	@RequestMapping("update3")
	public void update(MemberVO bag) {
		System.out.println("update요청됨.");
		System.out.println(bag);

		dao.update(bag);
	}

	@RequestMapping("delete3")
	public void delete(String id) {
		System.out.println("delete요청됨.");
		System.out.println(id);

		dao.delete(id);
	}

	@RequestMapping("one5")
	public void one(String id, Model model) {
		System.out.println("one요청됨.");
		System.out.println(id);
		
		MemberVO bag = dao.one(id);
		model.addAttribute("bag", bag);
		//view까지 전달할 속성 추가
	}

	@RequestMapping(value = {"list3", "list7"})
	// 리퀘스트 메소드 다중 이용!
	public void list(Model model) {
		//Model은 컨트롤러의 list를 views/list.jsp까지만 전달할 수 있는 객체
		ArrayList<MemberVO> list = dao.list();
		model.addAttribute("list", list);
		// views/list3 or list7.jsp에 "list"로 list 전달.
	}
	
//	@RequestMapping("list7")
//	public void list7(Model model) {
//		//Model은 컨트롤러의 list를 views/list.jsp까지만 전달할 수 있는 객체
//		ArrayList<MemberVO> list = dao.list();
//		model.addAttribute("list", list);
//	}
}
