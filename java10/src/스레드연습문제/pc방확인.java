package 스레드연습문제;

public class pc방확인 {

	public static void main(String[] args) {
		카운트스레드 count = new 카운트스레드();
		타이머스레드 timer = new 타이머스레드();
		무한이미지스레드 imageLoop = new 무한이미지스레드();
		count.start();
		timer.start();
		imageLoop.start();
	}

}
