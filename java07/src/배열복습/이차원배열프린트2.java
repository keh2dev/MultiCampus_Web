package 배열복습;

public class 이차원배열프린트2 {

	public static void main(String[] args) {
		String[][] s = {
				{"제주","부산","여수"},
				{"도쿄","교토","삿포로"},
				{"런던","나폴리","마드리드"}
		};
		
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length; j++) {
				System.out.print(s[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}
