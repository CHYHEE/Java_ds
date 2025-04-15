package ch06.sec04;

public class StudentExample {

	public static void main(String[] args) {
		Student  s1 = new Student();	//생성자
		
		Student  s2 = new Student();
		
		System.out.println(s1 == s2);
		
		Student s3 = s2;	//같은 주소
		System.out.println(s3 == s2);
		
		s1.method1();	//메서드 실행
		
		s1.name = "홍길동";
		s2.name = "김길동";
		System.out.println(s1.name);
		System.out.println(s2.name);
	}

}
