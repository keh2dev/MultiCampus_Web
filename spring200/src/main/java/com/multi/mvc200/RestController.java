package com.multi.mvc200;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestController {
	
	@RequestMapping("json1")
	@ResponseBody
	public MemberVO json1() {
		MemberVO bag = new MemberVO();
		bag.setId("root");
		bag.setPw("1234");
		bag.setName("hong");
		bag.setTel("011");
		return bag;
	}
	
	
	@RequestMapping("json2")
	@ResponseBody
	public ArrayList<MemberVO> json2() {
		MemberVO bag = new MemberVO();
		bag.setId("root");
		bag.setPw("1234");
		bag.setName("hong");
		bag.setTel("011");
		
		MemberVO bag2 = new MemberVO();
		bag2.setId("root2");
		bag2.setPw("12342");
		bag2.setName("hong2");
		bag2.setTel("0112");
		
		
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		list.add(bag);
		list.add(bag2);
		
		return list;
	}
	
	@RequestMapping("json3")
	@ResponseBody
	public BbsVO json3() {
		BbsVO bag = new BbsVO();
		bag.setNo(1);
		bag.setTitle("오늘은");
		bag.setContent("수요일");
		bag.setWriter("apple");
		return bag;
	}
	
	@RequestMapping("json4")
	@ResponseBody
	public ArrayList<BbsVO> json4() {
		BbsVO bag = new BbsVO();
		bag.setNo(1);
		bag.setTitle("오늘은");
		bag.setContent("수요일");
		bag.setWriter("apple");
		
		BbsVO bag2 = new BbsVO();
		bag2.setNo(2);
		bag2.setTitle("내일은");
		bag2.setContent("목요일");
		bag2.setWriter("banana");
		
		
		ArrayList<BbsVO> list = new ArrayList<BbsVO>();
		list.add(bag);
		list.add(bag2);
		
		return list;
	}
	
	@Autowired
	MemberDAO dao;

	@RequestMapping("json5")
	@ResponseBody
	public MemberVO json5() {
		MemberVO bag = new MemberVO();
		bag.setId("kiwi");
		bag.setPw("1313");
		bag.setName("kiwiman");
		bag.setTel("01012345678");
		System.out.println(bag);
		return bag;
	}
	
	@RequestMapping("json6")
	@ResponseBody
	public ArrayList<MemberVO> json6() {
		ArrayList<MemberVO> list = dao.list();
		System.out.println(list.size());
		return list;
	}
	
	@RequestMapping("json7")
	@ResponseBody
	public MapVO json7() {
		MapVO bag = new MapVO();
		bag.setLatitude(37.5117);
		bag.setLongitude(127.0592);
		System.out.println(bag);
		return bag;
	}
	
}


