package 연습문제;

public class 내차들{

	public static void main(String[] args) {
		Car normalCar = new Car("현대차", "검정색");
		Truck normalTruck = new Truck("쌍용트럭", "파란색", 4);
		coffeeTruck benz = new coffeeTruck("벤츠트럭", "흰색", 6, "커피트럭용");

		System.out.println(benz);
		benz.on();
		benz.run();
		benz.carry();
		benz.give();

		System.out.println();
		
		System.out.println(normalTruck);
		normalTruck.on();
		normalTruck.run();
		normalTruck.carry();

		System.out.println();
		
		System.out.println(normalCar);
		normalCar.on();
		normalCar.run();
	}

}
