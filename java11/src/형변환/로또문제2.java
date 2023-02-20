package 형변환;

import java.util.HashSet;
import java.util.Random;

public class 로또문제2 {

	public static void main(String[] args) {
		Random r = new Random();
		HashSet lotto = new HashSet();
		for (int i = 0; lotto.size() < 6; i++) {
			lotto.add(r.nextInt(45) + 1); //1~45
		}
		System.out.println(lotto.size());
		System.out.println(lotto);
	}

}
