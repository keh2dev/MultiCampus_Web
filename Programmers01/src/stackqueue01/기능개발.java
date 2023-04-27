package stackqueue01;

import java.util.*;

public class 기능개발 {

	public static void main(String[] args) {
//		int[] progresses = { 93, 30, 55 };
//		int[] speeds = { 1, 30, 5 };
		int[] progresses = {95, 90, 99, 99, 80, 99};
		int[] speeds = {1, 1, 1, 1, 1, 1};
		Solution sol = new Solution();
		int[] answer = sol.solution(progresses, speeds);
		System.out.println(Arrays.toString(answer));
	}

}

class Solution {
	public int[] solution(int[] progresses, int[] speeds) {
		List<Integer> work = new ArrayList<Integer>();
		//동시에 나올 작업 수를 담을 리스트
		Queue<Integer> day = new LinkedList<Integer>();
		//각 작업별 걸리는 일자를 담을 큐
		for (int i = 0; i < progresses.length; i++) {
			if ((100 - progresses[i]) % speeds[i] == 0) {
				day.add((100 - progresses[i]) / speeds[i]);
			} else {
				day.add((100 - progresses[i]) / speeds[i] + 1);
			}
		}
		//각 작업별 걸리는 일자 계산

		int q1 = day.poll();
		int q2 = 0;
		int complete = 1;
		//q1에 먼저 나올 큐값 저장, q2는 후에 나올 큐값 저장.
		//complete는 동시에 완료된 작업 수 저장. 현재는 큐가 하나 나왔으므로 1로 초기화.
		
		while (!day.isEmpty()) { //day큐가 빈공간이 아니면 하기 반복
			q2 = day.poll(); // 후에 나올 큐값 q2에 저장
			if (q1 >= q2) { 
				complete++; //먼저 나온 큐값이 크거나 같으면 동시에 완료된 작업 수 ++
			} else {
				work.add(complete); // 현재까지 동시에 완료된 작업 수 리스트에 저장.
				complete = 1;  // 동시에 완료될 작업 수 초기화.
				q1 = q2; // 이후 이어질 선행 큐값에 후행 큐값 저장.
			}
		}

		
		work.add(complete);
		// 반복 후 마지막으로 남은 작업 수 리스트에 저장... 
		// 이 부분 어떻게 출력해야되는지 고민 때문에 2시간 넘게 걸림... 하...

		int[] answer = new int[work.size()];

		for (int i = 0; i < answer.length; i++) {
			answer[i] = work.get(i);
		}
		// work 리스트값 answer 배열로 치환 끝
		
		return answer;
	}
}