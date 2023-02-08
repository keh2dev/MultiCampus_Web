package 복습;

import javax.swing.JOptionPane;

public class 조건문 {

	public static void main(String[] args) {
		int target = 77; //숫자 맞추기
		int me = 88; //내가 시도한 값!
		
		// 조건은 비교하는 코드가 들어감. 결과가 무조건 논리형(true/false)
		if (target == me) {
			System.out.println("정답!");
		} else {
			System.out.println("오답!");
		}
		// if는 조건이 만족하면 처리하고 더 이상 실행되지 않습니다.
		// if문 자체에 break기능이 존재한다.
		
		// switch case는 자체 break가 없기에 꼭 써줘야한다.
		
		//String target2 = "로또";
		String you = "신나";
		switch (you) {
		case "로또":
			System.out.println("정답이다!!!");
			break;
		case "신나":
		case "놀자":
		case "나가자":
			System.out.println("오답이다!!!");
			break;

		default: //위의 조건이 다 아닐 때 실행하고 싶은 내용이 있으면 default에 넣어줌. 생략 가능.
			System.out.println("그만해!!");
			break;
		}
	}

}
