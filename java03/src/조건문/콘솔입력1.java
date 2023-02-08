package 조건문;

import java.util.Scanner;

public class 콘솔입력1 {

	public static void main(String[] args) {
		// 스캐너를 써보자!
		Scanner sc = new Scanner(System.in);//컴퓨터.키보드
		// 자바 프로그램과 콘솔 간에 통로를 만든다.
		// 이 연결 통로를 == 강물(Stream) 
		// Stream은 프로그래머가 닫아주지 않으면 계속 가지고 있게됨.
		// 이러면 자원 낭비가 되기에 사용 후 반드시 stream을 close 해줘야한다.
		System.out.print("요일 입력 : 1)주중 2)주말 >> ");
		int data = sc.nextInt(); //string --> int
		if (data == 1) {
			System.out.println("공부하자");
		} else {
			System.out.println("푹쉬자");
		}
		
		System.out.print("주말에 뭐할거?? >> ");
		String data2 = sc.next();//단어
		System.out.println("나는 주말에 " + data2 + "를 할거야.");
				
		sc.close();

	}

}
