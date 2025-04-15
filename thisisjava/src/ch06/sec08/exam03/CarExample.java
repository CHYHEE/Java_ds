package ch06.sec08.exam03;

import java.util.Scanner;

public class CarExample {
	
	static final int age = 18;
	
	public static void main(String[] args) {
		System.out.println("main메서드 시작");
		Car myCar = new Car();
		
		myCar.setGas(5);	//저장
		System.out.println(myCar.getGas());	//출력
		
		if(myCar.isLeftGas()) {
			System.out.println("출발합니다.");
			myCar.run();
		}
		
		System.out.println("gas를 주입하세요.");
		
		// 객체 생성하지 않아도 메모리에 로드
		System.out.println(Car.country);
		myCar.country = "미국";
		System.out.println(myCar.country);
		Car myCar2 = new Car();
		System.out.println(myCar2.country);
		System.out.println(Car.country);
		
		double pi = Math.PI;
		long v = Math.round(3.5);
		
		//java.util.Scanner scan = new java.util.Scanner(System.in); 
		Scanner scan = new Scanner(System.in);
		
		ch06.sec07.exam05.Car car = new ch06.sec07.exam05.Car("");
		
	}
}
