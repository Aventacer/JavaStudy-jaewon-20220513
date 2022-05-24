package j08_클래스;

public class UserMain {

	public static void main(String[] args) {
		//System.out.println(new User());
		User u1 = new User();
		
		System.out.println("첫번째 : " + u1.name);
		System.out.println("메인메소드에서 호출 : " + u1);
		//u1.name = "김철수";
		u1.setName("aaaaa");
		System.out.println("2nd : " + u1.name);
		
		User u2 = new User("이명박","몰라","010-1234-1234","어딘가");
		System.out.println(u2.name);
		System.out.println(u2.age);
		System.out.println(u2.phone);
		System.out.println(u2.address);
		
	}

}
