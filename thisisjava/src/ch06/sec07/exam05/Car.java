package ch06.sec07.exam05;

public class Car {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	public Car(String model) { 
		this(model, "은색", 250);
	}
	
	Car(String model, String color) { 
		this(model, color, 250);
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	String method1(String text) { 
		System.out.println("method1");
		return text;
	}
	
	String method2(String text) { 
		System.out.println("method2");
		return text;
	}
	
	String method3(String text) { 
		System.out.println("method3");
		return text;
	}
	
	String method4(String text) { 
		System.out.println("method4");
		method5(text);
		return text;
	}
	
	String method5(String text) { 
		System.out.println("method5");
		method6(text);
		return text;
	}
	
	String method6(String text) { 
		System.out.println("method6");
		return text;
	}
}
