package 반복문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.jws.Oneway;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

public class 반복문확인문제 {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.setSize(170, 220);
		frame.getContentPane().setBackground(Color.green);

		JButton b1 = new JButton();
		b1.setText("별10");
		JButton b2 = new JButton();
		b2.setText("커피*5");
		JButton b3 = new JButton();
		b3.setText("커피*우유3");
		JButton b4 = new JButton();
		b4.setText("1:짱!");

		Font font = new Font("gungseo", 1, 25);

		FlowLayout flowLayout = new FlowLayout();
		frame.setLayout(flowLayout);

		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);

		b1.setForeground(Color.red);
		b2.setForeground(Color.blue);
		b3.setForeground(Color.red);
		b4.setForeground(Color.blue);

		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);

		// 1) 버튼에다가 액션기능을 추가하겠다고 설정
		// 2) 클릭액션이 있을 때 어떤 부품이 액션 처리를 어떻게 할지 코딩해주면 됩니다.
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리 내용을 여기에 써주세요!
				for (int i = 0; i < 10; i++) {
					System.out.print("*");
				}
				System.out.println();
			}
		});

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 5; i++) {
					System.out.print("커피*");
				}
				System.out.println();
			}
		});

		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 3; i++) {
					System.out.println("커피*우유");
				}

			}
		});

		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 3; i++) {
					System.out.println((i + 1) + " : 짱!");
				}

			}
		});

		frame.setVisible(true);

//		for (int i = 0; i < 10; i++) {
//			System.out.print("*");
//		}
//
//		System.out.println();
//
//		for (int i = 0; i < 5; i++) {
//			System.out.print("커피*");
//		}
//
//		System.out.println();
//
//		for (int i = 0; i < 3; i++) {
//			System.out.println("커피*우유");
//		}
//
//		for (int i = 0; i < 3; i++) {
//			System.out.println((i + 1) + " : 짱!");
//		}
	}

}
