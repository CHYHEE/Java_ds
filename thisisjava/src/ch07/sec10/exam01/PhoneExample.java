package ch07.sec10.exam01;

import ch08.sec02.RemoteControl;

public class PhoneExample {

	public static void main(String[] args) {

		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();

		Phone phone = new SmartPhone("홍길동");
		phone.turnOn();
		//phone.internetSearch();	//에러
		phone.turnOff();
		

	}

}
