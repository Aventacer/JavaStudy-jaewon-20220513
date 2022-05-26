package j11_배열;

import java.util.Arrays;

public class Array01 {

	// 참조자료형에는 Class 와 배열이 있다
	public static void main(String[] args) {

		// 1. 배열의 공간(크기)을 정해서 생성 - class역시 배열을 만들 수 있다
		int[] nums = new int[10];
		String[] strArray = new String[5];
		String str = "test"; // 문자열은 주솟값이고 이때 test는 리터럴주소이고 char 의 (unicode를 byte화 시킨) byte 배열집합이다
		
		
		// 2. 배열에 들어갈 값을 미리 정해서 생성
		int[] nums2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		char[] c = { 'a', 'b', 'c', 'd', 'e' };
		boolean[] b = { true, false, false, true, true, true };
		
		// 2차원 배열
		int[][] arr2 = { { 5, 4, 3, 2, 1 }, { 1, 2, 3, 4, 5 } };	// 2차원 배열
		int[][] arr3 = new int[5][3];
		
		
		System.out.println("nums 의 길이" + nums.length);
		System.out.println("strArray 의 길이" + strArray.length);
		
		for (int i = 0; i < strArray.length; i++) {
			// System.out.println("nums = " + nums[i] + "\t nums2 = " + nums2[i]);
			// System.out.println("c = " + c[i]);
			// System.out.println("b = " + b[i]);
			System.out.println("strArray = " + strArray[i]); // null 역시 주솟값이다. 즉 주소가 없다라는 뜻
		}
		// 3.동적할당

		// System.out.println(nums[0]);

		// 반복문을 이용한 배열출력
		/*
		 * for(int i = 0 ; i < 6 ; i++) { System.out.println(nums[i]); }
		 */

		// Array.toString()을 이용한 배열 출력
		// System.out.println(Arrays.toString(nums));
	}

}
