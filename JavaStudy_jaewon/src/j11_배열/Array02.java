package j11_배열;

import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		 * int size = 4; 
		 * int scan_size = sc.nextInt(); 
		 * int[] num1 = new int[size];
		 */

		
		/*
		 * for문으로 0 ~ 99까지 반복 
		 * 변수 i값이 8의 배수이면 
		 * 8의 배수 갯수만큼 배열생성 
		 * 8의 배수를 모두 배열에 대입한다. 
		 * 배열에 들어있는 8의배열을 다 출력
		 */

//		int count = 0;
//		int num = 0;
//		// 8의 배수 갯수 구하기
//		for (int i = 0; i < 100; i++) {
//			if (i % 8 == 0 && i != 0) {
//				count++;
//			}
//		}
//		// 갯수만큼 배열 선언
//		int[] array = new int[count];
//		// 8의 배수를 배열에 대입
//		for (int i = 0; i < 100; i++) {
//			if (i % 8 == 0 && i != 0) {
//				array[num++] = i;
//			}
//		}
//		// 배열의 길이만큼 출력
//		for (int i = 0; i < array.length; i++) {
//			System.out.print(array[i] + " ");
//		}
		
		int count = 0, num = 0;
		int[] array = null;
		int[] array2 = new int[50];
		
		// 8의 배수 갯수 구하기
		for (int i = 0, j = 0; i < 100; i++) {
			if (i % 8 == 0 && i != 0) {
				count++;	// 8의 배수 갯수
				array = new int[count];	// 8의 배수 갯수가 구해질때마다 선언
				array2[j] = array[j] = i;
				j++;
			}
		}
		
		for(int i = 0 ; i < count ; i++) {
			System.out.print(array2[i] + " ");
		}
		//System.out.println(array.length);
		
//		// 8의 배수를 배열에 대입
//		for (int i = 0; i < 100; i++) {
//			if (i % 8 == 0 && i != 0) {
//				array[num++] = i;
//			}
//		}
//		// 배열의 길이만큼 출력
//		for (int i = 0; i < array.length; i++) {
//			System.out.print(array[i] + " ");
//		}
	
	}
}
