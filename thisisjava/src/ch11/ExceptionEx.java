package ch11;

public class ExceptionEx {

	
	@Override
	public String toString() {
		return "여기는 Exception";
	}
	
	public static void main(String[] args) {
		ExceptionEx ee = new ExceptionEx();
		System.out.println(ee);
		
		System.out.println("시작");
		
		int a = 3;
		int b = 0;
		int[] arr = {1,2,3};
		String str = null;
		
		try {
			// 예외가 발생 가능성이 있는 코드
			//int c = a / b;	//ArithmeticException
			System.out.println(arr[2]);		//ArrayIndexOutOfBoundsException
			//System.out.println(str.charAt(0));		//NullPointerException
//		} catch(ArithmeticException e) {	//예외 발생 시 실행 블록
//			System.out.println("예외발생");
//			System.out.println(e.getMessage());		//메시지 출력
//			e.printStackTrace();	//예외 전체를 출력
//		} catch(ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
		} catch(Exception e) {	//부모(작은 것부터 큰 순서로 작성해야 함)
			//System.out.println(c);
			System.out.println("그 외 예외");
			System.out.println(e.getMessage());
			
		} finally {		//마지막으로 실행(마지막에 항상 실행)
			//예외발생 여부와 상관없이 실행
			System.out.println("무조건 실행");
		}
		
		System.out.println("끝");
		
		//try {		//받아주거나 던지거나(main으로)
			//test();
		//} catch(Exception e) {}
	}
	
	public static void test() throws Exception {		//나를 실행한 곳을 예외를 떠넘김
		throw new Exception ("안돼");		//강제로 발생
		//try {
			//Class.forName("java.lang.String");	//어쩔 수 없이 사용햐야 함 
		//} catch(Exception e) {}
	}
	
	void exception() {
		try { 
			//예외가 발생 가능성 있는 코드
		} catch(Exception e) {
			//예외가 발생하면 실행되는 코드
		} finally {
			// 항상 무조건 실행되는 코드
		}
	}

}
