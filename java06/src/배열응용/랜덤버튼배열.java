package 배열응용;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 랜덤버튼배열 {

	public static void main(String[] args) {
//		배열에는 기본형만 들어가는 것이 아니고, 참조형도 가능!
//		정수, 실수, 문자1, 논리 + String, JButton 등!

		JFrame f = new JFrame();
		f.setSize(1000, 800);
//		버튼 200개 들어갈 배열을 만들자
//		버튼 200개를 만들어 배열에 저장하자
		JButton[] buttons = new JButton[8000];

		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("버튼 " + i);
		}

//		위치 지정해서 넣어주자!
		f.setLayout(null); // 위치 자동 지정하는 부품 안쓸거야~
		
		Random r = new Random();
		for (int i = 0; i < buttons.length; i++) {
			int x = r.nextInt(800);
			int y = r.nextInt(700);
			buttons[i].setBounds(x, y, 100, 50);
			f.add(buttons[i]);
		}
		
		f.setVisible(true);
	}

}
