package 반복문;

public class 반복문안에서스킵하기 {

	public static void main(String[] args) {
		// 1번부터 10번까지 데이터 중에서 짝수만 프린트!!
		for (int i = 1; i <= 10; i++) {
			// i가 8이 되면 종료
			if (i==8) {
				//break; // for문 종료, for문 아래에 있는 내용이 이어서 실행!!
				//아예 프로그램을 종료시켜버릴라면~?
				System.exit(0);
			}
			if (i % 2 != 0) {
				continue; // 이번 i만 for문 안에서 스킵한다.
			}
			System.out.println(i);
		}
		System.out.println("for문 종료!"); // if문에서 프로그램 종료를 시켰기에 해당 구문 실행이 안됨.
	}

}
