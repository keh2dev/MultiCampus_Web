package 컬렉션2;

import java.util.Scanner;
import java.util.TreeSet;

public class K번째작은수트리 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력할 개수?");
		int size = sc.nextInt(); //입력할 개수
		System.out.println("몇번째로 작은 수?");
		int k = sc.nextInt(); // k번째 작수
		
		TreeSet<Integer> set = new TreeSet<>();//오름차순
		//TreeSet<Integer> name = new TreeSet<>(Collections.reverseOrder()));//내림차순
		for (int i = 0; i < size; i++) {
			set.add(sc.nextInt());
		}
		
		System.out.println(set);
		Object[] arr = set.toArray();
		System.out.println(arr[k-1]);
	}

}
