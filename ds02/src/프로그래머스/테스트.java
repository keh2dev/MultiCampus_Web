package 프로그래머스;

import java.util.*;

public class 테스트 {

	public static void main(String[] args) {
		int[] arr = { 5, 9, 7, 10 };
		int divisor = 5;
		Solution sol = new Solution();
		int[] answer = sol.solution(arr, divisor);
		System.out.println(Arrays.toString(answer));
	}
}

class Solution {
	public int[] solution(int[] arr, int divisor) {
		int count = 0;
        int count2 = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                count++;
            }
        }
        
        if(count == 0){
            int[] answer = {-1};
            return answer;
        }
        
        int[] answer = new int[count];
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                answer[count2] = arr[i];
                count2++;
            }
        }
        
        Arrays.sort(answer);
        return answer;
	}
}