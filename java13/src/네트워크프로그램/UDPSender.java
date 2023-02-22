package 네트워크프로그램;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSender {

	public static void main(String[] args) throws Exception {
		//UDP용 소켓이 있어야 함.
		DatagramSocket socket = new DatagramSocket(); //전화기역할
		
		//UDP용 패킷이 있어야 함.(데이터, 데이터의 크기, ip, port)
		String s = "i am java programmer..";
		byte[] data = s.getBytes();
		InetAddress ip = InetAddress.getByName("127.0.0.1");
		DatagramPacket packet = new DatagramPacket(data, data.length, ip, 7100);
		
		//소켓을 이용해서 패킷을 보낸다.!
		socket.send(packet);
		System.out.println("클라이언트 포트>> " + socket.getLocalPort());
		socket.close(); //전화기를 끊는다.!
	}
}