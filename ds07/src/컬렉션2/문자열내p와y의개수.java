package 컬렉션2;

import java.util.HashMap;

public class 문자열내p와y의개수 {

	public static void main(String[] args) {
		boolean answer = true;

		String s = "pPoooyY";
		//p와 y의 개수가 대소문자 상관없이 동일하면 true 아니면 false
		//대소문자 상관없다 ==> 대문자를 소문자로 바꿔라.
		String s2 = s.toLowerCase();
		
		HashMap<String, Integer> map = new HashMap<>();
		
		String[] s3 = s2.split("");
		
		for (String key : s3) {
			map.put(key, map.getOrDefault(key, 0)+1);
		}
		System.out.println(map);
		
		System.out.println(map.get("p")==map.get("y"));
	}

}
