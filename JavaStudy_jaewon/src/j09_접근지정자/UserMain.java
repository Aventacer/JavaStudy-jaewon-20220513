package j09_접근지정자;

import j09_접근지정자.a.Student;
import j09_접근지정자.b.Teacher;

public class UserMain {
	public static void main(String[]args) {
		Student st1 = new Student();
		Teacher tc1 = new Teacher();
		
		/*
		 * st1.name= "도우너"; st1.schoolName = "koreaIT";
		 * 
		 * tc1.name = "고길동"; tc1.address = "부산";
		 */
		
		st1.setName("또치");
		System.out.println(st1.getName());
		
		tc1.setName("고길동");
		tc1.setAddress("얼음나라");
		tc1.setPhone("02-123-1234");
		
		tc1.showInfo();
	}
}
