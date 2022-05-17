package j04_입력;

import java.util.Scanner;

public class Input03 {

	public static void main(String[] args) {
		/*
		 * [개인정보 입력]
		 * 이름 : 홍길동
		 * 나이 : 123
		 * 연락처 : 010-1234-1234
		 * 주소 : 부산 서면
		 * 성별 : 남
		*/
		
		Scanner sc = new Scanner(System.in);
		
		String name = null, phNum = null, add = null;
		int age = 0;
		char gender = 0;
		
		System.out.print("이름 \t: ");				
		name = sc.next();							// 홍길동\n => \n이 버퍼에 남음
		System.out.print("나이 \t: ");				
		age = sc.nextInt();							// 이전 \n은 날아감 (nextInt라서) 19\n => \n이 버퍼에 남음
		System.out.print("연락처 \t: ");
		phNum = sc.next();					// /n이 버퍼에 남음
		sc.nextLine();			// 개행문자 제거	즉 /n을 버퍼에서 날림
		System.out.print("주소 \t: ");
		add = sc.nextLine();
		System.out.print("성별 \t: ");
		gender = sc.next().charAt(0);
		
		System.out.println("\n이름 \t=> " + name);
		System.out.println("나이 \t=> " + age);
		System.out.println("연락처 \t=> " + phNum);
		System.out.println("주소 \t=> " + add);
		System.out.println("성별 \t=> " + gender);
	}

}
