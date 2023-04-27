package heap01;

import java.util.*;

public class 더맵게01 {

	public static void main(String[] args) {
		int[] scoville = {1, 2, 3, 9, 10, 12};
		int K = 7;
		Solution sol = new Solution();
		int answer = sol.solution(scoville, K);
		System.out.println(answer);

	}

}

class Solution {
    public int solution(int[] scoville, int K) {
    	
    	Arrays.sort(scoville);
    	
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	
    	for (int i = 0; i < scoville.length; i++) {
			
		}
    	
    	int count = 0;
    	for (int i = 1; i < scoville.length; i++) {
			int mix = scoville[i-1] + (scoville[i]*2);
			if (mix>=K) {
				count = i;
				break;
			} else {
				scoville[i-1] = 0;
				scoville[i] = mix;
				Arrays.sort(scoville);
			}
		}
    	
    	if(scoville[scoville.length-1] < K){
            count =-1;
        }
            
        
        int answer = count;
        return answer;
    }
}