package j04_입력;

import java.util.Scanner;

public class Input02 {

	public static void main(String[] args) {
		/*
		 * 문자열1 입력 : next
		 * 문자열2 입력 : nextline
		 * 문자 입력 : next().charAt(0)
		 * 정수입력
		 * 실수입력
		 * 
		*/
		
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열1 입력 : ");
		String nl = sc.nextLine();
		
		System.out.print("문자열2 입력 : ");
		String n = sc.next();
		
		System.out.print("문자 입력 : ");
		char c = sc.next().charAt(0);
		
		System.out.print("정수 입력 : ");
		int i = sc.nextInt();
		
		System.out.print("실수 입력 : ");
		double d = sc.nextDouble();
		
		System.out.println("\n각 입력값 : ");
		System.out.println(nl);
		System.out.println(n);
		System.out.println(c);
		System.out.println(i);
		System.out.println(d);
		
		
	}

}
