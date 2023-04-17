package 문자열;

public class 암호해독 {

	public static void main(String[] args) {
		String cipher = "dfjardstddetckdaccccdegk";
		int code = 4;
		
		char[] cipher2 = cipher.toCharArray();
		char[] result = new char[cipher2.length/code];
		
		for (int i = 0; i < result.length; i++) {
			int code2 = code*(i+1);
			result[i] = cipher2[code2-1]; 
		}
		
		System.out.println(String.valueOf(result));
	}

}
