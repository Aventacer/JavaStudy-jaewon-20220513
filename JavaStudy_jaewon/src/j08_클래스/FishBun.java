package j08_클래스;
// 클래스는 틀이다
public class FishBun {
	String material;	// 재료
	String dough;		// 반죽
	int a;
	
	// 이 생성자가 생략되어있다
	/* 일반 메소드와의 차이는 반환 자료형이 없다
	* 메소드랑은 다르게 대문자로 시작가능하다
	* 
	*/
	FishBun(){	// 생성자
		System.out.println("생성자 호출");
	}
	
	void showInfo() {
		System.out.println("재료 : " + material);
		System.out.println("반죽 : " + dough);
	}
	
	
	
}
