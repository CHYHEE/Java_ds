package ch04;

public class PrintFrom1To10Example {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		
		while(i<=100) {
			sum += i;
			System.out.print(i+" ");
			i++;
		}
		System.out.println(sum);
	}

}
