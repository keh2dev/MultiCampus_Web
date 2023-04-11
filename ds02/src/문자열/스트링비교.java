package 문자열;

public class 스트링비교 {

	public static void main(String[] args) {
		String s = "정길동";
		String s2 = "정길동";
		//String은 s를 프린트할 때, 그 주소가 가르키는 char들 프린트되게
		//재정의 되어있는 객체(toString() 오버라이드)
		System.out.println(s);
		System.out.println(s2);
		//String이 가르키는 char들이 동일한지 비교 equals()
		System.out.println(s.equals(s2));
		//String에 들어있는 주소가 동일한지 비교 ==
		System.out.println(s == s2);
		
		StringBuilder s3 = new StringBuilder();
		s3.append("김길동");
		System.out.println(s3);
	}

}