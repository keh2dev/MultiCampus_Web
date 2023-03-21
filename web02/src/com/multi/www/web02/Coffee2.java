package com.multi.www.web02;

public class Coffee2 {
	int price = 5000;
	String name = "핸드드립";
	
	public static Coffee2 Coffee2; //null
	
	private Coffee2() {
	}

	public static Coffee2 getInstance() {
		if (Coffee2 == null) {
			Coffee2 = new Coffee2();
		}
		return Coffee2;
	}
	
}
