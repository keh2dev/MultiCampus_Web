package 컬렉션2;

import java.util.HashMap;

public class 우승자투표찾기_map2 {
	public static void main(String[] args) {
		String[] all = {"홍길동", "김길동", "정길동", "홍길동", "김길동", "홍길동"};
		String[] find = {"홍길동", "김길동", "정길동"};
		String answer = "";
		
		HashMap<String, Integer> map = new HashMap<>();
		
		System.out.println(map);
		for (String x : all) {
			//System.out.println(map.get(x)+1);
			map.put(x, map.getOrDefault(x,0)+1);
		}
		System.out.println(map);
		int max = 0;
		for (String key : map.keySet()) {
			System.out.println(key+ ": " + map.get(key));
			if(map.get(key)>max) {
				max = map.get(key);
				System.out.println("현재까지 우승자는 "+max+"표를 받은 "+key);
			}

		}
		
	}
}