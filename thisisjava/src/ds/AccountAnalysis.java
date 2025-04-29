package ds;

public class AccountAnalysis {

	public static void main(String[] args) {
		solution();
	}
	
	public static String solution () {
		String nums = "4514--234495-1";
		String[] result = nums.split("-");
		
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
		return nums;
	}

}
