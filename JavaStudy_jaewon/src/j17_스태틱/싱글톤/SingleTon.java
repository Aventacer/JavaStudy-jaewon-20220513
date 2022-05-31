package j17_스태틱.싱글톤;

/*
 * 1. 생성자는 private으로 지정하여 외부에서 생성 할 수 없게 만들어야한다.	// 15번 Line
 * 2. 싱글톤으로 설계된 클래스의 유일한 instance를 return해줄 수 있는 
 *    getInstance() Static 메소드가 존재해야한다.	// 19번 Line
 * 3. 싱글톤 instance를 저장할 변수명이 instance인 static 변수가 존재해야한다. // 11번 Line
*/

public class SingleTon {
	private static SingleTon instance = new SingleTon(); // 미리 생성 (메모리에 생성될 공간이 없으면 안될 수도 있기도 한다(거의x)
	private int cnt;
	
	//public SingleTon() {}	// private으로 해야한다 - 다른 클래스에서 생성되지 못하게, 인스턴스는 하나여야한다 유일한 객체
	private SingleTon() {}
	
	
	// static 메소드에서는 static 변수만 사용가능하다, 일반 변수는 불가.
	public static SingleTon getInstance() {
		if(instance == null) {
			instance = new SingleTon();
		}
		return instance;
	}
	
	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public void printInfo() {
		System.out.println("singleTon Test -> " + cnt);
	}
}
