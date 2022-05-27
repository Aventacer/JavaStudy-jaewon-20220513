package j13_다형성;

public class FactoryMain {
	public static void main(String[] args) {
//		SmartPhoneFactory smartPhoneFactory = new SmartPhoneFactory();
//		ComputerFactory computerFactory = new ComputerFactory();
		
		// Factory[] factories = new Factory[5];	// 스맛, 컴터 클래스의 자료형이 같으니 묶을수가 있다
		
		// 업캐스팅
		Factory smartPhoneFactory = new SmartPhoneFactory();
		Factory computerFactory = new ComputerFactory();
		
		smartPhoneFactory.start();
		computerFactory.start();
		
	}
}
