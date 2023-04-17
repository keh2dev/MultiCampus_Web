package 컬렉션;

import java.util.*;

public class set반복자이터레이터 {

	public static void main(String[] args) {
		HashSet<String> bag = new HashSet<String>();
		bag.add("휴대폰");
		bag.add("휴지");
		bag.add("볼펜");
		bag.add("볼펜");
		System.out.println(bag.size());
		System.out.println(bag);
		
		//set에서 꺼내올때는 iterator를 만들어 주어야한다.
		Iterator<String> it = bag.iterator();
		System.out.println(it.hasNext());//있는지 없는지 체크
		for (int i = 0; i < bag.size(); i++) {
			String x = it.next();
			System.out.println(x);
		}
		
		
	}

}
