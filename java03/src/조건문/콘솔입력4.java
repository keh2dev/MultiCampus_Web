package 조건문;

import java.util.Scanner;

public class 콘솔입력4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력 >> ");
		int age = sc.nextInt();
		System.out.println("내년 나이는 " +(age+1)+ "세");
		
		System.out.print("키를 입력 >> ");
		double height = sc.nextDouble();
		System.out.println("당신의 내년 키는 " + (height+10));
		
		System.out.print("저녁을 먹었는지 입력 (true/false) >> ");
		boolean dinner = sc.nextBoolean();
		if (dinner==true) {
			System.out.println("배가 부르시겠군요!");
		} else {
			System.out.println("배가 고프시겠군요!");
		}
				
		System.out.print("올해 목표는? >> ");
		sc.nextLine();
		String target = sc.nextLine();
		System.out.println("올해 목표는 " +target);
		sc.close();
	}

}
