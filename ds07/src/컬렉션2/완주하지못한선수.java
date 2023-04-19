package 컬렉션2;

import java.util.HashMap;

public class 완주하지못한선수 {

	public static void main(String[] args) {
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		
		HashMap<String, Integer> map = new HashMap<>();
		
		for (String key : participant) {
			map.put(key, map.getOrDefault(key, 0) + 1);
		}
		System.out.println(map);
		
		String answer = "";
		for (String key2 : completion) {
			map.put(key2, map.get(key2)-1);
		}
		System.out.println(map);
		
		for (String key : participant) {
			if(map.get(key)!=0) {
				answer = key;
			}
		}
		System.out.println(map);
		
		System.out.println(answer);
	}

}
