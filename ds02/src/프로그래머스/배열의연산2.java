package 프로그래머스;

public class 배열의연산2 {

	public static void main(String[] args) {
		Solution4 sol = new Solution4();
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int answer = sol.solution(numbers); // int[]
		System.out.println(answer);
	}
}

class Solution4 {
	public int solution(int[] numbers) {
		int sum = 0;
		for (int i = (numbers.length-1); i > (numbers.length-4); i--) {
			System.out.println(i);
			sum = sum+numbers[i];
		}
		int answer = sum;
		return answer;
	}
}