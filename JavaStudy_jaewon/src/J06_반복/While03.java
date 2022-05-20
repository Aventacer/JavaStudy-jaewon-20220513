package J06_반복;

import java.util.Scanner;

public class While03 {

	public static void main(String[] args) {
		//반복 횟수를 입력하시오
		Scanner sc = new Scanner(System.in);
		System.out.print("반복 횟수를 입력하시오 : ");
		int i = 0, num = sc.nextInt();
		while(i < num) {
			System.out.println((i + 1) + "\t" + (num - i));
			i++;
		}
		
		// 거꾸로
		System.out.println();
		i = 0;
		while(i > 0) {
			//System.out.println(i--);
		}
		while(i < num) {
			//System.out.println(num-i);
			i++;
		}
	}
}
