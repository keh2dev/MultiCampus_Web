package 상속;

public class 원더우먼 extends 우먼{
	boolean beam;
	
	public 원더우먼(String name, int age, int speed, boolean beam) {
		super(name, age, speed);
		this.beam = beam;
	}
	
	public void eat() {
		System.out.println("조금 먹다.");
	}
	
	public void attack() {
		System.out.println("이름은 " + name);
		System.out.println("빔을 쏘다.");
	}

	@Override
	public String toString() {
		return "원더우먼 [beam=" + beam + ", speed=" + speed + ", name=" + name + ", age=" + age + "]";
	}

	

}

