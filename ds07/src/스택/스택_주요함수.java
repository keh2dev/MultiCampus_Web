package 스택;

import java.util.*;

public class 스택_주요함수 {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		//선입후출(FILO)
		stack.add("홍길동");
		stack.add("김길동");
		stack.add("송길동");
		stack.push("정길동");
		System.out.println(stack);
		System.out.println(stack.get(0));
		System.out.println(stack.get(1));
		System.out.println(stack.get(2));
		System.out.println(stack.get(3));
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.get(0));
		System.out.println(stack.get(1));
		System.out.println(stack.get(2));
	}

}
