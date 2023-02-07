package 순차문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 부품만들기2 {

	public static void main(String[] args) {
		
		// 안보고 해보기
		JFrame j = new JFrame();
		j.setSize(500, 500);
		
		FlowLayout flow = new FlowLayout();
		j.setLayout(flow);
		
		JButton b1 = new JButton();
		b1.setText("확인");
		
		JLabel id1 = new JLabel();
		id1.setText("id : ");
		
		JLabel pw1 = new JLabel();
		pw1.setText("pw1 : ");
		
		JTextField input1 = new JTextField(10);
		JTextField input2 = new JTextField(10);
		
		Font font = new Font("굴림", 1, 15);
		id1.setFont(font);
		pw1.setFont(font);
		b1.setFont(font);
		
		b1.setBackground(Color.blue); // 배경 
		b1.setForeground(Color.red); // 글자색 
		id1.setForeground(Color.red);
		
		ImageIcon icon1 = new ImageIcon("dog1.png");
		
		b1.setIcon(icon1);
		
		
		j.add(id1);
		j.add(input1);
		j.add(pw1);
		j.add(input2);
		j.add(b1);
		
		j.setVisible(true);
		
		
	}

}
