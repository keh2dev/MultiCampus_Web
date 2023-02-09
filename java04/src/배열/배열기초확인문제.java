package 배열;

public class 배열기초확인문제 {

	public static void main(String[] args) {
//		1. int크기 5인 배열을 생성해보세요
//		2. 배열의 크기를 프린트해보세요.
//		3. 배열의 첫번째 위치에 100을 넣어서, 프린트.
//		4. 배열의 마지막 위치에 500을 넣어서, 프린트.
//		5. 배열의 3번째 위치에 200을 넣어서, 프린트.
//		6. 배열의 전체 데이터를 프린트.
//		7. 배열의 전체 데이터를 인덱스와 함께 프린트.
//		8. 그림으로 그려보세요!.
		
//		1. 답안.
		int[] i = new int[5];
		
//		2. 답안.
		System.out.println(i.length);
		
//		3. 답안.
		i[0] = 100;
		System.out.println(i[0]);
		
//		4. 답안.
		i[4] = 500;
		System.out.println(i[4]);
		
//		5. 답안.
		i[2] = 200;
		System.out.println(i[2]);
		
//		6. 답안.
		for (int j = 0; j < i.length; j++) {
			System.out.print(i[j] + " ");
		}
		
		System.out.println();
		
//		7. 답안.
		for (int j = 0; j < i.length; j++) {
			System.out.println("배열 " + j + "번에 " + i[j]);
		}
				

	}

}
