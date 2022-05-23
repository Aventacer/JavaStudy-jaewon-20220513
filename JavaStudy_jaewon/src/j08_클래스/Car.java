package j08_클래스;

public class Car {
	String company, model, color;
	
	void showCompanyInfo() {
		System.out.println(company + "회사에서 제조된 차량입니다.");
	}
	void showInfoAll() {
		System.out.println("제조사 : " + company);
		System.out.println("모델 : " + model);
		System.out.println("색상 : " + color);
	}
	/*
	 * //내답안 
	 * void getCar() { 
	 * System.out.println(company + "_" + model + "_" + color); }
	 */
	
	String getCar() {
		return company + "_" + model + "_" + color;
	}
	
	// 내답안
	void setColor(String color) {
		this.color = color;
	}

}
