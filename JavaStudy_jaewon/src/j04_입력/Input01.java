package j04_입력;

import java.util.Scanner;

public class Input01 {

	public static void main(String[] args) {
		/*
		 * Scanner scanner = new Scanner(System.in); //int double boolean = 일반자료형 //
		 * class 자료형(string같은..) = 참조자료형 System.out.print("값 입력 : "); int num =
		 * scanner.nextInt();
		 * 
		 * System.out.println(num);
		 */
		
		// 윤년
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("년도를 입력하세요 : ");
		int year = scanner.nextInt();
		
		String result = null;
		
		result = (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) ? "윤년" : "윤년아님";
		
		System.out.println("\n입력한 년도는 = " + year + "\n결과 : " + result);
		
	}

}
