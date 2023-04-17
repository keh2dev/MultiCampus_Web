package 문자열;

import java.util.*;

public class 문자열정렬하기2 {

	public static void main(String[] args) {
		String my_string = "Bcad";
		
		char[] my_string2 = my_string.toLowerCase().toCharArray();
		
		Arrays.sort(my_string2);
		
		String answer = String.valueOf(my_string2);
		
	}
}
