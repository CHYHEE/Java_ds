package ch14.sec06.exam01;

import java.util.ArrayList;
import java.util.List;

public class SynchronizedExample {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		User1Thread user1Thread = new User1Thread();
		user1Thread.setCalculator(calculator);
		user1Thread.start();
		
		User2Thread user2Thread = new User2Thread();
		user2Thread.setCalculator(calculator);
		user2Thread.start();
		
		List<Calculator> list = new ArrayList<Calculator>();
		List<Calculator> list2 = new ArrayList<>();		//제알 먾이 씀
		var list3 = new ArrayList<Calculator>();
	}

}
