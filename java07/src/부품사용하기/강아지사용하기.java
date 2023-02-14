package 부품사용하기;

import 부품만들기.강아지;

public class 강아지사용하기 {

	public static void main(String[] args) {
		강아지 dog1 = new 강아지();
		dog1.이름 = "보리";
		dog1.크기 = "소형견";
		dog1.나이 = 2;
		System.out.println(dog1.이름 + ", " + dog1.크기 + ", " + dog1.나이 + "살");
		dog1.놀기();

		강아지 dog2 = new 강아지();
		dog2.이름 = "가을";
		dog2.크기 = "소형견";
		dog2.나이 = 12;
		System.out.println(dog2.이름 + ", " + dog2.크기 + ", " + dog2.나이 + "살");
		dog2.먹기();
	}

}
