package 배열응용;

public class 우리반성적변동 {

	public static void main(String[] args) {
		int[] n1 = { 44, 66, 77, 22, 11 };
		int[] n2 = { 33, 55, 77, 22, 40 };

		int countSame = 0; // 동일 갯수
		int countDiff = 0; // 다른 갯수
		
		for (int i = 0; i < n2.length; i++) {
			if (n1[i]==n2[i]) {
				countSame++;
			} else {
				countDiff++;
			}
		}
		
		System.out.println("1~2학기 성적 동일 학생수 : " + countSame);
		System.out.println("1~2학기 성적 다른 학생수 : " + countDiff);
	}

}
