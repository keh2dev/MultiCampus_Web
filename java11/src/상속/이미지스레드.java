package 상속;

public class 이미지스레드 extends Thread {

	@Override
	public void run() {
		String[] images = {
				"1.png", "2.png", "3.png", "4.png", "5.png"
		};
		for (int i = 0; i < images.length; i++) {
			System.out.println("이미지>> " + images[i]);
			try {
				Thread.sleep(5000); //5초재워라! //ms(밀리세컨즈)
				if (i == (images.length -1)) { // 이미지 스레드 3초마다 무한으로 돌리기!
					i = (-1); 
				}
			} catch (Exception e) {
				System.out.println("cpu 연결 문제 생김.");
			}
		}
	}
}
