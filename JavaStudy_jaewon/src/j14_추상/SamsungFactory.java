package j14_추상;

public class SamsungFactory extends Factory{

	@Override
	public void start() {
		System.out.println("삼성 팩토리 가동.");
	}
	
	@Override
	public void stop() {
		System.out.println("삼성 공장 중지.");
	}

	
}
