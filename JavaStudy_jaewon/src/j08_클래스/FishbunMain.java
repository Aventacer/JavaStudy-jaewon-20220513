package j08_클래스;

public class FishbunMain {

	public static void main(String[] args) {
		// 참조자료형 FishBun
		FishBun fb = new FishBun();	// 객체 생성자 인스턴스
		// new FishBun(); 이 반환(리턴)하는 값은 메모리 주소다.
		// 참조자료형 (메모리주소값을담는)변수 = new 객체생성자;
		
		fb.showInfo();
		fb.material = "팥앙금";
		fb.dough = "부드러운 반죽";
		fb.showInfo();
		
		System.out.println("=============================");
		
		FishBun fb2 = new FishBun();	// 객체 생성자 인스턴스
		
		fb2.showInfo();
		fb2.material = "슈크림";
		fb2.dough = "팬케이크 반죽";
		fb2.showInfo();		
		
		fb.showInfo();
		showInfo();
		
		// 메모리 주소값
		System.out.println();
		System.out.println(fb);
		System.out.println(fb2);
		
	}
	
	static void showInfo() {
		System.out.println("\nFishBunMain");
	}

}
