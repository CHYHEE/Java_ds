package ch07.sec04.exam01;

public class ComputerExample {

	public static void main(String[] args) {
		
		int r = 10;
		
		Calculator calculator = new Calculator();
		System.out.println("원 면적: " + calculator.areaCircle(r));
		System.out.println();
		
		Computer computer = new Computer();
		System.out.println("원 면적: " + computer.areaCircle(r));
		
		Calculator cal = computer;		//자동형변환
		cal.areaCircle(r);		//부모타입의 메서드가 실행 -> 자식 메서드가 실행
		//cal.game();		//사용불가
		
		// 다형성 : 타입이 달라지는 성질 -> 실행 코드는 하나인데 결과가 달라지는 것
		Tablet tab = new Tablet();
		Calculator cal2 = tab;
		
		//상속관계가 되면 하나의 배열에 여러 타입을 담을 수 있다?
		Calculator[] calArray = {calculator, computer, tab, new Calculator(), new Computer()};
		for(Calculator c : calArray) {
			c.areaCircle(r);
		}
		
		//강제형변환 조건이 원래 Computer 였으면 가능하지만 cal2는 원래 Calculator의 타입이라 강제형변환이 안됨
		Computer com = (Computer)cal2;
		System.out.println(com.toString());
		
		Object o1 = new String("안녕");		//자동형변환
		System.out.println(o1.toString());	//자식이 재정의한 메서드
		//System.out.println(o1.replace("", "")); //o1에도 toString이 있지만 실행할 때에는 타입이 중요
		
		String s1 = (String)o1;		//강제형변환
		System.out.println(s1.replace("", ""));
		
		Object o2 = new Object();
		//String s2 = (String) o2;	//에러 -> o2는 원래 Object의 타입이라 강제형변환 불가능
	}

}
