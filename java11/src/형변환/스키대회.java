package 형변환;

import java.util.ArrayList;

public class 스키대회 {

	public static void main(String[] args) {
		ArrayList ski = new ArrayList();

		ski.add("박스키");
		ski.add("송스키");
		ski.add("김스키");
		ski.add("정스키");

		System.out.println(ski);
		System.out.println("2등 반칙으로 탈락!");
		ski.remove(1);

		System.out.println(ski);

		for (int i = 0; i < ski.size(); i++) {
			System.out.println(i + 1 + "등 : " + ski.get(i));
		}

		ArrayList ski2 = new ArrayList();
		ski2.add("이스키");
		ski2.add("박스키");
		ski2.add("양스키");
		ski.addAll(ski2); //파괴형함수
		System.out.println(ski);
		
		System.out.println(ski2.isEmpty()); // false
		ski2.clear(); // ski2 내용 전체 삭제!
		System.out.println(ski2.isEmpty()); // true
		System.out.println(ski2);
	}

}
