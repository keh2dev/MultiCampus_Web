package 문자열;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 수박수박수 {

	public static void main(String[] args) {
		int n = 3;
		String answer = "";
		StringBuilder s = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			if (i%2==0) {
				s.append("수");
			} else {
				s.append("박");
			}
		}
		
		answer = s.toString();

		System.out.println(answer);
	}
}
