package 생성자;

public class Bbs사용 {

	public static void main(String[] args) {
		System.out.println("게시판");
		System.out.println("--------");
		System.out.println("no" + "\t" + "title" + "\t" + "content" + "\t" + "writer");
		Bbs bbs1 = new Bbs(1, "java", "fun java", "park");
		System.out.println(bbs1);
		Bbs bbs2 = new Bbs(2, "jsp", "fun jsp", "hong");
		System.out.println(bbs2);
		

	}

}
