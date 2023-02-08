package 변수;

public class 변수선언 {

	public static void main(String[] args) {
		// 자바는 변수를 만들 때, 어떤 타입의 데이터를 넣는다.
		// 선언!! 타입 및 변수명!! ==> 변수 저장공간이 생성된다.
		// 기본데이터 => 정수, 실수, 문자1, 논
		int num = 100;//정수 변수
		double num2 = 22.2; //실수변수, 22.0, 22(정수 넣기 가능)
		char c = '한'; //글자 1글자 ==> ''
		boolean b = true; //false가
		num = 200; // ok!!
		//b =300; 안됨.
		System.out.println("정수값은 "+num+"이당~~");
		System.out.println("실수값은 "+num2);
		System.out.println("문자1개값 "+c);
		System.out.println("부울렌은 "+b);
	}

}