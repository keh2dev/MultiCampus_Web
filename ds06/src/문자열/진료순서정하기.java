package 문자열;

import java.util.*;

public class 진료순서정하기 {

	public static void main(String[] args) {
		int[] emergency = {3, 76, 24};
		int[] emergency2 = Arrays.copyOf(emergency, emergency.length);
		int[] result = new int[emergency.length];
		
		Arrays.sort(emergency2);
		System.out.println(Arrays.toString(emergency));
		System.out.println(Arrays.toString(emergency2));
		
	}
}
