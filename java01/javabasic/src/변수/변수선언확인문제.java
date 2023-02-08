package 변수;

public class 변수선언확인문제 {

	public static void main(String[] args) {
		// 내 정보중 기본데이터에 속하는 정보를 변수에 넣고, 출력해보세요!
		int age = 34;// 정수
		double height = 173.7;// 실수
		char gender = '남';// 문자
		boolean man = true;// 논리
		
		//기본데이타X ==> 너무 많이 쓰기 때문에 기본형처럼 기본형 데이터처럼 사용 가능!!
		String name = "홍길동"; // 여러글자를 쓸 때는 ""
		// 스트링, 실!!
		
		// 프린트~
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		System.out.println("성 : " + gender);
		System.out.println("진짜 남자인가요? " + man);
		System.out.println("이름 : " + name);
	}

}