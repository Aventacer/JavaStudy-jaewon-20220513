package j17_스태틱.싱글톤.Factory;

public class Main {	
	public static void main(String[] args) {
		KIA kiafactory1 = KIA.getInstance();
		KIA kiafactory2 = KIA.getInstance();
		KIA kiafactory3 = KIA.getInstance();
		
		Car k5_01 = kiafactory1.createCar("k5");
		Car k5_02 = kiafactory1.createCar("k5");
		
		kiafactory1.carInfo(k5_01);
		kiafactory1.carInfo(k5_02);
		
		Car k7_01 = kiafactory2.createCar("k7");
		Car k7_02 = kiafactory2.createCar("k7");
		
		kiafactory2.carInfo(k7_01);
		kiafactory2.carInfo(k7_02);
	}
}
