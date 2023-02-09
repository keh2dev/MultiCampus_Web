package 제어문문제;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 부품만들기2 {

	public static void main(String[] args) {
		// 자주 사용하지 않는 부품을 만들어보자.
		// 틀!!이 있어서 그 틀을 가지고 찍어서 필요한 부품을 만들어 cpu가 조립!
		// new : 틀을 가지고 찍어낼 때 사용
		// new JFrame()는 JFrame이라는 틀을 이용해서 부품을 찍어내라!
		// 만든 부품은 모두다 ram에 저장되어야 한다.
		// f변수를 만들어서 부품을 넣어주세요.
		// f에는 JFrame이 저장되어야 함.
		JFrame f = new JFrame();
		f.setSize(150, 300);

		// 물흐르듯이 순서대로 배치해주는 부품을 램에 복사해서 가져다 놓아야함.
		// FlowLayout
		FlowLayout flow = new FlowLayout();
		// f에 물흐르듯이 배치해주는 부품을 쓰겠다라고 조립(설정)
		f.setLayout(flow);

		JButton b1 = new JButton();
		b1.setText("회원가입 처리");

		JLabel text1 = new JLabel();
		text1.setText("아이디");
		JLabel text2 = new JLabel();
		text2.setText("패스워드");
		JLabel text3 = new JLabel();
		text3.setText("이름");
		JLabel text4 = new JLabel();
		text4.setText("전화번호");
		JLabel text5 = new JLabel();
		text5.setText("");

		// 글자 넣는 곳..
		JTextField input1 = new JTextField(15);
		JTextField input2 = new JTextField(15);
		JTextField input3 = new JTextField(15);
		JTextField input4 = new JTextField(15);

		Font font = new Font("D2Coding", 1, 15);
		text1.setFont(font);
		text2.setFont(font);
		text3.setFont(font);
		text4.setFont(font);
		text5.setFont(font);
		input1.setFont(font);
		input2.setFont(font);
		input3.setFont(font);
		input4.setFont(font);
		b1.setFont(font);

		input1.setBackground(Color.green);
		input2.setBackground(Color.green);
		input3.setBackground(Color.green);
		input4.setBackground(Color.green);

		f.add(text1);
		f.add(input1);
		f.add(text2);
		f.add(input2);
		f.add(text3);
		f.add(input3);
		f.add(text4);
		f.add(input4);
		f.add(b1);
		f.add(text5);

		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String idString = input1.getText();
				String pwString = input2.getText();
				String nameString = input3.getText();
				String phoneString = input4.getText();
				
				JOptionPane.showMessageDialog(f, "아이디 : " + idString + "\n비밀번호 : " + pwString  + "\n이름 : " + nameString  + "\n전화번호 : " + phoneString);
				
//				if (idString.equals("root") && pwString.equals("1234")) {
//					JOptionPane.showMessageDialog(f, "로그인 성공!");
//				} 
			}
		}); // b1

		f.setVisible(true);
	}

}
