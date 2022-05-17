package j03_연산;

import java.util.Scanner;

public class Operation08 {

	public static void main(String[] args) {
		/* 문제1
		 * num이 짝수인가 홀수인가
		*/
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		System.out.println(num % 2 == 0 ? "짝수" : "홀수");
		
	}

}
