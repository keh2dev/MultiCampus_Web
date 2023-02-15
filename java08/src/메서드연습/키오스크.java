package 메서드연습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 키오스크 {
	static int totalCount = 0;
	static int totalPrice = 0;
	final static int PRICE = 20000;
	public static void main(String[] args) {
		String[] img = { "image1.png", "image2.png", "image3.png"};
//		int[] chickenPrice = { 18000, 18000, 16000 };
		int[] chickenCount = { 0, 0, 0};
		
		JFrame f = new JFrame();
		f.setSize(380, 450);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		Font font = new Font("gungseo", Font.ITALIC, 20);
		f.getContentPane().setBackground(Color.yellow);
		
		f.setTitle("고추바사삭 갯수 : " +chickenCount[0]+"개, "+ "불금 갯수 : "+chickenCount[0]+"개, "+ "오리지날 갯수 : "+chickenCount[0] + "개");
		JButton btn1 = new JButton("고추바사삭");
		btn1.setFont(font);
	
		JButton btn2 = new JButton("불금");
		btn2.setFont(font);
		
		JButton btn3 = new JButton("오리지날");
		btn3.setFont(font);
				
		JLabel label1 = new JLabel("개수 : ");
		label1.setFont(font);

		JTextField countTotal = new JTextField(10);
		countTotal.setText(totalCount+"개");
		countTotal.setFont(font);
		
		JLabel image = new JLabel();
		ImageIcon icon = new ImageIcon(img[0]);
		image.setIcon(icon);
				
		JLabel pay = new JLabel("결제금액 : ");
		pay.setFont(font);
		JLabel total = new JLabel(totalPrice + "원");
		total.setFont(font);
		
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(img[0]);
				image.setIcon(icon);
				chickenCount[0]++;
				totalCount++;
				totalPrice = totalPrice + PRICE;
				countTotal.setText(totalCount+"개");
				total.setText(totalPrice + "원");
				f.setTitle("고추바사삭 갯수 : " +chickenCount[0]+"개, "+ "불금 갯수 : "+chickenCount[0]+"개, "+ "오리지날 갯수 : "+chickenCount[0] + "개");
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(img[1]);
				image.setIcon(icon);
				chickenCount[1]++;
				totalCount++;
				totalPrice = totalPrice + PRICE;
				countTotal.setText(totalCount+"개");
				total.setText(totalPrice + "원");
				f.setTitle("고추바사삭 갯수 : " +chickenCount[0]+"개, "+ "불금 갯수 : "+chickenCount[0]+"개, "+ "오리지날 갯수 : "+chickenCount[0] + "개");
			}
		});
		
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(img[2]);
				image.setIcon(icon);
				chickenCount[2]++;
				totalCount++;
				totalPrice = totalPrice + PRICE;
				countTotal.setText(totalCount+"개");
				total.setText(totalPrice + "원");
				f.setTitle("고추바사삭 갯수 : " +chickenCount[0]+"개, "+ "불금 갯수 : "+chickenCount[0]+"개, "+ "오리지날 갯수 : "+chickenCount[0] + "개");
			}
		});
		
		
		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(label1);
		f.add(countTotal);
		f.add(image);
		f.add(pay);
		f.add(total);
		

		// 프로그램 끝나면 자동으로 exit!!!
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}	

}
