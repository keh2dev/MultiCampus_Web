package 스태틱;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class counter {
	static int count;
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 300);
		
		Font font1 = new Font("Gungseo", Font.ITALIC, 20);
		Font font2 = new Font("Gungseo", Font.BOLD, 100);
		
		JButton sub = new JButton("-1");
		JButton add = new JButton("+1");
		JButton zero = new JButton("0 Set");
		
		sub.setForeground(Color.magenta);
		add.setForeground(Color.magenta);
		sub.setForeground(Color.BLUE);
		sub.setFont(font1);
		add.setFont(font1);
		zero.setFont(font1);
		sub.setHorizontalAlignment(0);
		add.setHorizontalAlignment(0);
		zero.setHorizontalAlignment(0);
		
		
		JLabel num = new JLabel("0");
		num.setFont(font2);
		num.setHorizontalAlignment(0);
		num.setForeground(Color.red);
		
		
		
		f.add(sub, BorderLayout.WEST);
		f.add(add, BorderLayout.EAST);
		f.add(zero, BorderLayout.NORTH);
		f.add(num, BorderLayout.CENTER);
		

		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count--;
				num.setText(count+"");
			}
		});
		
		add.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				num.setText(count+"");
			}
		});
		
		zero.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count =0;
				num.setText(count+"");
			}
		});
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f.setVisible(true);
	}

}
