package 연산자;

public class 비교연산자2 {

	public static void main(String[] args) {
		// 기본형데이터만 비교 가능. 스트링은 불가~
		int id = 1111; // 변수에 값을 넣을 때 = 사용!
		int id2 =2222;
		
		int pw = 3333;
		int pw2 = 3333;
		
		
		// 비교할땐 == 사용!!
		System.out.println("같은지 비교 " + (id==id2));
		System.out.println("같은지 비교 " + (pw==pw2));
		System.out.println("같지 않은지 비교 " + (id!=id2));
		System.out.println("같지 않은지 비교 " + (pw!=pw2));
		System.out.println("큰지 비교 " + (id>id2));
		System.out.println("큰지 비교 " + (pw>pw2));
		System.out.println("크거나 같은지 비교 " + (id>=id2));
		System.out.println("크거나 같은지 비교 " + (pw>=pw2));
	}

}
