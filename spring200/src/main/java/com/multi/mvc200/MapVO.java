package com.multi.mvc200;

//RAM에 만드는 저장공간을 만든다.

public class MapVO {
	//MemberVO가방에 넣은 데이터는 Member테이블에 들어갈 예정
	//각 컬럼과 일치시켜 줌. 
	private double latitude ;
	private double longitude ;
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	@Override
	public String toString() {
		return "MapVO [latitude=" + latitude + ", longitude=" + longitude + "]";
	}
	
	
	
	
	//가방에 어떤 값들이 들어있는지 string으로 다 찍어볼 수 있다.
	
}
