package 배열응용;

import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 랜덤버튼배열2 {

	public static void main(String[] args) {
//		1. 프레임을 만들어보세요
		JFrame f = new JFrame();

//		2. 프레임 설정해보세요.
		f.setSize(1000, 1100);
		f.setLayout(null);
		f.setTitle("버튼 마구잡이 만들기!!!!");

//		3. 버튼을 넣을 배열을 먼저 만들어주세요. 500개
		JButton[] buttons = new JButton[500];

//		4. 버튼을 500개 만들어서 배열에 넣어주세요.
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(i + "번 버튼!");
		}

//		5. 배열에 있는 버튼을 꺼내서 위치를 지정 후, f에 붙여주세요.
		Random r = new Random();

		Color[] colors = { Color.red, Color.blue, Color.pink, Color.gray, Color.green };
		Random r2 = new Random();
		for (int i = 0; i < buttons.length; i++) {
			buttons[i].setBounds(r.nextInt(900), r.nextInt(900), 100, 100);

//			심화-1)) 버튼 색을 몇가지 지정해서 임의로 설정, 힌트 color배열! 맥이라 버튼 배경 칼라가 안되용...
//			buttons[i].setForeground(colors[r2.nextInt(5)]);
			buttons[i].setBackground(colors[r2.nextInt(colors.length)]);
			buttons[i].setOpaque(true);
			buttons[i].setBorderPainted(false);
			f.add(buttons[i]);
		}

//		심화-2)) f에 배경색을 넣어보세요.
		f.getContentPane().setBackground(Color.cyan);

		f.setVisible(true);
	}

}
