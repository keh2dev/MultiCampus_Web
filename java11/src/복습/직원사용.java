package 복습;

public class 직원사용 {

	public static void main(String[] args) {
		직원 work = new 직원();
		work.name = "홍길동";
		work.address = "강남구";
		work.salary = 100;
//		work.rrn = 1212; // private이라 사용불가.
		
		
		work.getRrn();
	}

}
