package ds;

public class BankAccount {
	public int solution (int m, int[] ledger) {
		int account = 0;

		for(int i = 0; i < ledger.length; i++) {
			if(-m <= account + ledger[i]) {
				account += ledger[i];
			} else {
				System.out.println("요청거절");
			}
		}
		
		return account;
	}
}


