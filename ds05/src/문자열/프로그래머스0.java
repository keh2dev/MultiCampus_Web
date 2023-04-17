package 문자열;


public class 프로그래머스0 {

	public static void main(String[] args) {
		String my_string = "1a2b3c4d123";
		Solution sol = new Solution();
		int answer = sol.solution(my_string);
		System.out.println(answer);
	}
}

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for(int i=1; i<10; i++){
        	String i2 = String.valueOf(i);
            if(my_string.contains(i2)){
            	int count = my_string.length()-my_string.replace(i2, "").length();
            	answer=(i*count)+answer;
            }
        }
        
        return answer;
    }
}