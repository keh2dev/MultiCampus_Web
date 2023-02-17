package 상속기본;

public class FlyCar사용 {

	public static void main(String[] args) {
		FlyCar f = new FlyCar();

		f.color = "흰색";
		f.fly = true;
		System.out.println(f.color);
		System.out.println(f.fly);
		f.run();
		f.fly();
	}

}
