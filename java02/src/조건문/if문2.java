package 조건문;

public class if문2 {

	public static void main(String[] args) {
		int x = 0;
		
		if (x == 0) { //조건을 쓸 때는 비교하는 것으로 쓰고, 결과는 무조건 true/false로 나와야한다.
			System.out.println("내가 실행되겠지요? ");
		} else { //false일 때 처리하고 싶은 내용을 쓰면 됩니다.
			System.out.println("나는 조건이 맞지 않을 때 실행되는 거야. ");			
		}
		
		if (x == 1) {
			System.out.println("나는 실행안된다 ㅠㅠ ");
		}
	}

}
