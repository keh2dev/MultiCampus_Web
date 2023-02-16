package 상속;

public class 영웅사용 {

	public static void main(String[] args) {
		사람 p = new 사람("홍길동",100);
		p.name = "홍길동";
		p.age = 100;
		System.out.println(p);
		p.eat();
		
		System.out.println();
		
		맨 m = new 맨("고길동", 100, 500);
		m.run();
		
		System.out.println();
		
		수퍼맨 s = new 수퍼맨("클라크", 25000, 5000000, true);
		System.out.println(s.name);
		s.eat();
		s.space();
		System.out.println(s);
		
		System.out.println();
		
		원더우먼 w = new 원더우먼("다이애나", 5000, 700000, true);
		System.out.println(w.name);
		w.attack();
		System.out.println(w);
	}

}
