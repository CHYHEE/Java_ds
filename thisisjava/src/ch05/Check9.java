package ch05;

import java.util.Scanner;

public class Check9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] score = {};
		int max = 0;
		double avg = 0;
		int sum = 0;
		
		while(true) {
			System.out.println("---------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("---------------------------------------------------");
			System.out.print("선택> ");
			String num = sc.nextLine();
			
			if("1".equals(num)) {
				System.out.print("학생수> ");
				int student = sc.nextInt();
				score = new int[student];
				sc.nextLine();
				
			} else if("2".equals(num)) {
				for(int i = 0; i < score.length; i++) {
					System.out.print("scores[" + i + "]> ");
					int s = sc.nextInt();
					score[i] = s;
				}
				sc.nextLine();
				
			} else if("3".equals(num)) {
				for(int i = 0; i < score.length; i++) {
					System.out.println("scores[" + i + "] : " + score[i]);
				}
				
			} else if("4".equals(num)) {
				for(int i = 0; i < score.length; i++) {
					sum += score[i];
					avg = sum / score.length;
					
					if(score[i] > max) {
						max = score[i];
					}
				}
				System.out.println("최고 점수: " + max);
				System.out.println("평균: " + avg);
				

			} else if("5".equals(num)) {
				System.out.println("프로그램 종료");
				break;
			}
		}

	}

}
