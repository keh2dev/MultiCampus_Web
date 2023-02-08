package 반복문;

import javax.swing.JOptionPane;

public class 누적연습 {

	public static void main(String[] args) {
		// 숫자누적
		int sum = 0; // 변수의 초기화 필수!
		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
			System.out.println("현재까지의 합 >> " + sum);
		}
		System.out.println("!!!전체 합은 >> " + sum);

		// 글자누적
		String sum2 = ""; // String의 초기 값은 ""
		for (int i = 0; i < 3; i++) {
			String dataString = JOptionPane.showInputDialog("가고 싶은 곳 입력");
			sum2 = sum2 + dataString + " ";
		}
		System.out.println(sum2);

	}

}
