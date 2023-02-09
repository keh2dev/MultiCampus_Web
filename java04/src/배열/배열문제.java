package 배열;

public class 배열문제 {

	public static void main(String[] args) {
//		1. 배열에 일주일간 공부한 시간을 저장해보세요.
//		   {1,2,3,4,5,6,7}, 배열이름 - week
//		2. 첫번째 위치와 두번째 위치값을 프린트
//		3. week배열에 들어있는 데이터 수를 프린트
//		4. 세번째 위치값을 10으로 넣어주세요.
//		   다섯번째 위치값을 12로 넣어주세요.
//		5. 세번째, 다섯번째 위치값을 프린트
//		--------------------------------------
//		6. 배열을 처음에 만들 때 값을 모름. 크기는 4개
//		   저장공간을 일단 만들어두자. 배열이름 tour
//		7. 첫번째 인덱스에 20, 세번째 위치에 30을 넣고나서, 프린트해보세요.
//		8. tour변수의 개수를 프린트

//		1. 답안
		int[] week = { 1, 2, 3, 4, 5, 6, 7 };

//		2. 답안
		System.out.println(week[0]);
		System.out.println(week[1]);

//		3. 답안
		System.out.println(week.length);

//		4. 답안
		week[2] = 10;
		week[4] = 12;

//		5. 답안
		System.out.println(week[2]);
		System.out.println(week[4]);

//		6. 답안
		int[] tour = new int[4];

//		7. 답안
		tour[0] = 20;
		tour[2] = 30;
		System.out.println(tour[0]);
		System.out.println(tour[2]);

//		8. 답안
		System.out.println(tour.length);

	}

}
