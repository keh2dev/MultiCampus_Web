package 조건문;

import javax.swing.JOptionPane;

public class if문7 {

	public static void main(String[] args) {
		// 1~2번 문제 equals() 사용합니다.
		//
		// 1. 암호를 대시오 입력 ==> pass라고 입력
		//    암호가 맞으면 "들어오세요" 프린트
		//    암호가 틀리면 "나가세요" 프린트
		//
		// 2. 당신이 먹고싶은 저녁 메뉴는 (자장면, 라면, 회)에서 선택
		//    자장면이면 "중국집으로 가요" 프린트 
		//	  라면이면 "분식집으로 가요" 프린트
		//    회면 "횟집으로 가요" 프린트
		//    위에 없으면 "그냥 안먹어요" 프린트
		//
		// 3. JOptionPane 을 사용.
		//    두 정수를 입력받으세요. --> 누가 더 큰지 출력!
		//
		// 4. 사원번호 ==> STRING NO = "A100EX";
		//    맨 앞에 있는 글자를 추출 no.charAt(0)을 이용
		//    A이면 기획부 프린트, B이면 총무부 프린트, C이면 개발부 프린트, 아니면 해당부서없음 프린트.
		
		// 1.
		String password = JOptionPane.showInputDialog("암호를 입력하시오");

		if (password.equals("pass")) {
			System.out.println("들어오세요");
		} else {
			System.out.println("나가세요");
		}

		
		// 2.
		String food = JOptionPane.showInputDialog("먹고싶은 저녁 메뉴는?(자장면, 라면, 회)");
		if (food.equals("자장면")) {
			System.out.println("중국집으로 가요");
		} else if (food.equals("라면")){
			System.out.println("분식집으로 가요");
		} else if (food.equals("회")){
			System.out.println("횟집으로 가요");
		} else {
			System.out.println("그냥 안먹어요");
		}
		
		// 3.
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("정수1"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("정수2"));
		if (num1 > num2) {
			System.out.println(num1 + "인 정수1이 더 큼!");
		} else if (num2 > num1){
			System.out.println(num2 + "인 정수2가 더 큼!");
		} else {
			System.out.println("두 수는 같음!");
		}
		
		// 4.
		String no = "A100EX";
		char firstNo = no.charAt(0);
		switch (firstNo) {
		case 'A':
			System.out.println("기획부");
			break;
			
		case 'B':
			System.out.println("총무부");
			break;
			
		case 'C':
			System.out.println("개발부");
			break;

		default:
			System.out.println("해당부서 없음");
			break;
		}
		
		// 추가문제!
//		1. 두 수와 사칙연산자를 입력받아 두 수를 사칙연산자에 따라 처리후 출력
//		2. 두 수를 입력받아 정수로 변환하여 정수변수에  저장, 나누기 연산 수행후 소숫점 2째자리까지 출력!
	}	
}
