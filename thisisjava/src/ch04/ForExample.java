package ch04;

public class ForExample {

	public static void main(String[] args) {
		for(int a = 0; a < 10; a++) {
			System.out.println("안녕하세요");
		}
		System.out.println("바깥");
		
		int[] score = {90, 80, 70};
		for(int i = 0; i < score.length; i++) {
			System.out.println(score[i]);	
		}
		// 향상된 for문
		for(int s : score) {
			System.out.println(s);
		}
		
		// 구구단
		// 2단
		for(int j = 2; j <= 9; j++) {
			for(int i = 1; i <= 9; i++) {
				System.out.println(j + " * " + i + " = " + (i * j));
			}
		}
	}

}
