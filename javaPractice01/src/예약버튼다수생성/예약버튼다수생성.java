package 예약버튼다수생성;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 예약버튼다수생성 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1000, 1000);
		
		FlowLayout flow = new FlowLayout();
		
		f.setLayout(flow);
		
		String[] buttonStrings = new String[500];
			
		for (int i = 0; i < buttonStrings.length; i++) {
			JButton button = new JButton();
			button.setText("버튼"+i);
			
			button.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
				button.setText("예약");
					
				}
			});
			f.add(button);
		}
		
		
		f.setVisible(true);

	}

}
