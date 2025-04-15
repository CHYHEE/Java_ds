package ch07.sec02;

public class SmartPhoneExample {
	public static void main(String[] args) {
		
		SmartPhone myPhone = new SmartPhone("갤럭시", "은색");
		
		System.out.println("모델: " + myPhone.model);
		System.out.println("색상: " + myPhone.color);
		
		System.out.println("와이파이 상태: " + myPhone.wifi);
		
		myPhone.bell();
		myPhone.sendVoice("여보세요.");
		myPhone.receiveVoice("안녕하세요! 저는 홍길동인데요.");
		myPhone.sendVoice("아~ 네, 반갑습니다.");
		myPhone.hangUp();
		
		myPhone.setWifi(true);
		myPhone.internet();
		
		//자동형변환
		Phone myPhone2 = new SmartPhone("아이폰", "검정");
		//myPhone2.internet();	//사용불가
		
		//강제형변환 (원래 자식타입이 부모타입으로 형변환 된 경우에만 가능)
		SmartPhone myPhone3 = (SmartPhone)myPhone2;
		myPhone.internet();		//사용가능
		
		Phone myPhone4 = new Phone();	//부모클래스 객체
		SmartPhone myPhone5 = (SmartPhone)myPhone4;		//런타임 에러
		myPhone5.internet();
		
	}
}
