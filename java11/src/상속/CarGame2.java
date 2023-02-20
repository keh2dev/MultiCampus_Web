package 상속;

import java.awt.Component;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class CarGame2 extends JFrame {

	public static void main(String[] args) {
		CarGame2 f = new CarGame2();
	}

	public CarGame2() {
		setTitle("나의 자동차 경주게임");
		setSize(500, 500);
		setLayout(null);
		
		MyThread car1 = new MyThread("car01.png", 100, 0);
		MyThread car2 = new MyThread("car02.png", 100, 150);
		MyThread car3 = new MyThread("car03.png", 100, 300);

		car1.start();
		car2.start();
		car3.start();

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public class MyThread extends Thread {
		int x, y;
		JLabel label;

		String name;
		
		public MyThread(String file, int x, int y) {
			this.x = x;
			this.y = y;
			ImageIcon icon = new ImageIcon(file);
			this.name = file.substring(3, 5);
			label = new JLabel();
			label.setIcon(icon);
			label.setBounds(x, y, 300, 200);
			add(label);
		}

		@Override
		public void run() {
			// 동시에 실행하고 싶은 내용!!
			// 모든 스레드가 오른쪽으로 움직이고 싶음.
			// 화면에서 오른쪽으로 움직이는 것은 x을 늘려주는 것.!
			Random r = new Random();
			for (int i = 0; i < 200; i++) {
				int move = r.nextInt(50); // 0~49
				x = x + move; // 100 + 45

				label.setBounds(x, y, 300, 200); // 다시 위치 지정
				if (x>=300) {
					
					Component f = null;
					JOptionPane.showMessageDialog(f, name + "번 도착!");
					break;
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
