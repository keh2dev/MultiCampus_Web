package 배열;

import java.util.Scanner;

public class 입력해서배열에넣기4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[] numbers = new double[5];
		System.out.println("숫자 5개를 입력해주세요");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextDouble();
		}
		sc.close();
		
		for (double d : numbers) {
			System.out.println(d);
		}
		
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 22.2) {
			count++;
			}
		}
		
		System.out.println("22.2의 개수는 : " +count+"개");
	}

}