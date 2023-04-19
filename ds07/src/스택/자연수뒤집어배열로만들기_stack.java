package 스택;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

import javax.sql.rowset.serial.SerialArray;

public class 자연수뒤집어배열로만들기_stack {

	public static void main(String[] args) {
		long n = 12345;
		
		String[] s = String.valueOf(n).split("");
		int[] answer = new int[s.length];
		Stack<String> stack = new Stack<>();
		for (String c : s) {
			stack.push(c);
		}

		for (int i = 0; i < s.length; i++) {
			answer[i]= Integer.parseInt(stack.pop()); 
		}
		
		System.out.println(Arrays.toString(answer));
		System.out.println(Arrays.toString(s));
	
	}

}
