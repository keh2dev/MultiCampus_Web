package 배열;

public class 배열다루기 {

	public static void main(String[] args) {
//		int[] x = new int[10];
////		length : 10 실제로는 12개의 변수가 만들어짐.
////		index는 0부터 시작하기에 마지막 위치의 인덱스는 10보다 작음.
////		0~9
//		x[0] = 10;
//		x[1] = 20;
//
////		System.out.println(x[0]);
////		System.out.println(x[1]);
////		System.out.println(x[2]);
//
//		for (int i = 0; i < x.length; i++) {
//			System.out.print(x[i]+" ");
//		}
//		System.out.println();
		
//		우리가족의 성별을 char로 저장하고 프린트!
//		우리가족의 이름을 String[]로 저장, 프린트!
//		우리가족의 시력을 double[]로 저장, 프린트!
//		우리가족의 점심을 먹었는지 boolean[]로 저장, 프린트!
		char[] gender = {'남', '여', '여'};
		for (int i = 0; i < gender.length; i++) {
			System.out.print(gender[i]+" ");
		}
			
		System.out.println();
		
		String[] name = {"은호", "인경", "보리"};
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i]+" ");
		}
		
		System.out.println();
		
		double[] eye = { 1.2, 1.5, 2.0 };
		for (int i = 0; i < eye.length; i++) {
			System.out.print(eye[i] + " ");
		}
		
		System.out.println();
		
		boolean[] lunch = { true, false, true };
		for (int i = 0; i < lunch.length; i++) {
			System.out.print(lunch[i] + " ");
		}
	}

}
