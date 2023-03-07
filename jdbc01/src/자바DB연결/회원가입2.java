package 자바DB연결;

import java.util.Scanner;

public class 회원가입2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // 스캐너 메소드를 이용하여 키보드 입력값을 받음.
		System.out.println("id/pw/name/tel순으로 입력하세요."); // 입력할 값 안내 콘솔에 프린트.
		String id = sc.next(); //콘솔을 통해 변수 id 입력 및 저장.
		String pw = sc.next(); //pw값 입력.
		String name = sc.next(); // name값 입력.
		String tel = sc.next(); // tel값 입력.

		MemberDAO2 dao = new MemberDAO2(); // MemberDAO2 클래스 선언.
		//상기 클래스의 insert 메소드 호출하여 콘솔을 통해 입력받은.
		dao.insert(id, pw, name, tel);
		

	}

}
