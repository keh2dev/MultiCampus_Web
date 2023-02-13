package 배열심화;

public class 배열깊은복사 {

	public static void main(String[] args) {
		int[] num3 = {100, 200, 300};
		// int[] num4 = num3; //얕은 복사, 주소만 복사!
		int[] num4 = num3.clone(); // 깊은복사, 주소가 가리키고 있는 값들까지 전부 복사;
		
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num3 == num4); //주소가 같은지 비교!
		
	}

}
