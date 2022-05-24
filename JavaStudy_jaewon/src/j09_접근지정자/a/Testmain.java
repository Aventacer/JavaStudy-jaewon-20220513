package j09_접근지정자.a;

// 다른 패키지에 있는 클래스를 불러준다
import j09_접근지정자.b.Test2;

public class Testmain {

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.aaa = "안녕";
		
		//new te
		
		Test2 t2 = new Test2();			// 다른 패키지의 클래스
		t2.ccc = "ccc";
		
	}

}
