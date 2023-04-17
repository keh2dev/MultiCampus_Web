package 문자열;

import java.util.Arrays;

public class String에서Char배열에옮기기2 {

	public static void main(String[] args) {
		String s = "s205621"; //string도 index를 이용해서 추출가능
		
		char[] result = new char[2];
		s.getChars(3, 5, result, 0);
		System.out.println(Arrays.toString(result));

		//모든 글자를 String[]로 옮겨보세요.
		//첫번째 글자와 마지막 글자를 결합시켜 프린트(s1)
		
		String[] all = s.split("");
		System.out.println(all[0]+all[all.length -1]); //10
	}

}
