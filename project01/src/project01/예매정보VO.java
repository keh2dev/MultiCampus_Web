package project01;

import java.sql.Date;

public class 예매정보VO {
	private int 예매번호;
	private String 공연ID;
	private String 예매전화번호;
	private Date 예매일자;
	private String 좌석;
	private int 결제금액;
	
	public int get결제금액() {
		return 결제금액;
	}
	public void set결제금액(int 결제금액) {
		this.결제금액 = 결제금액;
	}
	public int get예매번호() {
		return 예매번호;
	}
	public void set예매번호(int 예매번호) {
		this.예매번호 = 예매번호;
	}
	public String get공연ID() {
		return 공연ID;
	}
	public void set공연ID(String 공연id) {
		공연ID = 공연id;
	}
	public String get예매전화번호() {
		return 예매전화번호;
	}
	public void set예매전화번호(String 예매전화번호) {
		this.예매전화번호 = 예매전화번호;
	}
	public Date get예매일자() {
		return 예매일자;
	}
	public void set예매일자(Date 예매일자) {
		this.예매일자 = 예매일자;
	}
	
	public String get좌석() {
		return 좌석;
	}
	public void set좌석(String 좌석) {
		this.좌석 = 좌석;
	}
	@Override
	public String toString() {
		return "예매정보VO [예매번호=" + 예매번호 + ", 공연ID=" + 공연ID + ", 예매전화번호=" + 예매전화번호 + ", 예매일자=" + 예매일자 + ", 좌석=" + 좌석
				+ ", 결제금액=" + 결제금액 + "]";
	}
	
	
	
	
	
}
