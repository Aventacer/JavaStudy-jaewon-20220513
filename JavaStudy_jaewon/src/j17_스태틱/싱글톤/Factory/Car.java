package j17_스태틱.싱글톤.Factory;

// 정보를 담는 클래스 = entity
// 메소드만 담은 클래스 = logic

public class Car {	
	private int serialNum;
	private String company;
	private String model;
	
	public Car() {}
	
	public Car(int serialNum, String company, String model) {
		super();
		this.serialNum = serialNum;
		this.company = company;
		this.model = model;
	}

	public int getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Car [serialNum=" + serialNum + ", company=" + company + ", model=" + model + "]";
	}
		
}
