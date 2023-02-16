package 상속;

public class 우먼 extends 사람{

	int speed;

	public 우먼(String name, int age, int speed) {
		super(name, age);
		this.speed = speed;
	}
	
	public void run() {
		System.out.println("무지 빠르게 달리다.");
	}
	
}
