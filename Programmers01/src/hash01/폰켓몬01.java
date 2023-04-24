package hash01;

import java.util.*;

public class 폰켓몬01 {

	public static void main(String[] args) {
		int[] nums = {3,1,2,3};
		Solution sol = new Solution();
		int answer = sol.solution(nums);
		System.out.println(answer);

	}
}
	
class Solution {
    public int solution(int[] nums) {
    	HashSet<Integer> nums2 = new HashSet<Integer>();
    	//폰켓몬 종류를 파악하기 위해
    	//중복된 데이터를 허용하지 않는 컬렉션인 HashSet 선언.
    	for (int x : nums) {
			nums2.add(x);
		}
    	//nums 배열의 값을 nums2 해쉬셋에 저장하여 폰켓몬 종류를 나타내는 해쉬셋 생성.
    	//상기 세줄의 코드를
    	//HashSet<Integer> nums2 = new HashSet<>(Arrays.asList(nums));
    	//로 선언 및 데이터 삽입이 될 것 같은데 안되는 이유가 궁금함.
 
    	int answer = 0;
    	if ((nums.length/2)<nums2.size()) {
            answer = (nums.length/2);
            // 폰켓몬 총 개수의 절반이 폰켓몬 종류의 수보다 작으면
            // 고를 수 있는 폰켓몬의 수는 폰켓몬 총 개수의 절반밖에 안되므로 이를 리턴.
		} else {
			answer = nums2.size();
			// 폰켓몬 총 개수의 절반이 폰켓몬 종류의 수보다 크거나 작으면
            // 고를 수 있는 폰켓몬의 수는 폰켓몬 종류의 수와 같으므로 이를 리턴.
		}
        return answer;
    }
}