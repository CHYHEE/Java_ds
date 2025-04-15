package ch06.check20;

import java.util.ArrayList;
import java.util.Scanner;

public class ListBankApplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Account> account = new ArrayList<>();
		//Account[] account = new  Account[100];
		//int count = 0;
		String number;
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
				number = sc.nextLine();
				account.add(number);
				sc.nextLine();
				
				System.out.print("계좌주: ");
				name = sc.nextLine();
				account.add(name);
				
				System.out.print("초기입금액: ");
				money = sc.nextInt();
				account.add(money);
				sc.nextLine();
				
				System.out.println("결과: 계좌가 생성되었습니다.");
				
				//account.get();
				//account[count] = new Account(number, name, money);
				
				
			} else if(menu == 2) {
				System.out.println("------");
				System.out.println("계좌목록");
				System.out.println("------");
				
				for(int i = 0; i < account.size(); i++) {
					System.out.println(account.get(i));
				}
				
			} else if(menu == 3) {
				System.out.println("----");
				System.out.println("예금");
				System.out.println("----");
				System.out.print("계좌번호: ");
				//account.contains(number);
				number = sc.nextLine();
				System.out.print("예금액: ");
				//account.contains(money);
				money = sc.nextInt();
				
				for(int i = 0; i < account.size(); i++) {
					if(account.contains(number)==true) {
						money += account.add(money);
						account.set(i,money);
						//account[i].money += money;
					}
				}
				
			} else if(menu == 4) {
				System.out.println("----");
				System.out.println("출금");
				System.out.println("----");
				System.out.print("계좌번호: ");
				//account.contains(number);
				number = sc.nextLine();
				System.out.print("출금액: ");
				//account.contains(money);
				money = sc.nextLine();
				
				for(int i = 0; i < account.size(); i++) {
					if(account.contains(number)==true) {
						money -= account.add(money);
						account.set(i,money);
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
