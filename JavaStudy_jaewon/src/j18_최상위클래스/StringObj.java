package j18_최상위클래스;

import java.util.Scanner;

public class StringObj {
	
	public static void main(String[] args) {
		
		// 동일한 주소를 각변수에 넣어주기 때문
		String name = "홍길동";			// " " 부분이 리터럴 주소로 아래와 같다
		String name2 = "홍길동";		// " " 부분이 리터럴 주소로 위와 같다
		
		System.out.println(name == name2);		// true - 주소가 같다
		Scanner sc = new Scanner(System.in);
		
		// 새로 생성
		System.out.print("이름 : ");
		name = sc.nextLine();
		System.out.print("이름2 : ");
		name2 = sc.nextLine();
		
		// 주소값 비교
		System.out.println(name == name2);		// false - 주소가 다르다
		
		// 새로 생성
		name = new String("홍길동");
		name2 = new String("홍길동");

		// 주소값 비교
		System.out.println(name == name2);		// false - 주소가 다르다
		// 값 비교
		System.out.println(name.equals(name2));
		
	}
}
