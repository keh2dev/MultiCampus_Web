package 컬렉션2;

import java.util.*;

public class K번째큰수 {

	public static void main(String[] args) {
		int[] num = {3,4,5,1,2};
		int k = 2; //두번째 큰수
		Arrays.sort(num);
		int answer = num[num.length-2];

		System.out.println(answer);
	}

}
