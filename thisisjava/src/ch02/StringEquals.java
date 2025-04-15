package ch02;

public class StringEquals {

	public static void main(String[] args) {
		String name1 = "홍길동";
		String name2 = "홍길동";
		
		System.out.println(name1 == name2);
		
		String name3 = new String("홍길동");
		String name4 = new String("홍길동");
		System.out.println(name3 == name4); // -> 문자열 비교는 equals 사용해야 함
		System.out.println(name3.equals(name4));
		
		String name = null;
		// System.out.println(name.equals("admin"));
		System.out.println("admin".equals(name));	//비교할 문자를 앞에 넣고, 변수를 뒤에 넣어야 에러가 안 
		// name.equals("");	//NullPointerException, 비교 대상이 비어있어서 오류 발생?
	}

}
