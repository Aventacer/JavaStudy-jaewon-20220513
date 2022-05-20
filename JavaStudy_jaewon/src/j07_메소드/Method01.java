package j07_메소드;

import java.util.Scanner;

public class Method01 {
								// 매개변수 입력
	public static int formula1 (int a, int b, int c, int d, int e) {
		int result = a + (b * c) - (d * e);
		return result;	// 반환값 출력
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = 0, b = 0, c = 0, d = 0, e = 0;
		int r1 = 0, r2 = 0, r3 = 0, r4 = 0;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();
		
		// 메소드(함수) 호출
		r1 = formula1(a, b, c, d, e);
		// 만줄
		r2 = formula1(a, b, c, d, e);
		// 천줄
		r3 = formula1(a, b, c, d, e);
		// 이천줄
		r4 = formula1(a, b, c, d, e);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		
		//System.out.println("method " + formula1(a, b, c, d, e));
	}

}
