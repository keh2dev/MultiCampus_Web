package 상속응용;

public class 동시프로그램실행2 {

	public static void main(String[] args) {
		$스레드 달러 = new $스레드();
		골뱅이스레드 골뱅이 = new 골뱅이스레드();
		앤드스레드 앤드 = new 앤드스레드();

		달러.start();
		골뱅이.start();
		앤드.start();
	}

}
