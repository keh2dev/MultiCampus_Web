package 조건문;

import java.util.Date;

public class if문4 {

	public static void main(String[] args) {
		//Date - 년 월 일 시 분 초, java.util.Date
		
		Date date = new Date();
		
		System.out.println(date.getHours() + "시");
		System.out.println(date.getMinutes() + "분");
		System.out.println(date.getSeconds() + "초");
		System.out.println(date.getYear() + 1900 + "년");
		System.out.println(date.getMonth() + 1 + "월");
		System.out.println(date.getDate() + "일");
		System.out.println(date.getDay()); // 0부터 일요
		
		int hour = date.getHours();
		
		
		if (hour<11) {
			System.out.println("good morning");
		} else if (hour<14) {
			System.out.println("good afternoon");
		} else if (hour<20) {
			System.out.println("good evening");
		} else {
			System.out.println("good night");
		}
		
		int month = date.getMonth() + 1; //0~11로 나와서 +1을 해야합니다!
		System.out.println(month + "월");
		switch (month) {
		case 3: 
		case 4: 
		case 5:
			System.out.println("spring");
			break;
			
		case 6: case 7: case 8:
			System.out.println("summer");
			break;
			
		case 9: case 10: case 11:
			System.out.println("fall");
			break;
			
		default:
			System.out.println("winter");
		}
	}
}
