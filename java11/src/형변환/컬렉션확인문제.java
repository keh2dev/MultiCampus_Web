package 형변환;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class 컬렉션확인문제 {

	public static void main(String[] args) {
//		한번 갔던 여행지는 가지 않으려고 합니다. 
//		가고 싶은 여행지 5곳을 컬렉션으로 만들어서 전체 프린트
		HashSet set = new HashSet();
		set.add("부산");
		set.add("제주");
		set.add("남해");
		set.add("통영");
		set.add("여수");
		set.add("부산");
		System.out.println(set);
		System.out.println();
		
//		각 방에 물건 배치입니다. 
//		안방에는 TV, 거실에는 쇼파, 부엌에는 냉장고, 현관에는 신발의 정보를 컬렉션으로 만들어서 
//		1)전체 프린트, 2)현관에는 무엇이 있나요?, 3) 거실에 책상으로 변경하여 전체 프린트
		HashMap map = new HashMap();
		map.put("안방", "TV");
		map.put("거실", "쇼파");
		map.put("부엌", "냉장고");
		map.put("현관", "신발");
		System.out.println(map);// 1)전체 프린트
		System.out.println(map.get("현관"));// 2)현관에는 무엇이 있나요?
		map.replace("거실", "책상");//3) 거실에 책상으로 변경하여 전체 프린트
		System.out.println(map);
		System.out.println();
		
//		오늘 내가 할일 우선순위 5개 목록을 만들어서 
//		1)전체 프린트, 2)첫번째 할 일과 마지막 할 일 프린트, 
//		3) 2번째 할 일을 “청소”로 변경해서 전체 프린트
		ArrayList list = new ArrayList();
		list.add("기상");
		list.add("오전강의");
		list.add("점심먹기");
		list.add("오후강의");
		list.add("저녁먹기");
		System.out.println(list);//1)전체 프린트
		System.out.println(list.get(0)); //2)첫번째 할 일과 마지막 할 일 프린트
		System.out.println(list.get(list.size()-1));
		list.set(1, "청소"); //3) 2번째 할 일을 “청소”로 변경해서 전체 프린트
		System.out.println(list);
		
	}

}
