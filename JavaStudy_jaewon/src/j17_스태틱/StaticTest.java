package j17_스태틱;

public class StaticTest {
	
	public static int count;
	private static int count2;
	
	public static void staticMethod() {
		System.out.println("스태틱 메소드 [ " + count + " ]");
	}

	public static void staticMethod2() {
		System.out.println("스태틱 메소드 [ " + count2 + " ]");
	}

	
	
	
	public static int getCount2() {
		return count2;
	}

	public static void setCount2(int count2) {
		StaticTest.count2 = count2;
	}
	
	
}
