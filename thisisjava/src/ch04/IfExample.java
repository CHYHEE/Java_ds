package ch04;

public class IfExample {

	public static void main(String[] args) {
		int score = 93;
		
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		} else { 
			System.out.println("점수가 90보다 작습니다.");
		}
		if(score < 90 ) {
			System.out.println("점수가 90보다 작습니다.");
		}
		System.out.println("등급은 B입니다.");
		
		// 0.0 <= 랜덤값 < 1.0
		double d = Math.random();
		System.out.println(d);
		// 랜덤값 * 개수
		System.out.println(d * 6);
		// +시작값
		System.out.println((int)(d * 6) + 1);
		
		int dice = (int)(Math.random() * 6) + 1;
		System.out.println(dice);
		
		// 동전 (0:앞, 1:뒤)
		int coin = (int)(Math.random()*2);
		System.out.println(coin);
	}

}
