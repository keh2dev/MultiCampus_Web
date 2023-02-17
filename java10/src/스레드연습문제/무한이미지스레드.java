package 스레드연습문제;

public class 무한이미지스레드 extends Thread {

	public void run() {
		String[] images = { "1.png", "2.png", "3.png"};
		for (int i = 0; i < images.length; i++) {
			System.out.println("이미지>> " + images[i]);
			try {
				Thread.sleep(3000);
				if (i == (images.length -1)) { // 이미지 스레드 3초마다 무한으로 돌리기!
					i = (-1); 
				}
			} catch (Exception e) {
				System.out.println("cpu 연결 문제 생김.");
			}
		}
	}
}
