package j08_클래스;

public class User {
	String name, age, phone, address;
	
	User(){
		// 자료형을 따로 넣지않는다
		System.out.println("생성자");
	}
	User(String name){
		this.name = name;
	}
	User(String name, String age, String phone, String address){
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
	}
	//this. <- 자기자신의 주소
	void setName(String name) {
		//name = "홍길동";
		System.out.println("setName 메소드 안에서 호출 : " + this);
		this.name = name; 
	}
	
}
