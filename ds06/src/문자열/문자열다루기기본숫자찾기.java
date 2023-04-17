package 문자열;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 문자열다루기기본숫자찾기 {

	public static void main(String[] args) {
		String s = "a234"; // false
		// String s = "1234"; //true

		boolean answer = false;

		// 0. 4~6글자 일 경우

		if (s.length() == 4 || s.length() == 6) {
			// 1. 글자 하나씩 떨어뜨려라.
			// for문 돌려서 글자 하나하나가 0~9사이면 됨.
			char[] c = s.toCharArray();
			System.out.println(Arrays.toString(c));

			for (char x : c) {
				if (x >= '0' && x <= '9') {
					answer = true;
				}
			}
		} else {
			answer = false;
		}

		
		//2. 숫자로 바꾸어서 에러가 생기면 문자가 포함되어 있음.
		
		if (s.length() == 4 || s.length() == 6) {
			try {
				Integer.parseInt(s);
			} catch (NumberFormatException e) {
				answer =false;
			}
		} else {
			answer = false;
		}
		
		System.out.println(answer);
	}
}
