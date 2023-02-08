package 조건문;

import java.util.Scanner;

public class 연습문제 {

	public static void main(String[] args) {

//		Scanner사용해주세요.!
//		1.id와 pw를 입력해서 id가 root이고, pw가 1234이면 로그인 성공!
//		  아니면 로그인 실패!
//		  ==> String은 ==비교 불가능. equals() 비교해야함.
//		2. 사과 구매 갯수, 사과 한 개당 가격입력
//		   딸기 구매 갯수, 딸기 한 개당 가격입력
//		   다음과 같이 출력
//		   사과 구매 가격은 5500원입니다.
//		   딸 구매 가격은 4500원입니다.
//		   전체 구매 가격은 10000원입니다.
//		3. 심화문제
//		   - 시작값, 종료값 입력
//		   시작값부터 종료값까지 모두 더해서 출력
//		4. 심화문제
//		   - 시작값, 종료값, 점프값 입력
//		     시작값부터 종료값까지 점프값만큼 증가하면서 더함. 더한 값을 출력
//		     더한 값이 100을 넘으면 프로그램 종료

		Scanner sc = new Scanner(System.in);
		
//		// 1번 문제 답.

//
//		System.out.println("1번 문제 >>");
//		System.out.println("");
//		System.out.println("로그인 창");
//		System.out.println("----------------------");
//		System.out.print("ID : ");
//		String id = sc.next();
//		System.out.print("PW : ");
//		String pw = sc.next();
//		System.out.println("----------------------");
//		if (id.equals("root") && pw.equals("1234")) {
//			System.out.println("로그인 성공");
//		} else {
//			System.out.println("로그인 실패");
//		}
//		System.out.println("");
//		System.out.println("======================");
//		System.out.println("");
//
//		// 2번 문제 답.
//		System.out.println("2번 문제 >>");
//		System.out.println("");
//		System.out.print("사과 구매 갯수? ");
//		int appleNum = sc.nextInt();
//		System.out.print("사과 개당 가격? ");
//		int applePrice = sc.nextInt();
//		System.out.print("딸기 구매 갯수? ");
//		int berryNum = sc.nextInt();
//		System.out.print("딸기 개당 가격? ");
//		int berryPrice = sc.nextInt();
//		System.out.println("----------------------");
//
//		int appleResult = appleNum * applePrice;
//		int berryResult = berryNum * berryPrice;
//		int allResult = appleResult + berryResult;
//		System.out.println("사과 구매 가격은 " + appleResult + "원 입니다.");
//		System.out.println("딸기 구매 가격은 " + berryResult + "원 입니다.");
//		System.out.println("전체 구매 가격은 " + allResult + "원 입니다.");
//		
//		System.out.println("");
//		System.out.println("======================");
//		System.out.println("");

		// 3번 문제 답.
		System.out.println("3번 문제 >>");
		System.out.println("");
		System.out.print("시작값 : ");
		int num1 = sc.nextInt();
		System.out.print("종료값 : ");
		int num2 = sc.nextInt();
		int sum = 0;
		for (int i = num1; i <= num2; i++) {
			sum = sum + i;
		}
		System.out.println("총 합은 " + sum);
		
		System.out.println("");
		System.out.println("======================");
		System.out.println("");
		
		// 4번 문제 답.
		System.out.println("4번 문제 >>");
		System.out.println("");
		System.out.print("시작값 : ");
		int num11 = sc.nextInt();
		System.out.print("종료값 : ");
		int num22 = sc.nextInt();
		System.out.print("점프값 : ");
		int num33 = sc.nextInt();
		int sum1 = 0;
		for (int i = num11; i <= num22; i=i+num33) {
			sum1 = i;
			System.out.println("더한 값은 " + sum1);
			if (sum1 > 100) {
				System.out.println("더한 값이 100이 넘어 프로그램을 종료합니다. ");
				System.exit(0);	// 프로그램 자체가 종료되므로 break 별도로 필요 없음.
			}
		}
		
		sc.close();
	}

}
