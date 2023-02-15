package 메서드연습;


public class 내가게3 {

	public static void main(String[] args) {
		계산기3 cal = new 계산기3();
		int price = 7000;
		int count1 = 5; // 오전에 온 손님 수
		int count2 = 4; // 오후에 온 손님 수
		
		//계산기3을 이용해주세요.
		
		//1. 전체 손님 수를 반환 받아서 다음과 같이 프린트
		//	 오늘 온 손님의 총 합은 9명입니다.
		int result1 = cal.add(count1,count2);
		System.out.println("오늘 온 손님의 총 합은 " + result1 + "명 입니다.");
		
		//2. 오전과 오후 손님 수 차이는?
		//   손님 수 차이는 1명입니다.
		int result2 = cal.sub(count1,count2);
		System.out.println("손님 수 차이는 " + Math.abs(result2) + "명 입니다.");
		// Math.abs() 절대값
		// Math.PI -> 파이값 표시
		// Math.ceil(3.334) ->올림
		// Math.floor 내림
		// Math.rount(3.334) -> 반올림
		// math.sqrt(100) -> 루트
		
		//3. 오전에 들어온 손님의 결제 금액은?
		//   오전 결제금액은 35000원입니다.
		int result3 = cal.mul(price, count1);
		System.out.println("오전 결제금액은 " + result3 + "원 입니다.");
		
		//4. 오후에 들어온 손님의 결제 금액은?
		//   오후 결제금액은 28000원입니다.
		int result4 = cal.mul(price, count2);
		System.out.println("오후 결제금액은 " + result4 + "원 입니다.");
		
		//5. 오전과 오후에 들어온 손님의 총 결제 금액은?
		//   오늘 하루 총 결제금액은 63000원입니다.
		int result5 = cal.add(result3, result4);
		System.out.println("총 결제금액은 " + result5 + "원 입니다.");
		
		//6. 5번에서 계산한 결제금액으로 1인당 결제금액을 계산해주세요.
		double result6 = cal.div(result5, result1);
		System.out.println("1인당 결제 금액은 "+ Math.round(result6) +"원 입니다.");
	}

}
