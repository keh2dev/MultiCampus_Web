package 컬렉션2;

import java.util.Arrays;

public class K번째수 {

	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		int[] answer = new int[commands.length];
		
		for (int i = 0; i < commands.length; i++) {
			int start = commands[i][0]-1;
			int end = commands[i][1];
			int seq = commands[i][2]-1;
			
			int[] array2 = Arrays.copyOfRange(array, start, end);
			Arrays.sort(array2);
			//System.out.println(Arrays.toString(array2));
			
			//System.out.println(commands[i][2]);
			answer[i] = array2[seq];
		}

		System.out.println(Arrays.toString(answer));
	}

}
