package ds;

import java.util.Arrays;

public class Auction {
	public int[] solution(int n, int[] amounts) {
		int[] answer = {0};
		
		int[] money = {30000, 70000, 10000};
		int[] person = {1, 2, 3};
		
		Arrays.sort(person);
		for(int i : person) {
			System.out.print(i + ",");
		}
		
		
		
		return answer;
	}

}
