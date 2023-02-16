package 생성자;

public class TV {
	//멤버변수, 선언이 클래스 바로 아래에 되었기 때문에
	//클래스 전체 영역에서 이 변수를 사용할 수 있음.
	//전역변수(global변수, 글로벌 변수)
	//멤버변수는 자동초기화, 전역변수는 자동초기화
	public int ch; //0
	public int vol; //0
	public boolean onOff; //false
	

	public TV() { // 생성자!
		System.out.println("TV객체가 하나 생성됨.");
	}
	//파라메터 있는 생성자가 있을 때는 기본생성자는 자동생성되지 않음.!
	public TV(int ch, int vol, boolean onOff) {
		this.ch = ch;
		this.vol = vol;
		this.onOff = onOff;
	}

//	public TV(int ch, int vol, boolean onOff) { // 매개변수(파라메터)가 있는 생성자
//		// 무더기 영역(힙영역)에 저장된 멤버 변수에 값을 넣어주는 역할
//		this.ch = ch; // this. 는 전역변수 인식
//		this.vol = vol;
//		this.onOff= onOff;
//	}
	
	public void 채널을바꾸다() {
		int change = 1; //지역변수, local변수, 로컬변수, 자동초기화X
		System.out.println(ch + "에서 " + change + "로 바꾸다.");
	}
	
	public void 유튜브보다() { //메서드를 만드는 것==> 메서드 정의한다.라고 표현.
		System.out.println(vol + "을 키워서 동영상을 보다.");
	}

	
	
}