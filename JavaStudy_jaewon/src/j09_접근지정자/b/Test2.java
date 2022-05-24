package j09_접근지정자.b;

import j09_접근지정자.a.Test1;

public class Test2 {
	public String ccc;
	protected String ddd;
	String eee;
	private String fff;
	
	// 생성자는 기본적으로는 public으로 잡혀있지만
	// 별도로 클래스명으로만 (Test2() {} ) 하면 default로 잡혀있다
	
	public Test2() {
		Test1 t1 = new Test1(); 
	}
}
