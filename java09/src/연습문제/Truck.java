package 연습문제;

public class Truck extends Car{
	int tire;

	public Truck(String name, String color, int tire) {
		super(name, color);
		this.tire = tire;
	}
	
	@Override
	public String toString() {
		return "truck [tire=" + tire + ", name=" + name + ", color=" + color + "]";
	}

	public void run() {
		System.out.println("힘차게 달리다.");
	}
	public void carry() {
		System.out.println("짐을 실다.");
	}
	
	
}
