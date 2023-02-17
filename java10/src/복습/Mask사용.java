package 복습;

public class Mask사용 {

	public static void main(String[] args) {
		Mask mask1 = new Mask("흰색", 1000, 3);
//		mask1.color = "하얀색";
//		mask1.price = 1000;
//		mask1.count = 3;
//		변수 일일히 넣어주기 힘들기에 생성자로 간편하게 넣음.
		
		System.out.println(mask1.color);
		System.out.println(mask1.price);
		System.out.println(mask1.count);
		System.out.println(mask1);
	}

}
