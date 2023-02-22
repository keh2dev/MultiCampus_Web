package 인터페이스;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.CountDownLatch;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class 글자길이판독기 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
//		f.getContentPane().setBackground(Color.cyan);
		f.setSize(300, 500);
		f.setLayout(new FlowLayout());
		
		Font font = new Font("gungseo", Font.BOLD, 30);
		
		JLabel charJLabel = new JLabel("Characters : ");
		JLabel wordJLabel = new JLabel("문장을 넣어주세요.");
		JTextArea area = new JTextArea(7, 10);
		JButton click = new JButton("글자 수 카운트");
		JButton color1 = new JButton("배경색 변경");
		JButton color2 = new JButton("글자색 변경");
		JButton clear = new JButton("문장 지우기");
		
		
		charJLabel.setFont(font);
		wordJLabel.setFont(font);
		area.setFont(font);
		click.setFont(font);
		color1.setFont(font);
		color2.setFont(font);
		clear.setFont(font);
		
		f.add(charJLabel);
		f.add(wordJLabel);
		f.add(area);
		f.add(click);
		f.add(color1);
		f.add(color2);
		f.add(clear);
		
		click.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = area.getText();
				int count = text.length();
				charJLabel.setText("Characters : " + count);
			}
		});
		
		
		color1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				area.setBackground(Color.yellow);
				
			}
		});
		
		color2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				area.setForeground(Color.red);
				
			}
		});
		
		clear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				area.setText("");
				
			}
		});
		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
