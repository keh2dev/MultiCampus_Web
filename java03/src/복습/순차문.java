package 복습;

import javax.swing.JOptionPane;

public class 순차문 {

	public static void main(String[] args) {
		// 입력 --> 처리 --> 출력
		// 두개의 숫자를 입력받아 처리해서 출력
		// 프로그래밍은 손으로 치는 값은 모두 다 스트링으로 취급(문자열)
		// 램에 저장 공간을 만드는 것은? 선언이라고 한다!
		// 선언할 때 램에 저장 공간인 변수가 만들어진다.
		// 데이터타입 변수명
		
		// 입력
		String n1 = JOptionPane.showInputDialog("숫자1입력해주세요.");
		String n2 = JOptionPane.showInputDialog("숫자2입력해주세요.");

		// 처리
		int n11 = Integer.parseInt(n1);
		int n22 = Integer.parseInt(n2);
		
		// 출력
		System.out.printf("%.2f", (double)n11 / n22);
	}

}
