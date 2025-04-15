package ch06.sec13.exam01.package2;

import ch06.sec13.exam01.package1.A;
import ch06.sec13.exam01.package1.B;

public class C {
	private A a;	//현재 클래스 내부에서만 접근 가능
	B b;	//다른 패키지만 접근 제어자 public이므로 접근 가능

}
