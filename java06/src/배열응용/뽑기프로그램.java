package 배열응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 뽑기프로그램 {
	static int staticCount = 0;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(400, 500);
		f.getContentPane().setBackground(Color.pink);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		JLabel title = new JLabel("뽑기프로그램 하나만 꽝!!");
		Font titleFont = new Font("D2Coding", 1, 30);
		title.setFont(titleFont);
		title.setForeground(Color.red);
		f.add(title);

		JLabel result = new JLabel("결과창!");
		Font resultFont = new Font("D2Coding", 0, 20);
		result.setFont(resultFont);
		result.setForeground(Color.blue);

		JButton[] btn = new JButton[25];
		Random r = new Random();
		int bomb = r.nextInt(25); // 꽝 번호

		System.out.println(bomb);
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(i + "번");
			f.add(btn[i]);
			int num = i;
			btn[i].addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					if (num != bomb) {

						Font resultFont = new Font("D2Coding", 0, 20);
						result.setFont(resultFont);
						result.setForeground(Color.blue);
						staticCount++;
						result.setText(num + "번 생존! 누적 벌칙금 : " + (staticCount * 10000) + "원");
						btn[num].setEnabled(false);
					} else {
						Font resultFont = new Font("D2Coding", 1, 25);
						result.setFont(resultFont);
						result.setForeground(Color.red);
						btn[num].setOpaque(true);
						btn[num].setBorderPainted(false);
						btn[num].setBackground(Color.red);
						staticCount++;
						result.setText(num + "번 꽝! 총 벌칙금 : " + (staticCount * 10000) + "원");
						btn[num].setEnabled(false);
						JOptionPane.showMessageDialog(f, "꽝!!벌칙당첨!! 총 벌칙금 : " + (staticCount * 10000) + "원");
					}
				}
			});
		}

		f.add(result);

		f.setVisible(true);
	}

}
