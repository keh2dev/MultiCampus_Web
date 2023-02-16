package 스태틱;

public class 나의일지 {

	public static void main(String[] args) {
		Day day1 = new Day("자바공부", 8, "집");
		System.out.println(Day.sum);
		Day day2 = new Day("점심먹기", 1, "집");
		System.out.println(Day.sum);
		Day day3 = new Day("저녁먹기", 1, "부천시청근방");
		System.out.println(Day.sum);
		Day day4 = new Day("영화보기", 3, "CGV");
		System.out.println(Day.sum);
		//총 12개 다이나믹 생성, 멤버변수 ==> 객체생성할 때마다 다이나믹하게 무더기영역(heap)에 생긴 변수
		//인스턴스 변수라고 부른다!!
		
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
		System.out.println(day4);
		
	}

}
