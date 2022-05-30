package j14_추상;

public class FactoryMain2 {

	public static void main(String[] args) {

		LGFactory lgFactory = new LGFactory();
		lgFactory.start();
		lgFactory.stop();	// lg의 부모클래스인 Factory의 stop 메소드를 불러온다
		
		// Factory factory = new Factory();	// Factory는 추상클래스라서 생성 할 수 없다.
		
		SamsungFactory samsungFactory = new SamsungFactory(); 
		samsungFactory.start();
		samsungFactory.stop();
	}

}
