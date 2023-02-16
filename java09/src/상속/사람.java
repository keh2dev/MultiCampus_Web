package 상속;

public class 사람 extends Object{//extends Object는 기본값으로 생략가능.
	//사람의 기본적인 성질 ==> 멤버 변수
	String name;
	int age;
	
	public 사람(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void eat() {
		System.out.println("먹다.");
	}
	
	public void sleep() {
		System.out.println("잠자다.");
	}

	@Override
	public String toString() {
		return "사람 [name=" + name + ", age=" + age + "]";
	}

	
	
	
	//사람의 동작 ==> 멤버메서드
}
