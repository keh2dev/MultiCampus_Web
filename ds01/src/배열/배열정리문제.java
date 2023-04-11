package 배열;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.function.BiConsumer;

import javax.xml.bind.ParseConversionEvent;

public class 배열정리문제 {

	public static void main(String[] args) {
		
//		1. int값 5개 55, 66, 77, 22, 33 입력받아서, 최소값을 구해 프린트해보세요.
//			1) 배열 사용해야함.	
//			2) Scanner사용해야함.		
		
		System.out.println("1. 최소값을 구할 5개 숫자 입력 하시오.");
		Scanner sc = new Scanner(System.in);
		int[] a1 = new int[5];
		
		for (int i = 0; i < a1.length; i++) {
			a1[i] = sc.nextInt();
		}
		
		sc.close();
		
		int min = a1[0];
		for (int x : a1) {
			if (x<min) {
				min=x;
			}
		}
		
		System.out.println("최소값은 " + min);
		
		Arrays.sort(a1);
		System.out.println("최소값은 " + a1[0]);
		

//		2. 랜덤한 값 20개를 발생시켜 , 값의 범위 0~899를 빈 배열에 넣은 후,
//		   최대값을 구해 프린트해보세요.
		System.out.println("2. 랜덤값 20개 중 최대값 프린트");
		Random r = new Random(5);
		int[] a2 = new int[20];
		
		for (int i = 0; i < a2.length; i++) {
			a2[i]= r.nextInt(900); 
		}
		
		Arrays.sort(a2);
		System.out.println("최대값은 : " + a2[19]);
		
//		3. String s1 = “참좋다", String s2 = “진짜좋다" 두 문자열이 동일한지 프린트, 
//		   s1 s2글자수를 비교하여 누가 더 큰지 프린트
		System.out.println("3. 두 문자열 동일 여부 비교 및 글자 수 비교");
		String s1 = "참좋다";
		String s2 = "진짜좋다";
		if (s1.equals(s2)) {
			System.out.println("문자열 동일");
		} else {
			System.out.println("문자열 다름");
		}
		
		if (s1.length() > s2.length()) {
			System.out.println("s1이 큼");
		} else if (s2.length() > s1.length()) {
			System.out.println("s2가 큼");
		} else {
			System.out.println("같다");
		}
		
		
//		4. String s3 = “나는 진짜 java programmer가 되었어" 에서 “java programmer만 추출하여 
//		   모두 대문자로 변경후 프린트
		System.out.println("4. java programmer만 추출하여 모두 대문자로 변경후 프린트");
		String s3 = "나는 진짜 java programmer가 되었어";
		String s33 = s3.substring(6, 21);
		String s333 = s33.toUpperCase();
		System.out.println(s333);
		
//		5. String s4 = “2056521”에서 2를 추출하여 1인 경우 남자, 2인 경우 여자로 프린트 
		System.out.println("5. 2056521에서 2를 추출하여 1인 경우 남자, 2인 경우 여자로 프린트");
		String s4= "2056521";
		char s44 = s4.charAt(0);
		if (s44 == '1') {
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}
		


	}
}
