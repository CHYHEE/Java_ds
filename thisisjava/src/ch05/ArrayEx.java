package ch05;

import java.util.Arrays;
import java.util.Collections;

public class ArrayEx {

	public static void main(String[] args) {
		// 정렬
		int[] arr = {3,7,4,1,9,5};
		
		//오름차순
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[0]);
		System.out.println(arr[arr.length-1]);
		
		//Arrays.sort(arr, Collections.reverseOrder());
		
		// stream으로 int[] -> Integer[]
		Integer[] arr2 = Arrays.stream(arr).boxed().toArray(Integer[]::new);
		Arrays.sort(arr2, Collections.reverseOrder());
		
		String[] name = {"홍길동", "김길동", "최길동"};
		
		//오름차순
		Arrays.sort(name);
		System.out.println(Arrays.toString(name));
		//내림차순 정렬
		Arrays.sort(name, Collections.reverseOrder());
		System.out.println(Arrays.toString(name));
	}

}
