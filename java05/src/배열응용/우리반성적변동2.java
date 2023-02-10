package 배열응용;

import java.util.Random;

public class 우리반성적변동2 {

	public static void main(String[] args) {
		Random r = new Random(42);

		int[] n1 = new int[10000];
		int[] n2 = new int[10000];

		for (int i = 0; i < n2.length; i++) {
			n1[i] = r.nextInt(101);
			n2[i] = r.nextInt(101);
		}

		int countSame = 0; // 동일 갯수
		int countDiff = 0; // 다른 갯수

		for (int i = 0; i < n2.length; i++) {
			if (n1[i] == n2[i]) {
				countSame++;
			} else {
				countDiff++;
			}
		}

		System.out.println("1~2학기 성적 동일 학생수 : " + countSame);
		System.out.println("1~2학기 성적 다른 학생수 : " + countDiff);

		// 2학기에 성적비교!!!

		int countSecond = 0; // 2학기 성적이 더 높은 사람 카운트
		int countFirst = 0; // 1학기 성적이 더 높은 사람 카운트

		for (int i = 0; i < n2.length; i++) {
			if (n1[i] < n2[i]) {
				countSecond++;
				System.out.println("2학기 성적이 좋은학생 인덱스 : " + i);
			} else if (n1[i] > n2[i]) {
				countFirst++;
				System.out.println("1학기 성적이 좋은학생 인덱스 : " + i);
			}
		}

		System.out.println("2학기 성적이 더 좋은 사람???");
		System.out.println("2학기 성적이 더 좋은 학생 수 : " + countSecond);
		System.out.println("1학기 성적이 더 좋은 사람???");
		System.out.println("1학기 성적인 더 좋은 학생 수 : " + countFirst);

	}

}
