package 문자열;

import java.util.Arrays;

public class 문자열긴단어출력 {

	public static void main(String[] args) {
		String string = "i am a boy";
		String[] s = string.split(" ");
		
		String maxString = "";
		
		int max = s[0].length();
		for (int i = 0; i < s.length; i++) {
			if(maxString.length()<s[i].length()) {
				maxString = s[i];
				max = s[i].length();
			}
		}
		
		System.out.println(maxString);
		System.out.println(max);
	}

}
