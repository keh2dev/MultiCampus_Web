package 복습;

public class 직원 {
	public String name; // 같은 +다른 패키지(아무데서나 접근 가능)
	String address; // 같은 패키지에서만 접근 가능
	protected int salary; // 같은 패키지 + 다른 패키지(상속할 때만) 가능, 거의 안씀.
	private int rrn; // 이 클래스 안에서만 가능!
	
	public int getRrn() {
		System.out.println(rrn);
		return rrn;
	}
	
}
