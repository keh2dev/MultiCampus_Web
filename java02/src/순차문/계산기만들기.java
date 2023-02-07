package 순차문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 계산기만들기 {

	public static void main(String[] args) {
		// 필요한 부품 10개 => RAM에 부품을 만들어 넣어놓자.
		// JFrame, ImageIcon, JLabel 3개
		// JTextField 2개
		// Font, FlowLayout
		// JButton
		JFrame frame = new JFrame();
		frame.setSize(170, 500);
		
		FlowLayout flowLayout = new FlowLayout();
		frame.setLayout(flowLayout);
		
		JLabel label1 = new JLabel();
		JLabel label2 = new JLabel();
		JLabel label3 = new JLabel();
		
		ImageIcon icon = new ImageIcon("image01.png");
		label1.setIcon(icon);
		
		label2.setText("숫자1");
		label3.setText("숫자2");

		JTextField input1 = new JTextField(10);
		JTextField input2 = new JTextField(10);
		
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JButton b3 = new JButton();
		JButton b4 = new JButton();
		JButton b5 = new JButton();
		b1.setText("+");
		b2.setText("-");
		b3.setText("*");
		b4.setText("/");
		b5.setText("=");
		
		Font font = new Font("Gungseo", 1, 15);
		label2.setFont(font);
		label3.setFont(font);
		
		label2.setForeground(Color.red);
		label3.setForeground(Color.blue);
		input1.setForeground(Color.green);
		input1.setBackground(Color.yellow);
		input2.setForeground(Color.green);
		input2.setBackground(Color.yellow);
		
		frame.add(label1);
		frame.add(label2);
		frame.add(input1);
		frame.add(label3);
		frame.add(input2);
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		frame.add(b5);
		
		frame.setVisible(true);
	}

}
