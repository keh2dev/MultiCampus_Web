package 문자열;

import java.util.Arrays;

public class 문자열심화문제 {

	public static void main(String[] args) {
//		6. String s5 = “ [ 10, 20, 30, 40, 50]”에서 모든 데이터를 꺼내어 합한 값을 프린트(힌트)
//		1) [, ] – replace()를 이용하여 제거 
//		2)  10 - trim()을 이용하여 공백 제거
//		3)	,를 기준으로 split()를 이용하여 배열로 분리
//		4)	배열로 분리된 값을 꺼내 정수로 변환후, 합해줌.

		System.out.println("6. String s5 = “ [ 10, 20, 30, 40, 50]”에서 모든 데이터를 꺼내어 합한 값을 프린트");
		String s5 = "[ 10, 20, 30, 40, 50]";
		s5 = s5.replace("[","");
		s5 = s5.replace("]","");
		s5 = s5.trim();

		System.out.println(s5);
		String[] s5Array = s5.split(", ");
		int sum = 0;
		
		for (String x : s5Array) {
			int x2 = Integer.parseInt(x);
			sum = sum + x2;
		}
		
//		int[] s5Int = new int[s5Array.length];
//		for (int i = 0; i < s5Array.length; i++) {
//			s5Int[i] = Integer.parseInt(s5Array[i]);
//			System.out.println(s5Int[i]);
//			sum += s5Int[i];
//		}
		
		System.out.println(sum);
		
		
		
//	7.  위 6번에서 생성된 String[]의 값을 새로운  int[]로 옮겨서 오름차순 정렬후, 프린트!

		System.out.println("위 6번에서 생성된 String[]의 값을 새로운  int[]로 옮겨서 오름차순 정렬후, 프린트!");
		
		System.out.println(s5Array.length);
		int[] newArray = new int[s5Array.length];//{0,0,0,0,0}
		//{"10", "20", "30", ~~~}
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = Integer.parseInt(s5Array[i]);
		}
		
		System.out.println(Arrays.toString(newArray));

	}

}
