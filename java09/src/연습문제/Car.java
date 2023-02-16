package 연습문제;

public class Car {
	String name;
	String color;
	
	public Car(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}

	@Override
	public String toString() {
		return "car [name=" + name + ", color=" + color + "]";
	}
	
	public void on() {
		System.out.println("시동을 키다.");
	}
	
	public void run() {
		System.out.println("달리다.");
	}
	
	
}
