package 배열응용;

import java.util.Scanner;

public class 입력받아배열에넣기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		작년에 가고 싶었던 곳 세곳을 입력받아 넣으세요.
//		제주도, 양양, 속초
	
		String[] lastYear = new String[3];
		
		System.out.println("작년에 가고 싶었던 곳 세 곳 : ");
		for (int i = 0; i < lastYear.length; i++) {
			lastYear[i] = sc.next();
		}
		
//		올해 가고 싶었던 곳 세곳을 입력 받아 넣으세요.
//		제주도, 부산, 울산
		
		String[] thisYear = new String[3];
		
		System.out.println("올해 가고 싶은 곳 세 곳 : ");
		for (int i = 0; i < thisYear.length; i++) {
			thisYear[i] = sc.next();
		}
		
//		위 입력은 우선 순위에 따라 입력한 것임.
//		작년과 올해 가고 싶은 곳과 우선순위가 동일한 곳은 몇곳인가?
//		==> 같은 위치에 있는 장소끼리만 비교해주세요.
		
		int countSame = 0;
		for (int i = 0; i < thisYear.length; i++) {
			if (lastYear[i].equals(thisYear[i])) {
				countSame++;
			}
		}
		System.out.println("작년과 올해 가고 싶은 곳과 우선순위가 동일한 곳은 "+countSame+"곳");
		
		sc.close();
	}

}
