package 문자열;

public class 문자열실습1 {

	public static void main(String[] args) {
		String s = "나는 프로그래머프야";
		String s2 = "진짜";
		System.out.println(s+s2); // 스트링 합치기
		System.out.println(s.concat(s2)); // 스트링 합치기
		System.out.println(s.charAt(0)); // 문자 1글자 추출
		System.out.println(s.endsWith("야")); //"야"로 끝나는지 체크
		System.out.println(s.substring(3)); // 인덱스 3 이후 값 출력
		System.out.println(s.substring(3, 8)); // 인덱스 3~7까지 값 출력
		System.out.println(s.contains(s2)); // 
		System.out.println(s.lastIndexOf("프"));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.length());
		System.out.println(s.replace("나", "너"));

	}

}
