package 코딩기초트레이닝;

import java.util.*;

public class 대소문자바꿔서출력하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();

		char[] arr = a.toCharArray();

		for (int i = 0; i < a.length(); i++) {
			if (Character.isUpperCase(arr[i])) {
				System.out.print(Character.toLowerCase(arr[i]));
			} else if (Character.isLowerCase(arr[i])) {
				System.out.print(Character.toUpperCase(arr[i]));
			}
		}
	
	}
}
