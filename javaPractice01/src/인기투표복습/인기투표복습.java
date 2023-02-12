package 인기투표복습;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 인기투표복습 {

	public static void main(String[] args) {
		JFrame f = new JFrame();

		FlowLayout flow = new FlowLayout();

		f.setLayout(flow);

		f.setSize(300, 800);

		JLabel titleLabel = new JLabel();
		titleLabel.setText("====인기투표 시스템====");

		JLabel btsLabel = new JLabel();
		btsLabel.setText("BTS 0표");
		JLabel iuLabel = new JLabel();
		iuLabel.setText("아이유 0표");
		JLabel newjeansLabel = new JLabel();
		newjeansLabel.setText("뉴진스 0표");

		ImageIcon btsIcon = new ImageIcon("01.jpeg");
		ImageIcon iuIcon = new ImageIcon("02.jpeg");
		ImageIcon newjeansIcon = new ImageIcon("03.jpeg");

		JButton btsButton = new JButton();
		btsButton.setIcon(btsIcon);
		JButton iuButton = new JButton();
		iuButton.setIcon(iuIcon);
		JButton newjeansButton = new JButton();
		newjeansButton.setIcon(newjeansIcon);

		Font titleFont = new Font("gungseo", 1, 20);
		titleLabel.setFont(titleFont);

		f.add(titleLabel);
		f.add(btsButton);
		f.add(btsLabel);
		f.add(iuButton);
		f.add(iuLabel);
		f.add(newjeansButton);
		f.add(newjeansLabel);

		btsButton.addActionListener(new ActionListener() {
			int bts = 0;

			public void actionPerformed(ActionEvent e) {
				bts++;
				btsLabel.setText("BTS " + bts + "표");
			}
		});

		iuButton.addActionListener(new ActionListener() {
			int iu = 0;

			public void actionPerformed(ActionEvent e) {
				iu++;
				iuLabel.setText("아이유 " + iu + "표");
			}
		});

		newjeansButton.addActionListener(new ActionListener() {
			int newjeans = 0;

			public void actionPerformed(ActionEvent e) {
				newjeans++;
				newjeansLabel.setText("뉴진스 " + newjeans + "표");
			}
		});

		f.setVisible(true);

	}

}
