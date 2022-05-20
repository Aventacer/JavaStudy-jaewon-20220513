package j07_메소드;

// 메소드 오버로딩
public class Method03 {

	public static void test1() {
		System.out.println("매개변수가 없는 test1 호출");
	}
	
	public static void test1(int num) {
		System.out.println("int 자료형 매개변수가 하나인 test1 호출 값은 \n" + num);
	}
	
	public static void test1(int num, int num2) {
		System.out.println("int 자료형 매개변수가 둘인 test1 호출 값은 \n" + num + " " + num2);
	}
	
	public static void test1(char c) {
		System.out.println("char 자료형 매개변수가 하나인 test1 호출 값은 \n" + c);
	}
	
	public static void test1(int num, double dNum) {
		System.out.println("int와double 자료형 매개변수가 하나씩 총 두개인 test1 호출 값은 \n" + num + " " + dNum);
	}
	
	public static void main(String[] args) {
		test1();
		test1(10);
		test1(10, 20);
		test1('a');
	}

}
