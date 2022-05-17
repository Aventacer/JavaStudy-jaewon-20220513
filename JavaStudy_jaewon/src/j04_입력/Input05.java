package j04_입력;

import java.util.Scanner;

public class Input05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*
		 * System.out.print("두 수를 입력하시오 : "); 
		 * int a = sc.nextInt(), b = sc.nextInt();
		 * System.out.println("두 수의 합은 = " + (a+b));
		 */
		
		int i = 0;
		while (i < 3) {
			
			
			System.out.print("두 수를 입력하시오 : ");
			int a = sc.nextInt(), b = sc.nextInt();
			System.out.println(a > b ? ">" : (a < b ? "<" : "=="));		// 삼항 연산자 (조건)?(참):(else(if))
			
			
			i++;
		}
	}
}
