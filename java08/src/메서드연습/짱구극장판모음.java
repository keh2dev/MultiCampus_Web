package 메서드연습;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 짱구극장판모음 {

	static int index = 2;

	public static void main(String[] args) {
		String[] title = { "천하떡잎학교", "낙서왕국", "사라진아빠", "로봇아빠", "나의신부" };
		String[] img = { "001.jpeg", "002.jpeg", "003.jpeg", "004.jpeg", "005.jpeg" };
		double[] jumsu = { 9.25, 9.32, 9.04, 9.12, 8.84 };

		JFrame f = new JFrame();
		f.setSize(370, 405);
		f.getContentPane().setBackground(Color.yellow);

		Font font = new Font("gungseo", Font.BOLD, 40);

		// 배치부품(객체)를 바꾸어주지 않으면 경계레이아웃을 사용하도록 세팅되어있다.
		// BorderLayout
		JLabel top = new JLabel(title[index]);
		top.setForeground(Color.red);
		top.setFont(font);
		top.setHorizontalAlignment(0);
		f.add(top, BorderLayout.NORTH);

		JLabel center = new JLabel();
		ImageIcon icon = new ImageIcon(img[index]);
		center.setIcon(icon);
		center.setFont(font);
		center.setHorizontalAlignment(0);
		f.add(center, BorderLayout.CENTER);

		JLabel under = new JLabel(String.valueOf(jumsu[index]));
		under.setForeground(Color.blue);
		under.setFont(font);
		under.setHorizontalAlignment(0);
		f.add(under, BorderLayout.SOUTH);

		JButton left = new JButton("<<");
		left.setFont(font);
		f.add(left, BorderLayout.WEST);
		left.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (index > 0) {
					index--;
				} else {
					index = 4;
				}
				top.setText(title[index]);
				under.setText(jumsu[index] + "");
				ImageIcon icon = new ImageIcon(img[index]);
				center.setIcon(icon);
			}
		});

		JButton right = new JButton(">>");
		right.setFont(font);
		f.add(right, BorderLayout.EAST);
		right.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (index < 4) {
					index++;
				} else {
					index =0;
				}
				top.setText(title[index]);
				under.setText(jumsu[index] + "");
				ImageIcon icon = new ImageIcon(img[index]);
				center.setIcon(icon);
			}
		});
		// 프로그램 끝나면 자동으로 exit!!!
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f.setVisible(true);
	}

}
