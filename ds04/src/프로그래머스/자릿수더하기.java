package 프로그래머스;

public class 자릿수더하기 {

	public static void main(String[] args) {
		int n = 1234;
		Solution sol = new Solution();
		int answer = sol.solution(n);
		System.out.println(answer);
	}
}

class Solution {
    public int solution(int n) {
    	int answer = 0;
        
        while(n>0){
        	System.out.println(n);
            answer=answer+n%10;
            n=n/10;
        }
        
        return answer;
    }
}