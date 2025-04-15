package ch14.sec05.exam02;

public class YieldExample {

	public static void main(String[] args) {
		WorkThread workThreadA = new WorkThread("workThreadA");
		WorkThread workThreadB = new WorkThread("workThreadB");
		workThreadA.start();
		workThreadB.start();
		
		try {
			Thread.sleep(5000);
		} catch(Exception e) {}
		workThreadA.work = false;
		
		try {
			Thread.sleep(5000);
		} catch(Exception e) {}
		workThreadA.work = true;
	}

}
