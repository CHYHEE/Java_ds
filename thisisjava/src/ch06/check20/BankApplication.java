package ch06.check20;

import java.util.Scanner;

public class BankApplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account[] account = new  Account[100];
		int count = 0;
		int number;
		String name;
		int money;
		
		while(true) {
			System.out.println("--------------------------------------------");
			System.out.println("1.계좌생성 | 2. 계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택> ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			if(menu == 1) {
				System.out.println("------");
				System.out.println("계좌생성");
				System.out.println("------");
				
				System.out.print("계좌번호: ");
				number = sc.nextInt();
				sc.nextLine();
				System.out.print("계좌주: ");
				name = sc.nextLine();
				
				System.out.print("초기입금액: ");
				money = sc.nextInt();
				sc.nextLine();
				
				System.out.println("결과: 계좌가 생성되었습니다.");
				
				account[count] = new Account(number, name, money);
				count++;
				
			} else if(menu == 2) {
				System.out.println("------");
				System.out.println("계좌목록");
				System.out.println("------");
				
				for(int i = 0; i < count; i++) {
					System.out.println(account[i]);
				}
				
			} else if(menu == 3) {
				System.out.println("----");
				System.out.println("예금");
				System.out.println("----");
				System.out.print("계좌번호: ");
				number = sc.nextInt();
				System.out.print("예금액: ");
				money = sc.nextInt();
				
				for(int i = 0; i < count; i++) {
					if(number == account[i].number) {
						account[i].money += money;
					}
				}
				
			} else if(menu == 4) {
				System.out.println("----");
				System.out.println("출금");
				System.out.println("----");
				System.out.print("계좌번호: ");
				number = sc.nextInt();
				System.out.print("출금액: ");
				money = sc.nextInt();
				
				for(int i = 0; i < count; i++) {
					if(number == account[i].number) {
						account[i].money -= money;
					}
				}
				
				System.out.println("결과: 출금이 성공되었습니다.");
				
			} else if(menu == 5 ) {
				System.out.println("프로그램 종료");
				break;
			}
		}

	}

}
