package 컬렉션2;

import java.util.Arrays;
import java.util.Scanner;

public class K번째작은수배열 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력할 개수?");
		int size = sc.nextInt(); //입력할 개수
		System.out.println("몇번째로 작은 수?");
		int k = sc.nextInt(); // k번째 작수

		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i]=(sc.nextInt());
		}
		
		Arrays.sort(arr);
		
		System.out.println(arr[k-1]);
	}

}
