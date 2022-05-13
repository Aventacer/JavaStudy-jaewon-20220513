package j02_변수와_상수;

public class MyInfo {

	public static void main(String[] args) {
		// 주석
		/*
		 * 메모, 필기
		 * 1. 문제
		 * name1, name2, name3
		 * age(나이)
		 * phone(연락처)
		 * address(주소)
		 * 
		 * 이름 : 유재원
		 * 나이 : 123
		 * 연락처 : 010-1234-5678
		 * 주소 : 부산 서면
		*/
		
		char name1 = '유', name2 = '재', name3 = '원';
		int age = 123;
		String phone = "010-1234-5678", address = "부산 서면";
		
		System.out.println("이름 : " + name1 + name2 + name3);
		System.out.println("나이 : " + age);
		System.out.println("연락처 : " + phone);
		System.out.println("주소 : "+ address);
		
		int n1 = name1, n2 = name2, n3 = name3;
		
		System.out.println(n1 + " " + n2 + " " + n3);
		System.out.println("세수의 합 : "+ (10 + 20 + 30) );
		
	
	}

}
