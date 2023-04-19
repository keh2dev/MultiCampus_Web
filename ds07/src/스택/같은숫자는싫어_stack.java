package 스택;

import java.util.Stack;

public class 같은숫자는싫어_stack {

	public static void main(String[] args) {
		int[] arr = {1,1,3,3,0,1,1};
		
		Stack<Integer> stack = new Stack<>();
		stack.push(arr[0]);
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]!=stack.peek()) {
				stack.push(arr[i]);
			}
		}
		
		int[] answer = new int[stack.size()];
		
		for (int i = 0; i < answer.length; i++) {
			answer[i] = stack.get(i); 
		}
		
	}

}
