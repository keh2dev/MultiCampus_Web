package 복습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 부품조립하기 {

	public static void main(String[] args) {
		// 1. 자주써서 Ram에 언제든 사용할 수 있도록 준비되어있음.
		// 망치.
		// 부품명.기능();
		// 2. 쓸때마다 제공되는 틀을 이용해 찍어내어 여러개 만들어 ram에
		// 저장해두고 사용.
		// 벽돌
		// 벽돌 b1 = new 벽돌();
		// 벽돌 b2 = new 벽돌();
		// 벽돌 b3 = new 벽돌();

		JFrame f = new JFrame();
		f.setSize(400, 300);

		JLabel l = new JLabel();
		l.setText("당신이 생각한 숫자를 입력하세요.");

		JTextField text = new JTextField(20);

		JButton b = new JButton();
		b.setText("숫자맞추기게임");

		FlowLayout flow = new FlowLayout();

		Font font = new Font("D2coding", 1, 20);
		Font font2 = new Font("D2coding", 1, 30);

		f.setLayout(flow);
		f.add(l);
		f.add(text);
		f.add(b);
		
		l.setFont(font);
		l.setForeground(Color.red);
		text.setBackground(Color.yellow);
		text.setForeground(Color.blue);
		b.setFont(font2);

		f.setVisible(true);
	}

}
