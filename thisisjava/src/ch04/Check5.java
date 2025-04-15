package ch04;

import java.util.Scanner;

public class Check5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int total = 0;
		
		while(true) {
			System.out.println("---------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("---------------------------------");
			System.out.print("선택> ");
			
			String num = scanner.nextLine();
			
			if("1".equals(num)) {
				System.out.print("예금액> ");
				int a = scanner.nextInt();
				scanner.nextLine();
				total += a;
				
			} else if("2".equals(num)){
				System.out.print("출금액> ");
				int b = scanner.nextInt();
				scanner.nextLine();
				total -= b;
				
			} else if("3".equals(num)) {
				System.out.print("잔고> ");
				System.out.println(total);
				scanner.nextLine();
				
			} else if("4".equals(num)){
				break;
			}
			
		}
		

	}

}
