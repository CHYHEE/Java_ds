package ch05;

import java.util.Arrays;

public class RefEx {

	public static final double PI = 3.141592;

	public static void main(String[] args) {

		Week w = Week.FRIDAY;

		// 기본 자료
		int a = 10;
		int b = a;
		a = 11;
		System.out.println(b);

		// 참조 자료형
		int[] a1 = { 1, 2, 3 };
		int[] b1 = a1;
		System.out.println(Arrays.toString(b1));
		a1[0] = 4;
		System.out.println(Arrays.toString(b1));
		System.out.println(a1 == b1); // 주소값

		// 문자열 길이
		String test = "안녕하세요";
		for (int i = 0; i < test.length(); i++) {
			System.out.println(test.charAt(i));
		}

		// 믄자열 대체
		test.replace("세 ", "시");
		System.out.println(test); // 문자열은 immutable
		// 공백제거
		String test2 = "안 녕 하 세 요";
		System.out.println(test2);
		System.out.println("공백제거: " + test2.replace(" ", ""));

		// 새로운 문자열로 리턴
		System.out.println(test.replace("세", "시"));

		// 문자열 잘라내기 substring
		System.out.println(test.substring(0, 2));
		System.out.println(test.substring(2));

		// split
		String board = "번호, 제목, 내용, 성명";
		String[] arr = board.split(",");
		System.out.println(Arrays.toString(arr));
//		for(int i = 0; i < arr.length; i++ ) {
//			System.out.println(arr[i]);
//		}
		test(new int[] { 1, 2, 3 });

		RefEx[] refExArr = new RefEx[3]; // {null, null, null}
		Integer[] arr2 = new Integer[] { 1, 2, 3 };

		int[] arr3 = new int[10]; // 길이가 10인 int 배열
		// 배열에서의 기본자료형의 초기값 : 0
		System.out.println(Arrays.toString(arr3));
		System.out.println(arr3[0]);
		System.out.println(c);

		// 다차원 -> X안 X
		// 2차원 배열
		int[][] d2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println(Arrays.toString(d2[1]));
		System.out.println(d2[1][1]);
		int[] d1 = d2[1];
		System.out.println(d1[1]);

		int[][] d2_m = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println(d2_m[2][2]);

		// a1 -> a2
		System.out.println(Arrays.toString(a1));
		int[] a2 = new int[5];
		for (int i = 0; i < a1.length; i++) {
			a2[i] = a1[i];
		}
		System.out.println(Arrays.toString(a2));

		// a1 -> a3
		int[] a3 = new int[5];
		System.arraycopy(a1, 0, a3, 0, 3);
		System.out.println(Arrays.toString(a3));

		// a1 -> a4
		int[] a4 = Arrays.copyOf(a1, a1.length); // 메모리 주소가 다른 동일한 값을 갖는 배열
		System.out.println(Arrays.toString(a4));
	}

	static int c;

	public static void test(int[] aaa) {

	}

}
