package ch03;

public class Operate {

	public static void main(String[] args) {
		// 증감연산
		// 증가 : ++ 1증가
		// 감소 : -- 1감소
		// 전위연산 : ++a (실행문이 실행 전)
		// 후위연산 : a++ (실행문이 실행 후)
		int a = 10;
		// ++a;
		// a++;
		System.out.println(a++);
		System.out.println(a);
		
		// 산술연산
		// +, -, *, /, %(나머지)
		// 정수와 정수의 연산의 결과 값이 정수
		// 10 / 4 -> 2.5지만 결과 값은 2
		int b = a / 4;
		System.out.println(b);
		
		int score1 = 90;
		int score2 = 80;
		int score3 = 75;
		int total = score1 + score2 + score3;
		double avg = total / 3.0;
		System.out.println(avg);
		
		// int c = b / 0;	// 예외발생
		System.out.println("출력");
		
		// 비교연산 : 결과 값이 true / false
		// ==, !=, >, <, >=, <=
		// ! : 반대
		
		// 논리연산
		// and (그리고) : 조건식이 모두 true이면 true
		System.out.println(a == 11 && b < 10);
		// or (또는) : 조건식 둘 중 하나라도 true이면 true
		System.out.println(a == 10 || b < 10);
		System.out.println(!(test() || b < 10));
		
		String name = null;
		
		if(name != null && name.length() > 3) {
			System.out.println("4자리 이상입니다.");
		}
		
		// 대입연산
		a += 1;	// 1더하고 대입
		a = a + 1;
		System.out.println(a);
		
		// 삼항연산
		// 조건 ? 참 : 거짓
		int score = 50;
		String result = score >= 60 ? "합격" : "불합격";
		System.out.println(result);
		System.out.println(score >= 60 ? "합격" : "불합격");
		// 우선순위가 가장 낮은 연산 : 대입
		// 우선순위가 높이고 싶다 -> 소괄호 ()
		int d = (1 + 2) * 3;
	}
	
	public static boolean test() {
		System.out.println("메서드 실행");
		return true;
	}
	
	

}
