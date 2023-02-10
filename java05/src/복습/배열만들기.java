package 복습;

import java.awt.JobAttributes;

public class 배열만들기 {

	public static void main(String[] args) {
//		1. 배열만들기 - 이미 값을 알고 있는 경우.
//		2. 배열만들기 - 값을 모르고 있는 경우, 공간부터 만들어두자.
		
		String[] hobby = {"독서", "헬스", "노래", "게임"};
		System.out.println("0 : " + hobby[0]);
		System.out.println("1 : " + hobby[1]);
		System.out.println(hobby.length);
		System.out.println(hobby[3]);
		System.out.println(hobby[hobby.length - 1]);
		for (int i = 0; i < hobby.length; i++) {
			System.out.println(i + ": " + hobby[i]);
		}
		
//		for-each 알아서 처음부터 인덱스를 하나씩 증가하면서
//		하나씩 꺼내온다. 입력 불가. 출력만 가능. 인덱스도 불가.
		for (String x : hobby) {
			System.out.println(x);
		}
		
		
		String[] sports = new String[5];
		System.out.println(sports[4]);
		sports[0] ="축구";
		sports[1] = "야구";
		
		for (int i = 0; i < sports.length; i++) {
			System.out.println(i+ ": " + sports[i]);
		}

		for (String y : sports) {
			System.out.println(y);
		}
		
		
//		좋아하는 여행지 5개.
//		좋아하는 색깔 5개의 첫글자.
//		좋아하는 연예인 5명의 키.
		
		String[] travelStrings = {"제주", "부산", "강릉", "통영", "태안"};
		char[] color = {'w', 'b', 'r', 'g', 'b'};
		double[] height = {185.4, 170.1, 177.3, 193.1, 172.7};
		
		
		
	}

}
