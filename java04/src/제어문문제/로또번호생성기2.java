package 제어문문제;

import java.util.Random;

public class 로또번호생성기2 {

	public static void main(String[] args) {
		// 아무값이나 발생시키는 부품 ==> Random
		// 가짜 랜덤한 값 만들어주는 부품.
		Random r = new Random(); //씨앗값, seed값!
		
//		for (int i = 0; i < 6; i++) {
//			System.out.println("로또 번호 : " + (r.nextInt(45) + 1)); //1~45
//		}

		// 2 ~ 10까지 나오게
		for (int i = 0; i < 6; i++) {
			System.out.println(r.nextInt(9) + 2); //0~8 = +2 => 2~10
		}
		
		System.out.println("");
		
		// 3 ~ 30까지 나오게
		for (int i = 0; i < 6; i++) {
			System.out.println(r.nextInt(28) + 3); //0~27 = +3 => 3~30
		}
		
	}

}
