package ch06.sec08.exam03;

public class Car {
	static String country = "한국";	//정적(static) 필드
	private int gas;	// 인스턴스 필드
	
	final String color;
	
	Car(String color) {
		this.color = color;
	}
	
	void changeColor() {
		//color = "black";
	}

	// 인스턴스 메서드
	void setGas(int gas) {
		if(gas < 0) return;
		this.gas = gas;
	}
	
	int getGas() {
		return this.gas;
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다.(gas잔량: " + gas + ")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다.(gas잔량: " + gas + ")");
				return;
			}
		}
	}
	
	//static 블록(처음 1번만 실행)
	static {
		System.out.println("static 블록");
	}
	//instance 블록(객체를 생성할 때마다 실행)
	{
		System.out.println("instance 블록");
	}
	
	
	//생성자
//	Car() {
//		System.out.println("생성자 실행");
//	}

}
