package ch04;

import java.util.Scanner;

public class KeyControlExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;		// flag 변수
		int speed = 0;
		
		while(run) {
			System.out.println("------------------------");
			System.out.println("1. 종속 | 2. 감속 | 3. 중지");
			System.out.println("------------------------");
			System.out.println("선택: ");
			
			String strNum = scanner.nextLine();
			
			if("1".equals(strNum)) {
				speed++;
				System.out.println("현재 속도 = " +speed);
			} else if("2".equals(strNum)) {
				speed--;
				System.out.println("현재 속도 = " + speed);
			} else if("3".equals(strNum)) {
				//run = false;
				break;
			}
			
			System.out.println("차가 달리는 중");
		}
		System.out.println("프로그램 종료");

		scanner.close();
	}

}
