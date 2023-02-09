package 제어문문제;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 인기조사 {

	public static void main(String[] args) {
		// 인기투표해봅시다.!!
		// 1)아이유 2)뉴진스 3)BTS 4)종료 (4번 기입은 투표 제외)
		// 잘못된 값 기입 시 재입력 요구 및 투표 제외.

		Scanner sc = new Scanner(System.in);
		String data = ""; // 투표 입력 변수
		
		int iu = 0; // 아이유
		int newjeans = 0; // 뉴진스
		int bts = 0; // 방탄
		int count = 0; // 투표인원 카운트 변수
			
		
		System.out.println("인기 투표 시스템");
		System.out.println("===================================");
		
		while (true) {
			System.out.print("1)아이유 2)뉴진스 3)방탄 4)투표종료 : ");
			data = sc.next();
			
			count++; // 입력값 받을 때 마다 투표인원 증가
			
			if (data.equals("4")) {
				System.out.println("===================================");
				System.out.println("시스템을 종료합니다.");
				System.out.println("===================================");
				count--; //4)투표종료 시에는 투표인원에서 제외
				break;
			} else if (data.equals("1")) {
				iu++;
			} else if (data.equals("2")) {
				newjeans++;
			} else if (data.equals("3")) {
				bts++;
			} else {
				System.out.println("잘못된 값을 입력하였습니다 다시 입력해주세요");
				count--; //잘못된 값 입력 시에는 투표인원에서 제외
			}
		}

		System.out.println(count + "명 인기투표 결과!");
		System.out.println("아이유 " + iu + "명");
		System.out.println("뉴진스 " + newjeans + "명");
		System.out.println("BTS " + bts + "명");
		System.out.println("==================");
		
		
		sc.close();
	}

}
