package 조건문;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 설문조사10명 {

	public static void main(String[] args) {
		int full = 0;
		int noFull = 0;
		int noAnswer = 0;
		
		for (int i = 0; i < 10; i++) {
			String data = JOptionPane.showInputDialog("배부른가요? 1) 배부름 2) 배안부름");
			if (data.equals("1")) {
				full++;
			} else if (data.equals("2")) {
				noFull++;
			} else {
				
			}
		}
		
//		System.out.println("배부른 사람 몇명? " + full + "명");
//		System.out.println("안배부른 사람 몇명? " + noFull + "명");
		
		JFrame frame = new JFrame();
		
		JOptionPane.showMessageDialog(frame, "배부른 사람 " + full + "명\n"+"안배부른 사람 " + noFull + "명");
	}

}
