package 형변환;

import java.util.LinkedList;

public class 시험일정 {

	public static void main(String[] args) {
		LinkedList 시험일정 = new LinkedList();
		시험일정.add("국어");
		시험일정.add("수학");
		시험일정.add("영어");
		시험일정.add("컴퓨터");
		System.out.println(시험일정);
		시험일정.remove();
		System.out.println(시험일정);
		시험일정.remove();
		System.out.println(시험일정);
		시험일정.remove();
		System.out.println(시험일정);

	}

}
