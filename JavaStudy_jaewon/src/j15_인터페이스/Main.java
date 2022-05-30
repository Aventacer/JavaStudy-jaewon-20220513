package j15_인터페이스;

public class Main {

	public static void main(String[] args) {
		//Hdmi hdmi = new Hdmi(); // 생성 불가

		Monitor monitor = new Monitor();
		BeamProjector beamProjector = new BeamProjector();
		//SmartPhone smartPhone = new SmartPhone(monitor);		// 업캐스팅 
																// - 생성자안의 매개변수가 Hdmi이라서
																// 즉 Hdmi가 상위클래스라서다
		SmartPhone smartPhone = new SmartPhone(beamProjector);	// 업캐스팅
		
		smartPhone.powerOn();
		System.out.println();
		smartPhone.powerOff();
		
	}

}
