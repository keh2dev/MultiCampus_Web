package 배열복습;

import java.util.Arrays;
import java.util.Random;

import javax.swing.JOptionPane;

public class 배열정렬순위 {

	public static void main(String[] args) {
//		배열 정렬 할 때는 arrays
		Random r = new Random(42);
		int[] jumsu = new int[10000];
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(1000) +1; // 1~1000
		}
		
		
//		for (int x : jumsu) {
//			System.out.println(x);
//		}
		
//		오름차순 정렬 작->큰
		Arrays.sort(jumsu);
//		 정렬 후
//		 jumsu 배열 원본이 파괴되는 파괴형 함수
		
//		String n = JOptionPane.showInputDialog("숫자입력");
//		int n2 = Integer.parseInt(n);
//		ram에 저장된 n이 바뀌는 것은 아님. 비파괴형 함수.
		
		for (int x : jumsu) {
			System.out.println(x);
		}
		
		System.out.println("====");
		
//		정렬후, 최대값, 최소값을 프린트!
		System.out.println("최소값 : " + jumsu[0]);
		System.out.println("최대값 : " + jumsu[jumsu.length - 1]);
		
//		상위 30프로, 인원 3000명, 높은 점수부터 3000개 추출
		
		System.out.println("====");
		
		int sum30 = 0;
		for (int i = 7000; i < jumsu.length; i++) {
			sum30 = sum30 + jumsu[i];
		}
		
		System.out.println("상위 30프로 점수 : " + (sum30/3000.0));
		
		System.out.println("====");
		
		int sum2 = 0;
		for (int i = 0; i < 3000; i++) {
			sum2 = sum2 + jumsu[i];
		}
		
		System.out.println("하위 30프로 점수 : " + (sum2/3000.0));
		
		String result = Arrays.toString(jumsu); // 비파괴, String
		
	}

}
