package 스태틱;

public class 직원 {
	String nameString;
	int age;
	String genderString;
	static int count;
	static int ageSum;
	static double ageAvg;
	
	//평균 구하는 메소드 생성
	//객체생성하지 않고 클래스 이름으로 바로 접근해서 아무때나 원할 때 평균을 구하고 싶은 경우
	//static메서드로 만들어주세요!!!
	public static void getAvg() {
//		static메서드에서 전역변수에 접근할 때는
//		같은 성격을 가진 static변수만 접근이 가능!!!
//		System.out.println(name); //name은 static변수가 아니라 사용불가.
		System.out.println(ageSum/count);
	}
	
	public 직원(String nameString, int age, String genderString) {
		count++;
		this.nameString = nameString;
		this.age = age;
		this.genderString = genderString;
		ageSum += age;
		ageAvg = ageSum/(double)count;
	}
	
	@Override
	public String toString() {
		return "직원 [nameString=" + nameString + ", age=" + age + ", gender=" + genderString + "]";
	}
	
	
}
