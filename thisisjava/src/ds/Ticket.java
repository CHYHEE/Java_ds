package ds;

import java.util.Arrays;
import java.util.Comparator;

public class Ticket {
	
	public static void main(String[] args) {
		//public int solution(int tickets, int[][] requests) {
			int soldTickets = 26;
			int[][] arr = {{1, 7, 10}, {2, 4, 3}, {2, 3, 3}, {3, 5, 0}};
			
			Arrays.sort(arr, new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					if(o1[0] == o2[0]) {
						
						return o2[1] - o1[1];		//여기가 구매하려는 티켓 수
					}
					
					if(soldTickets < o2[2]) {
						System.out.println("판매할 수 없음");
					} else {
						//soldTickets -= o2[2];
					}
					return o1[0] - o2[0];	//여기가 등급
				}
			});
			
			//람다 표현식
//			Array.sort(arr, (a1, a2) -> {
//				if(a1[0]==a2[0] {
//					return a2[1] - a1[1];
//				})
//					return a2[0] - a1[0];
//			});
			
			for(int[] a : arr) {
				System.out.println(Arrays.toString(a));
			}
			
			//return soldTickets;
		}
	}
	

//}
