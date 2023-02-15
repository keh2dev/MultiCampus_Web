package 메서드연습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 예매하기 {
	final static int[] PRICE = { 20000, 10000};
	static int totalPrice = 0;
	
	public void reserve() {
		int[] count = { 0, 0 };
		
		JFrame f2 = new JFrame();
		f2.setSize(370, 200);
		f2.getContentPane().setBackground(Color.yellow);
		FlowLayout flow = new FlowLayout();
		f2.setLayout(flow);
		f2.setTitle("인원 및 가격 확인");
		Font font = new Font("gungseo", Font.ITALIC, 20);
		
		JLabel priceJLabel = new JLabel("성인 : 20000원, 어린이 : 10000원");
		priceJLabel.setFont(font);
		JButton adultButton = new JButton("성인");
		adultButton.setFont(font);
		JLabel adultJLabel = new JLabel("0");
		adultJLabel.setFont(font);
		JButton kidButton = new JButton("어린이");
		kidButton.setFont(font);
		JLabel kidJLabel = new JLabel("0");
		kidJLabel.setFont(font);
		JLabel total = new JLabel("0원");
		total.setFont(font);
		JButton okButton = new JButton("예매확인");
		okButton.setFont(font);
		
		okButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f2,"예매완료!");
				
			}
		});
		
		adultButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count[0]++;
				totalPrice = totalPrice + PRICE[0];
				adultJLabel.setText(count[0]+"");
				total.setText(totalPrice + "원");
			}
		});
		
		kidButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count[1]++;
				totalPrice = totalPrice + PRICE[1];
				kidJLabel.setText(count[1]+"");
				total.setText(totalPrice + "원");
			}
		});
		
		f2.add(priceJLabel);
		f2.add(adultButton);
		f2.add(adultJLabel);
		f2.add(kidButton);
		f2.add(kidJLabel);
		f2.add(total);
		f2.add(okButton);
		
		f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f2.setVisible(true);
		
	}
}
