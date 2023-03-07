package 화면DB연결;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MemberUI {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("나의 회원가입 화면");
		f.setSize(500, 420);
		
		JLabel l1 = new JLabel("<<<<회원가입화면>>>>");
		JLabel l2 = new JLabel("아이디");
		JLabel l3 = new JLabel("패스워드");
		JLabel l4 = new JLabel("이름");
		JLabel l5 = new JLabel("전화번호");
		
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		JTextField t4 = new JTextField(10);
		
		JButton b1 = new JButton("회원가입");
		JButton b2 = new JButton("회원탈퇴");
		JButton b3 = new JButton("회원수정");
		JButton b4 = new JButton("회원검색");
		
		FlowLayout flow = new FlowLayout();
		Font font = new Font("gungseo", Font.BOLD, 40);
		
		////필요한 부품(객체)를 ram에 가져다 놓고, 준비 끝 /////
		
		f.setLayout(flow);
		
		f.add(l1);
		f.add(l2);	f.add(t1);
		f.add(l3);	f.add(t2);
		f.add(l4);	f.add(t3);
		f.add(l5);	f.add(t4);
		f.add(b1);	f.add(b2);
		f.add(b3);	f.add(b4);
		
		l1.setFont(font);
		l2.setFont(font);	t1.setFont(font);
		l3.setFont(font);	t2.setFont(font);
		l4.setFont(font);	t3.setFont(font);
		l5.setFont(font);	t4.setFont(font);
		b1.setFont(font);	b2.setFont(font);
		b3.setFont(font);	b4.setFont(font);
		
		t1.setBackground(Color.yellow);
		t2.setBackground(Color.yellow);
		t3.setBackground(Color.yellow);
		t4.setBackground(Color.yellow);
		b1.setForeground(Color.blue);
		b2.setForeground(Color.blue);
		b3.setForeground(Color.blue);
		b4.setForeground(Color.blue);
		
		f.getContentPane().setBackground(Color.green);
		
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
