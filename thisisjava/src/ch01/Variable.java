package ch01;

import java.util.HashMap;

public class Variable {
	public static void main(String[] args) {
		// 변수 선언
		// 타입 변수명;
		int a;
		// 대입(초기화)
		a = 10;
		System.out.println(a);
		
		// 변수 선언 + 초기화
		int b = 20;
		
		// 변수를 초기화 하지 않으면 사용불가
		int c;	// 선언
//		System.out.println(c); // 에러
		// 다른 타입 대입 불가
//		int d = 3.14;
		// 동일한 타입
		double d = 3.14;
		
		double e = 3;	// 정수 -> 실수 변환
		System.out.println(e);
		
		// 타입 == 자료형
		// 기본자료형 / 참조자료형
		// 기본 자료형: 정수, 실수, 문자, 논리
		// 참조 자료형: 배열, 클래스, 인터페이스..
		// 참조자료형 예
		Variable f;
		
		// byte 타입의 범위 -128~127
		byte g = -128;
		
		// 제일 중요한 /가장 자주 사용
		int h = -33000;
		
		// 연산시 int로 변환
//		byte i  = g + 1;	// -127
		
		// 정수를 쓸 때: int -> 21억이 넘으면 -> long
		
		// long = int
		long j = 10;	// 자동형변환
		long k = 10L;	//ilt1
//		int l = 10L;
		
		// 문자
		// 문자는 "" 말고 ''를 쓴다.
		char m = 'A';	// 65
		int o = m + 1;
		System.out.println(o);
		// 문자열
		String n = "A";
		String n2 = "";		// 값이 있는 거
		String n3 = " "; 	// 값이 있는 거
		String n4 = null;	// 값이 없는 거
		// 실수(소수점이 있는 수)
		// double
		
		
		// *** 기본자료형(숫자) 정리
		// int > long > double
		// 범위
		// int < long < double
		
		// 논리 타입
		// true / false
		boolean p = true;
		
		int x = 10;
		boolean result = x == 20;
		System.out.println(result);
		
		// escape "저는 홍길동" 입니다."
		String greet = "저는 \"홍길동\" 입니다.";
		System.out.println(greet);
		
		String greet2 = """
				저는
				홍길동
				입니다.
				""";
		
		// 타입추론(JDK11)
		var age = 30;
		var map = new HashMap<String, Object>();
		
		// 형변환: 타입 변환
		// 자동형변환: 작은 범위의 값이 넓은 범위의 변수로 대입
		double q = a;	//int -> double
		// 강제형변환: 넓은 범위의 값이 작은 범위의 변수로 대입
		a = (int)q;	// 바꾸고자하는 타입 지정
		
		double pi = 3.14;
		int pi_int = (int)pi;
		System.out.println(pi_int);	//소수점 유실
		
		
		// 변수의 사용 범위(scope)
		// 변수가 선언된 위치(중호블록)에서만 사용 가능
		if(true) {
			int xxx = 0;
			System.out.println(xxx);
		}
		//System.out.println(xxx); if문 밖이므로 에러
		
		var test = 10;
		//test = 10L;
		
	}
	
//	public static void test() {
//		System.out.println(pi_int);
//	}
}
