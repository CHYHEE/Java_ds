package ch04;

public class Check2 {
	public static void main(String[] args) {
		
		
		while(true) {
			int dice = (int)(Math.random() * 6) + 1;
			int dice2 = (int)(Math.random() * 6) + 1;
			
			if((dice + dice2) == 5) {
				System.out.println(dice + ", " + dice2);
				break;
			}
		}
		
	}

}
