package j12_상속;

import javax.management.remote.SubjectDelegationPermission;

public class Test1 extends Test{
//	public void test1Print() {
//		testPrint();
//	}
//	
	
	public Test1() {
		super();	// super = 부모클래스 즉 여기서는 Test,  부모의 주소다. ,부모 클래스 생성, 항상 제일 위, 기본적으로는 생략되어있음
		System.out.println("T1 생성자 호출");
		System.out.println("T1에서 확인 : " + super.toString());
	}
}
