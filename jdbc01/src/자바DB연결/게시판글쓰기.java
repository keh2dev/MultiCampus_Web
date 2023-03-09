package 자바DB연결;

import java.util.Scanner;

public class 게시판글쓰기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("NO,TITLE,CONTENT,WRITER를 입력하세요.");
		int NO = sc.nextInt();
		String TITLE = sc.next();
		String CONTENT = sc.next();
		String WRITER = sc.next();
		BBSDAO dao = new BBSDAO();
		//dao.insert(NO, TITLE, CONTENT, WRITER);

	}

}