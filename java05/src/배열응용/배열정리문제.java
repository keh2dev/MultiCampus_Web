package 배열응용;

import java.util.Scanner;

public class 배열정리문제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		1. 정수 5개 크기의 배열을 만들어서 
//		10, 20, 30, 40, 50을 순서대로 입력받는다.
//		첫번째값과 세번째 값을 더해서 프린트!

		int[] num = new int[5];

		for (int i = 0; i < num.length; i++) {
			System.out.print((i + 1) + "번째 정수 입력 : ");
			num[i] = sc.nextInt();
		}

		System.out.println("1번째, 3번째 값 합은 : " + (num[0] + num[2]));
		
		System.out.println("==================================");

//		2. 스트링 3개 크기의 배열을 만들어서 자바, 스프링, jsp를 순서대로 넣는다.
//		   => "자바 보다는 스프링"로 출력!

		String[] language = new String[3];

		for (int i = 0; i < language.length; i++) {
			System.out.print("언어" + (i + 1) + " 입력 : ");
			language[i] = sc.next();
		}

		System.out.println(language[0] + " 보다는 " + language[1]);

		
		sc.close();

	}

}
