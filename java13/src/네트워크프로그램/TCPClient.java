package 네트워크프로그램;

import java.net.Socket;

public class TCPClient {

	public static void main(String[] args) throws Exception {
		// 서버랑 클라이언트랑
		// 양쪽에 전화기 역할을 하는 소켓이 있어야함.
		// 클라이언트에서 소켓을 만드어주면, 서버 소켓으로
		// 승인 요청을 보냄.
		for (int j = 0; j < 10000; j++) {
			Socket socket = new Socket("localhost", 9100);
			System.out.println("클라이언트" + j + ": 서버와 연결 성공!");
		}
	}

}
