package 컬렉션2;

import java.util.*;

public class K번째큰수3_중복0_정렬0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt(); //입력할 개수
		int k = sc.nextInt(); // k번째 큰수
		//TreeSet<- 3,4,5,1,2
		TreeSet<Integer> set = new TreeSet<>();//오름차순
		//TreeSet<Integer name = new TreeSet<>(Collections.reverseOrder()));//내림차순
		for (int i = 0; i < size; i++) {
			set.add(sc.nextInt());
		}
		System.out.println(set);
		Object[] result = set.toArray();
		System.out.println(result[result.length - k]);
	}
}
