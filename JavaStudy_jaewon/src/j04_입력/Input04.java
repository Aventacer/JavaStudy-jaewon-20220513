package j04_입력;

import java.util.Scanner;

public class Input04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = null, b = null, c = null, d = null, e = null, f = null;
		
		System.out.print("개요 ");
		a = sc.nextLine();
		System.out.print("감독 ");
		b = sc.nextLine();
		System.out.print("등급 ");
		c = sc.nextLine();
		System.out.print("흥행 ");
		d = sc.nextLine();
		System.out.print("줄거리 ");
		e = sc.nextLine();
		f = sc.nextLine();
		
		System.out.println("\n개요 " + a);
		System.out.println("감독 " + b);
		System.out.println("등급 " + c);
		System.out.println("흥행 " + d);
		System.out.println("줄거리 \n" + e + "\n" + f );
	}

}
