package 문자열;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 서울에서김서방찾기 {

	public static void main(String[] args) {
		String[] seoul= {"Jane", "Kim"};
		String answer = "";
		
		for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("Kim")) {
				answer=i+"";
			}
		}
		
		System.out.println(answer);
	}
}
