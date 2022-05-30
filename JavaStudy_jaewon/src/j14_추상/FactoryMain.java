package j14_추상;

public class FactoryMain {

	public static void main(String[] args) {

//		Factory lg = new LGFactory();
//		Factory samsung = new SamsungFactory();
//		
//		lg.start();
//		lg.stop();
//		
//		samsung.start();
//		samsung.stop();

		// Factory클래스를 상속받은 모든 클래스(인스턴스)를 담을 수 있는 공간 2개의 배열 생성.
		Factory[] factories = new Factory[2];

		// 업캐스팅
		factories[0] = new LGFactory();
		factories[1] = new SamsungFactory();

		// foreach문 = 처음부터 끝까지 반복
		for (Factory factory : factories) {
			factory.start();
		}
		for (int i = 0; i < 2; i++) {
			factories[i].stop();
		}

		// 다운캐스팅
		for (Factory factory : factories) {		
			if (factory instanceof LGFactory) {
				LGFactory lgF = (LGFactory) factory;
			} else if (factory instanceof SamsungFactory) {
				SamsungFactory ssf = (SamsungFactory) factory;
			} else {
				System.out.println("DownCasting Fail.");
			}
		}

	}

}
