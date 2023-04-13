package 프로그래머스;

import java.util.Arrays;

public class 짝수는싫어요 {

	public static void main(String[] args) {
		int n = 4;
		Solution3 sol = new Solution3();
		int[] answer = sol.solution(n);
		System.out.println(Arrays.toString(answer));
	}
}

class Solution3 {
	public int[] solution(int n) {
		//정답이 들어갈 배열의 길이 계산해주어야 함 짝수  => 1/2, 홀수 => 1/2 + 1(자기자신)
		int size = 0;
		if (n%2==0) {
			size = n/2;
		} else {
			size = n/2 +1;
		}
		System.out.println(size);
		int[] answer = new int[size];
		int j=0;
		for (int i = 1; i <= n; i++) {
			if(i%2==1) {
				answer[j]=i;
				j++;
			}
		}
		return answer;
	}
}