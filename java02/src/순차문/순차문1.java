package 순차문;

// 부품이 있는 위치를 알려주는 역
import javax.swing.JOptionPane;

public class 순차문1 {

	public static void main(String[] args) {
		// 기본 순차문 --> 입력 --> 처리 --> 출력 
		// 입력 -> 부품사용, 망치같은 언제나 바로 사용할 수 있는 것! 사용해보자!
		String data1 = JOptionPane.showInputDialog("정수/실수 를 입력하시오-1");
		String data2 = JOptionPane.showInputDialog("정수/실수 를 입력하시오-2");
		// 처리 -> 글자연결
		int data11 = Integer.parseInt(data1); // "200" --> 200
		int data22 = Integer.parseInt(data2); // "200" --> 200

		double data33 = Double.parseDouble(data1); // "200" --> 200
		double data44 = Double.parseDouble(data2); // "200" --> 200
		int result1 = data11 + data22; // 결과는 스트링으로 저
		double result2 = data33 + data44; // 결과는 스트링으로 저
		// 출력 -> 모니터 화면에 보이고 싶음.
		System.out.println(result1);
		System.out.println(result2);
	}

}