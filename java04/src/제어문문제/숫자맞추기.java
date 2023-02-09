package 제어문문제;

import java.util.Random;
import java.util.Scanner;

public class 숫자맞추기 {

	public static void main(String[] args) {
		// 숫자 맞추기!
		Random r = new Random();
		int answer = r.nextInt(100); // 0~99

		Scanner sc = new Scanner(System.in); // 스캐너 사용.

		int data = 0; // 답 입력 변수
		int count = 1; // 횟수 입력 변수
		
		System.out.println("0~99 중 숫자 하나를 맞춰보세요!");
//		System.out.println("사실 정답은 : " + answer); // 정답 치트코드

		for (;; count++) { // while(true) 도 가능!!!
			System.out.print("숫자를 입력해주세요 : ");
			data = sc.nextInt();
			if (data == answer) {
				System.out.println(answer + " 정답입니다! 시도횟수는 " + count);
				break;
			} else if (data > answer) {
				System.out.print("정답보다 큽니다! 다시 ");
			} else if (data < answer) {
				System.out.print("정답보다 작습니다! 다시 ");
			}
		}

		sc.close();
	}

}
