package j08_클래스;

/*
 * 1.Car 클래스 생성
 * 2.Car 클래스 속성(변수) 제조사(company), 모델명(model), 색상(color)
 * 3.Car 클래스 기능(메소드)
 * showCompanyInfo() -> 000회사에서 제조된 차량입니다.
 * showInfoAll() ->
 * 제조사 : KIA
 * 모델 : K5
 * 색상 : 화이트
 * getCar() -> return "KIA_K5_화이트"
 * setColor() -> 매개변수에 색상을 받아서 color변수의 값을 변경
 * 
 * KIA, K7, 블랙 -setColor(블루)
 * 현대자동차, 소나타, 화이트 -setColor(그레이)
 * Tesla, Model3, 레드 -setColor(그린)
*/

public class Carmain {
	
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
	
		car1.company = "KIA";
		car1.model = "K7";
		car1.color = "블랙";
		car1.showCompanyInfo();
		car1.showInfoAll();
		System.out.println(car1.getCar());
		car1.setColor("블루");
		//System.out.println(car1.getCar());
		System.out.println("\t\t\t\t색상변경후");
		car1.showInfoAll();
		
		System.out.println();
		System.out.println("====================");
		System.out.println();
		car2.company = "현대자동차";
		car2.model = "쏘나타";
		car2.color = "화이트";
		car2.showCompanyInfo();
		car2.showInfoAll();
		System.out.println(car2.getCar());
		car2.setColor("그레이");
		//System.out.println(car2.getCar());
		System.out.println("\t\t\t\t색상변경후");
		car2.showInfoAll();

		System.out.println();
		System.out.println("====================");
		System.out.println();
		
		car3.company = "Tesla";
		car3.model = "Model3";
		car3.color = "레드";
		car3.showCompanyInfo();
		car3.showInfoAll();
		System.out.println(car3.getCar());
		car3.setColor("그린");
		//System.out.println(car3.getCar());
		System.out.println("\t\t\t\t색상변경후");
		car3.showInfoAll();
	}

}
