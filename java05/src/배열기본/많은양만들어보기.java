package 배열기본;

import java.util.Random;

public class 많은양만들어보기 {

	public static void main(String[] args) {
//		2부터 20까지 임의로 만들어서 배열에 넣어보기.
		int[] jumsu2 = new int[1000];
		Random r = new Random(42); //시드값 테스트 시 보통 42넣음.

		for (int i = 0; i < jumsu2.length; i++) {
			jumsu2[i] = r.nextInt(19) + 2;
		}

//		전체 프린트.
		for (int x : jumsu2) {
			System.out.println(x);
		}

//		3이상인 숫자 몇개인지 프린트!!!
//		배열은 전체를 가지고 와서, 3이상인 것 체크 후 갯수를 세주세요!
//		15 이상 다 더해보기.
		int count = 0;
		int sum = 0;

		for (int y : jumsu2) {
			if (y >= 15) {
				count++;
				sum = sum + y;
			}
		}
		
		System.out.println("카운트 : " + count);
		System.out.println("합계 : " + sum);
	}

}
