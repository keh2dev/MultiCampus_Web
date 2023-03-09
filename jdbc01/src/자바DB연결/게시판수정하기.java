package 자바DB연결;

import java.util.Scanner;

public class 게시판수정하기 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); 
		System.out.println("NO/수정 할 CONTENT 순으로 입력하세요.");
		int no = sc.nextInt();
		String CONTENT = sc.next();
		BBSDAO dao = new BBSDAO();
		//dao.update(no, CONTENT);
	}
}