package 컬렉션2;

import java.util.HashMap;

public class HashMap확인문제 {

	public static void main(String[] args) {
		String[] fruit = {"apple","banana","apple","banana","melon","apple"};
		
		HashMap<String, Integer> map = new HashMap<>();

		int maxValue = 0;
		String maxKey = "";
		for (String key : fruit) {
			map.put(key, map.getOrDefault(key, 0)+1);
			if(map.get(key)>maxValue) {
				maxValue=map.get(key);
				maxKey=key;
			}
		}
		
		System.out.println(map.toString());
		System.out.println("최다득표 "+maxKey+" : "+maxValue);
		System.out.println(map.keySet());
		System.out.println(map.values());
	}

}
