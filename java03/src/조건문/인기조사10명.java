package 조건문;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 인기조사10명 {

	public static void main(String[] args) {
		// 인기투표해봅시다.!! 10명에게 받아봅시다.!!
		// 1)아이유 2)뉴진스 3)BTS
		int iu = 0;
		int newjeans = 0;
		int bts = 0;

		for (int i = 0; i < 10; i++) {
			String data = JOptionPane.showInputDialog("인기투표해주세요. 1)아이유 2)뉴진스 3)BTS");
			if (data.equals("1")) {
				iu++;
			} else if (data.equals("2")) {
				newjeans++;
			} else if (data.equals("3")) {
				bts++;
			} 
		}

		System.out.println("인기투표 결과!");
		System.out.println("아이유 " + iu + "명");
		System.out.println("뉴진스 " + newjeans + "명");
		System.out.println("BTS " + bts + "명");

		JFrame frame = new JFrame();

		JOptionPane.showMessageDialog(frame,
				"인기투표 결과!\n" + "아이유 " + iu + "명\n" + "뉴진스 " + newjeans + "명\n" + "BTS " + bts + "명");
	}

}
