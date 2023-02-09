package 제어문문제;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 인기조사2 {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(300, 600);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		JLabel title = new JLabel();
		title.setText("K-pop 인기 투표");
		JLabel iuTitle = new JLabel();
		iuTitle.setText("1. 아이유");
		JLabel iuCount = new JLabel();
		iuCount.setText("0 명");
		JLabel newjeansTitle = new JLabel();
		newjeansTitle.setText("2. 뉴진스");
		JLabel newjeansCount = new JLabel();
		newjeansCount.setText("0 명");
		JLabel btsTitle = new JLabel();
		btsTitle.setText("3. BTS");
		JLabel btsCount = new JLabel();
		btsCount.setText("0 명");

		JButton iuButton = new JButton();
		JButton newjeansButton = new JButton();
		JButton btsButton = new JButton();

		ImageIcon iuIcon = new ImageIcon("iu.jpeg");
		ImageIcon newjeansIcon = new ImageIcon("newjeans.jpeg");
		ImageIcon btsIcon = new ImageIcon("bts.jpeg");

		iuButton.setIcon(iuIcon);
		newjeansButton.setIcon(newjeansIcon);
		btsButton.setIcon(btsIcon);

		Font font1 = new Font("D2Coding", 1, 30);
		Font font2 = new Font("D2Coding", 2, 20);

		title.setFont(font1);
		iuTitle.setFont(font2);
		newjeansTitle.setFont(font2);
		btsTitle.setFont(font2);

		f.add(title);
		f.add(iuButton);
		f.add(iuTitle);
		f.add(iuCount);
		f.add(newjeansButton);
		f.add(newjeansTitle);
		f.add(newjeansCount);
		f.add(btsButton);
		f.add(btsTitle);
		f.add(btsCount);

		iuButton.addActionListener(new ActionListener() {
			int iu = 0;

			public void actionPerformed(ActionEvent arg0) {
				iu++;
				iuCount.setText(iu + " 명");
			}
		});

		newjeansButton.addActionListener(new ActionListener() {
			int newjeans = 0;

			public void actionPerformed(ActionEvent arg0) {

				newjeans++;
				newjeansCount.setText(newjeans + " 명");
			}
		});

		btsButton.addActionListener(new ActionListener() {
			int bts = 0;

			public void actionPerformed(ActionEvent arg0) {
				bts++;
				btsCount.setText(bts + " 명");
			}
		});

		f.setVisible(true);
	}

}
