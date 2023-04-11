package 프로그래머스;

import javax.annotation.PostConstruct;

public class 배열의연산3 {

	public static void main(String[] args) {
		
		//두수를 곱했을 떄 가장 큰 숫자를 구해보세요~
		//배열이 오름차순으로 정렬이 되어 있는 상태!
		Solution5 sol = new Solution5();
		int[] numbers = { -30, -10, 3, 4, 5, 6, 7, 8, 9, 10 };
		int answer = sol.solution(numbers); // int[]
		System.out.println(answer);
	}
}

class Solution5 {
	public int solution(int[] numbers) {
		int answer1 = numbers[numbers.length-1] * numbers[numbers.length-2];
		int answer2 = numbers[0] * numbers[1];
		int answer=0;
		if(answer1>answer2) {
			answer=answer1;
		} else {
			answer=answer2;
		}
		
		return answer;
	}
}