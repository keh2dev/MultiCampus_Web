package 문자열;

import java.util.*;

public class A로B만들기 {

	public static void main(String[] args) {
		String before = "allpe";
		String after = "apple";
		
		char[] b = before.toCharArray();
		char[] a = after.toCharArray();
		
		Arrays.sort(b);
		Arrays.sort(a);
		
		int answer = 1;
		
		for (int i = 0; i < a.length; i++) {
			if (b[i]!=a[i]) {
				answer = 0;
				break;
			}
		}
		
		System.out.println(answer);
	}
}
