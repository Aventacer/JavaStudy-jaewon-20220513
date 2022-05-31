package j17_스태틱;

public class Main {
	public static void main(String[] args) {

		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = new Test();
		
		t1.count = 10;
		t2.count = 20;
		t3.count = 30;
		
		t1.method();
		t2.method();
		t3.method();
		
		
		// static (전역) - 공유 개념, 변수나 메소드의 주소가 고정값
//		StaticTest st1 = new StaticTest();
//		StaticTest st2 = new StaticTest();
//		StaticTest st3 = new StaticTest();
//		
//		st1.count = 10;
//		st2.count = 20;
//		st3.count = 30;
//		
//		
//		st1.staticMethod();
//		st2.staticMethod();
//		st3.staticMethod();
		
		StaticTest.count = 200;
		
		StaticTest.staticMethod();	// 생성자와 상관없이 클래스명으로 바로 접근가능 (Static)
		
		StaticTest.setCount2(3000);
		
		StaticTest.staticMethod2();
	}
}
