package 배열응용;

import javax.swing.JOptionPane;

public class 입력받아평균 {

	public static void main(String[] args) {
//		입력을 여러번 여러개 받아서 저장공간에 넣고 싶을 때
//		배열을 사용하자!
//		1. 배열을 만들어주세요.
		int[] jumsu = new int[5];

//		배열에 값을 넣을 때는 index가 필요 ==> i가 있는 for문 사용해야함.
		for (int i = 0; i < jumsu.length; i++) {
			String data = JOptionPane.showInputDialog("숫자 입력");
			// 숫자로 변환한 값을 배열의 해당 인덱스에 값으로 넣자.
			jumsu[i] = Integer.parseInt(data);
		}
		for (int x : jumsu) {
			System.out.print(x + " ");
		}
		System.out.println();

//		1. 전체 합계 구해서, 평균을 구해보세요.
		int sum = 0;
		
		for (int x : jumsu) {
			sum = sum + x; // sum += x;
		}
		
		System.out.println("전체합계: " + sum);
		
		double avg = (double)sum / jumsu.length;
		System.out.println("전체평균: " + avg);
		
		
//		2. 300이상되는 숫자만 찾아서, 합계를 구해보세요.
		int sum300 = 0;
		
		for (int y : jumsu) {
			if (y>=300) {
				sum300 = sum300 + y;
			}
		}
		System.out.println("300이상 숫자 합계 : " + sum300);
		
//		3. 심화문제, 300이상 되는 위치인 index를 프린트.
		System.out.print("300이상 인덱스값 :");
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i]>=300) {
				System.out.print(" " + i);
			} 
		}
		
	}

}
