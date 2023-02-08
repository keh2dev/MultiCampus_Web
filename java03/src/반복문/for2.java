package 반복문;

import javax.swing.JOptionPane;

public class for2 {

	public static void main(String[] args) {
		// for (초기값; 조건식; 증감식) {
		// }
		for (;;) {// 무한 루프(반복) while(true) 와 같음.
			System.out.println("잘쓰지 않음.");
			String data = JOptionPane.showInputDialog("종료할까요?? y를 입력");
			// == 연산자는 기본 데이터만 비교 가능하기에 equals사용.
			if (data.equals("y")) {
				System.out.println("안녕히가세요!!!!!");
				break; // for문 break!
			}
		}

	}

}
