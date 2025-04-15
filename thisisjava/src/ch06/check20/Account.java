package ch06.check20;

public class Account {
	String number;
	String name;
	String money;
	
	public Account(String number, String name, String money) {
		this.number = number;
		this.name = name;
		this.money = money;
	}
	
	public String toString() {
	    return "계좌번호: " + number + "   계좌주: " + name + "   잔액: " + money;
	}

	
}
