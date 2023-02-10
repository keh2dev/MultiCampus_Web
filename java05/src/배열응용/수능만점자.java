package 배열응용;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class 수능만점자 {

	public static void main(String[] args) {
//		수능 10000명의 점수를 처리!
//		랜덤으로 10000명을 넣어주세요.
//		0~450점.
//		1) 만점자가 몇명인지?
//		2) 0점이 몇명인지?
//		3) 평균은 어떻게 되었는지? 합계도!

		int[] num = new int[10000];
		Random r = new Random(42); // 시드 값 42 입력

		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(451); // 0~450
		}

//		1) 만점자 카운트
		int maxCount = 0;

		for (int i = 0; i < num.length; i++) {
			if (num[i] == 450) {
				maxCount++;
			}
		}

		System.out.println("만점자 수는 : " + maxCount);

//		2) 0점이 몇명인지?
		int zeroCount = 0;

		for (int i = 0; i < num.length; i++) {
			if (num[i] == 0) {
				zeroCount++;
			}
		}

		System.out.println("0점자 수는 : " + zeroCount);

//		3) 점수 평균은?
		int sum = 0;
		int numCount = 0;

		for (int i : num) {
			sum = sum + i;
			numCount++;
		}

		double avg = sum / (double) numCount;

		System.out.println("총 점수 합 : " + sum);
		System.out.println("평균 점수 : " + avg);

//		4) 평균보다 +-50점인 학생 카운트.(포함)
		int rangeCount = 0;

		for (int i : num) {
			if ((i >= (avg - 50)) && (i <= (avg + 50))) {
				rangeCount++;
			}
		}

		System.out.println("평균보다 +-50점인 학생 수 : " + rangeCount);

//		5) 점수 상위 30%의 평균 점수!!
		
//		Arrays.sort(num, Collections.reverseOrder());
		
	}

}
