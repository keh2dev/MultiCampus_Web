package 문자열;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 문자열내림차순배치2 {

	public static void main(String[] args) {
		String s= "Zbcdefg";
		String answer = "";
		
		char[] c = s.toCharArray();
		Arrays.sort(c);
		
		String s2 = new String(c);
		System.out.println(s2);
		
		StringBuilder sb = new StringBuilder(s2);
		answer = sb.reverse().toString();
		
		System.out.println(answer);
	}
}
