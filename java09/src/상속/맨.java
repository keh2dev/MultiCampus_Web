package 상속;

public class 맨 extends 사람{
	//Object의 것들도 있다.
	//name, age
	//eat(), sleep()
	int power;
	
	public 맨(String name, int age, int power) {
		super(name, age);
		this.power = power;
	}
	
	public void run() {
		System.out.println("빨리 달리다.");
	}



}
