package j17_스태틱.싱글톤;

public class singleTonMain {
	public static void main(String[] args) {
		/*
		 * 싱글톤
		 * 1. 유일한 객체(인스턴스)를 생성 해야한다.
		 * 
		*/		
		
		//SingleTon singleTon = new SingleTon();
//		singleTon.setCnt(10);
//		singleTon.printInfo();
//		
//		SingleTon singleTon2 = new SingleTon();
//		singleTon2.setCnt(10);
//		singleTon2.printInfo();
		
		SingleTon singleTon = SingleTon.getInstance();
		singleTon.setCnt(320);
		singleTon.printInfo();

		SingleTon singleTon2 = SingleTon.getInstance();
		//singleTon2.setCnt(40);
		singleTon2.printInfo();
	}
}
