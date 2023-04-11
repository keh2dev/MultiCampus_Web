package 문자열;

import java.util.Arrays;
import java.util.List;

public class 스트링을배열로2 {

	public static void main(String[] args) {
		String all = "국어, 영어, 수학, 컴퓨터";
		// 1. String[]로 바꿔보세요.
		String[] s = all.split(",");
		System.out.println(Arrays.toString(s));
		// 2. 바꾸었더니 공백이 포함되어있다면, 공백을 모두 제거 후, 다시 배열에 넣으세요.
		for (int i = 0; i < s.length; i++) {
			s[i] = s[i].trim();
		}
		System.out.println(Arrays.toString(s));
		// 3. 과목수는?
		System.out.println("과목수는 " + s.length);
		// 4. 컴퓨터의 위치는?
		for (int i = 0; i < s.length; i++) {
			if (s[i].equals("컴퓨터")) {
				System.out.println("컴퓨터 인덱스는 " + i);
			}
		}
		//리스트로 변경해서 확인!
		List<String> list = Arrays.asList(s);
		System.out.println("리스트로 확인한 컴퓨터 인덱스는 " + list.indexOf("컴퓨터"));
		
		
		// 5. 과목명이 3글자 미만인 과목수는?
		int count = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i].length() < 3) {
				count++;
			}
		}
		System.out.println("과목명 3글자 미만인 과목 수는 " + count);
	}

}
