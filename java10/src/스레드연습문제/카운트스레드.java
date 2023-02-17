package 스레드연습문제;

public class 카운트스레드 extends Thread {

	public void run() {
		for (int i = 500; i > 0; i--) {
			System.out.println("카운트>> " + i);
			try {
				Thread.sleep(2000); //2초 재우기!
			} catch (Exception e) {
				System.out.println("cpu 연결 문제 생김.");
			}
		}
	}
}
