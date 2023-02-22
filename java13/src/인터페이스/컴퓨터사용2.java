package 인터페이스;

public class 컴퓨터사용2 {

	public static void main(String[] args) {
		
		Computer 익명컴퓨터 = new Computer() {
			
			@Override
			public void 코딩하다() {
				// TODO Auto-generated method stub
				System.out.println("익명컴퓨터 코딩!!");
			}
			
			@Override
			public void 부팅하다() {
				// TODO Auto-generated method stub
				
			}
		};
		
		익명컴퓨터.코딩하다();
		
		AppleComputer com1 = new AppleComputer();
		BananaComputer com2 = new BananaComputer();
		com1.부팅하다();
		com1.코딩하다();
		com2.부팅하다();
		com2.코딩하다();
		
	}

}
