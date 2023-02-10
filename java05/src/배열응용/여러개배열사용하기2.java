package 배열응용;

public class 여러개배열사용하기2 {

	public static void main(String[] args) {
		String[] names = { "홍길동", "이순신", "뉴진스", "방탄", "블랙핑크" };
		int[] term1 = { 77, 88, 99, 55, 70 };
		int[] term2 = { 99, 100, 88, 80, 70 };

//		1학기 대비 2학기 성적 오른 학생 몇명?

		int upperCount = 0;

		for (int i = 0; i < term2.length; i++) {
			if (term1[i] < term2[i]) {
				upperCount++;
			}
		}

		System.out.println("성적 오른 학생 수 : " + upperCount);
		System.out.println("=========================");
		
//		1학기, 2학기 성적이 동일한 학생 몇명?
		int sameCount = 0;

		for (int i = 0; i < term2.length; i++) {
			if (term1[i] == term2[i]) {
				sameCount++;
			}
		}

		System.out.println("동일 성적 학생 수 : " + sameCount);
		System.out.println("=========================");
		
//		2학기 학생 중 만점(100) 인 학생의 이름과 번호는?
		int perfectCount = 0;

		for (int i = 0; i < term2.length; i++) {
			if (term2[i] == 100) {
				System.out.println("2학기 만점자는 " + names[i] + ", 번호 " + i );
			}
		}

		System.out.println("2학기 만점 성적 학생 수 : " + perfectCount);
		System.out.println("=========================");
		
//		1학기 성적의 평균과 2학기 성적의 평균 중 누가 더 높았나요??
		int firstSum = 0;
		int secondSum = 0;
		double firstAvg = 0;
		double secondAvg = 0;

		for (int i = 0; i < term2.length; i++) {
			firstSum = firstSum + term1[i];
			secondSum = secondSum + term2[i];
		}

		firstAvg = (double) firstSum / term1.length;
		secondAvg = (double) secondSum / term2.length;

		System.out.println("1학기 성적 평균 : " + firstAvg);
		System.out.println("2학기 성적 평균 : " + secondAvg);
		
		if (firstAvg > secondAvg) {
			System.out.println("1학기 성적 평균이 더 높음");
		} else if (firstAvg < secondAvg) {
			System.out.println("2학기 성적 평균이 더 높음");
		} else {
			System.out.println("같음");
		}
		System.out.println("=========================");
		
//		심화) 뉴진스의 1학기 성적, 2학기 성적은?
		for (int i = 0; i < term2.length; i++) {
			if (names[i].equals("뉴진스")) {
				System.out.println("뉴진스 성적");
				System.out.println("1학기 : "+term1[i]);
				System.out.println("2학기 : "+term2[i]);
			}
		}

	}

}