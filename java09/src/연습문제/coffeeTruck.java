package 연습문제;

public class coffeeTruck extends Truck{
	String usage;

	public coffeeTruck(String name, String color, int tire, String usage) {
		super(name, color, tire);
		this.usage = usage;
	}

	@Override
	public String toString() {
		return "coffeeTruck [usage=" + usage + ", tire=" + tire + ", name=" + name + ", color=" + color + "]";
	}
	
	public void carry() {
		System.out.println("커피를 실다.");
	}
	
	public void give() {
		System.out.println("커피를 주다.");
	}
	
}
