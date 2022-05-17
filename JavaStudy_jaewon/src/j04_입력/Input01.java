package j04_입력;

import java.util.Scanner;

public class Input01 {

	public static void main(String[] args) {

		/*
		 * Scanner scanner = new Scanner(System.in); // int double boolean = 일반자료형 // //
		 * class 자료형(string같은..) = 참조자료형 System.out.print("값 입력 : "); int num =
		 * scanner.nextInt(); System.out.println();
		 */
		
		// 윤년

		/*
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * System.out.print("년도를 입력하세요 : "); int year = scanner.nextInt();
		 * 
		 * String result = null;
		 * 
		 * result = (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) ? "윤년"
		 * : "윤년아님";
		 * 
		 * System.out.println("\n입력한 년도는 = " + year + "\n결과 : " + result);
		 */
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("num1에 입력할 값 = ");
		int num1 = sc1.nextInt();
		System.out.print("num2에 입력할 값 = ");
		int num2 = sc1.nextInt();
		
		System.out.println("\tnum1 = " + num1 + " num2 = "+ num2);
		System.out.println("\tresult = " +(num1+num2));
		
		/*
		 * sc1.next(); // 문자열(String) 
		 * sc1.nextLine(); // 문자열(String)
		 * sc1.next().charAt(0); // 문자(Char) 
		 * sc1.nextInt(); // 정수(int) 
		 * sc1.nextDouble(); // 실수(double)
		 */
		
		/*
		 * String str = "1024";
		 * 
		 * int i_Num = Integer.parseInt(str);
		 * 
		 * System.out.println(i_Num);
		 * 
		 * i_Num = 543242534;
		 * 
		 * str = Integer.toString(i_Num);
		 * System.out.println(str);
		*/
	}

}
