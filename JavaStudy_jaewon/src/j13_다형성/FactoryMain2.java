package j13_다형성;

public class FactoryMain2 {
	public static void main(String[] args) {
		Factory[] factories = new Factory[100];
		
		// 업캐스팅됨
//		factories[0] = new SmartPhoneFactory();
//		factories[1] = new ComputerFactory();
		
		for(int i = 0; i< factories.length ; i++) {
			factories[i] = i % 2 == 0? new SmartPhoneFactory() : new ComputerFactory();	// 삼항연산자 || 조건연산자 라고 한다
		}
		
		for(Factory factory : factories) {
			factory.start();
		}
		
		// 다운캐스팅 - 주의! 업캐스팅 된 녀석들만 다운시킬 수 있다
		for(Factory factory : factories) {
			if(factory instanceof SmartPhoneFactory) {	// "A instanceof B" A가 B 자료형(생성된)인지
				
				SmartPhoneFactory spf = (SmartPhoneFactory) factory;				
				spf.showSmartPhone();
			
			}else if(factory instanceof ComputerFactory) {
				
				ComputerFactory cpf = (ComputerFactory) factory;
				cpf.showComputer();
				
			}else {
				System.out.println("다운캐스팅 실패.");
			}
		}
		
	}	
}
