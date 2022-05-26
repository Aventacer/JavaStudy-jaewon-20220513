package j07_메소드;

// Class 안에 정의된 함수를 메소드라 한다.

public class Method02 {
	
	// 매개변수가 없으면서 반환도 없는 메소드
	public static void test01(){
		System.out.println("test01 메소드 실행");
	}
	
	// 매개변수는 있고 반환은 없는 메소드
	public static void test02(int age, int year){
		System.out.println("나이 " + age);
		System.out.println("출생년도 " + year);
	}
	
	// 매개변수는 없고 반환은 있는
	public static String test03(){
		return "홍길동";
	}
	
	public static int test04(int num){
		num = 10000;
		return num;
	}
	public static String test04(String str){
		str = "10000";
		return str;
	}
	
	// 매개 있고 반환 있고
	public static String test05(String name, int num) {
		return name + num;
	}
	
	// 리턴자료형이 void일때 메소드를 강제로 탈출하는 방법
	public static void test06() {
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println(i);
			if(i == 6) {
				System.out.println("메소드 탈출");
				return;
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("메인 메소드 시작");
		test01();	// 함수 호출
		test02(3,1900);
		String name = test03();
		System.out.println(name);
		System.out.println(test04(4));
		System.out.println(test04("123"));
		System.out.println(test05("응답하라",1988));
		test06();
		System.out.println("메인 메소드 끝");
	}

}
