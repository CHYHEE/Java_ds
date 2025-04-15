package ch08.sec02;

import ch07.sec10.exam02.Animal;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = new Television();	//자동형변환
		rc.turnOn();	//재정의 된 메서드 실행
		rc.add(10, 20);
		
		rc = new Audio();
		rc.turnOn();
		rc.add(10, 20);
		
		
		rc.turnOn();	//제정의 된 메서드 실행
		rc.add(10, 20);
		System.out.println(RemoteControl.VOLUME);
		
		//익명구햔객체(일회성)
		RemoteControl rc2 = new RemoteControl() {
			public void turnOn() {
				System.out.println("에어컨을 켠다.");
			}
		};
		
		//익명상속객체
		Animal ani = new Animal() {
			
			@Override
			public void sound() {
				System.out.println("어흥");
			}
		};
		
//		Vehicle truck = new Vehicle() {
//			public void run() {
//				System.out.println("트럭이 달립니다.");
//			}
//		};
		
		sound(ani);
		
		sound(new Animal() {
			public void sound() {
				System.out.println("야옹");
			}
		});
		sound(new Animal() {
			public void sound() {
				System.out.println("짹짹");
			}
		});
		
		
	}
	
//	public static void cal(new LambdaEx ex) {
//		@Override
//		public int cals(int x, int y) {
//			return x+y;
//		}
//	};
	
	//람다표현식
	//cal((x,y) -> x-y);
//	
//	public staic void cla(LambdaEx ex){
//		   int result = ex.clac(10,20);
//		}
//
//		//람다표현식
//		cal(new LambdaEx(){
//		@Override
//		   public int clas(int x,int y){
//		      return x*y;
//		}
//		//람다표현식
//		cal((x,y)→x-y);  //(x,y)→x-y : 익명구현객체로  
	
	
	public static void sound(Animal ani) {
		ani.sound();
	}
	
//	public static void cal(LambdaEx ex) {
//		int result = ex.calc(10, 20);
//		System.out.println(result);
//	}

}
