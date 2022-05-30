package j14_추상;

/*
 * abstract(추상)
 * 
 * 추상 메소드 :
 * 1. Return type 앞에 abstract가 붙는다.
 * 2. 추상 메소드는 일반 클래스 안에 선언 할 수 없다.
 * 3. 상속 또는 구현된 클래스에서 무조건 Override(재정의)가 되어야한다.
 * 4. 상속받은 자식클래스가 필수로 사용되어야 하는 목적이 있다.
 * 
 * 추상 클래스 :
 * 1. 클래스 type 앞에 abstract가 붙는다.
 * 2. 추상 클래스는 생성할 수 없다.(생성자로 생성이 불가능하다.) - 단순한 설계도정도?
 * 3. 추상 메소드를 포함 할 수 있다. 하지만 추상 메소드를 꼭 포함하지 않아도 된다.
 * 
*/

// 추상클래스 
// - 이 클래스를 상속받은 클래스는 abstract 되어 있는 메소드를 무조건 재정의(오버라이드)를 해줘야 한다
public abstract class Factory {
	
	// 일반 메소드
	//	public void start() {
//		System.out.println("공장을 가동합니다.");
//	}
//	public void stop() {
//		System.out.println("공장을 멈춥니다.");
//	}
	
	// 추상 메소드
	public abstract void start();	// 반드시 재정의
	public void stop() {
		System.out.println("공장을 멈춥니다.");
	}	// 재정의 해도 되고 안해도 되고
	
	private void test() {	// 절대 상속 되지 않는다.
		
	}
}
