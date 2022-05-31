package j17_스태틱.student;

public class StudentMain {

	public static void main(String[] args) {

//		Student st1 = new Student();
//		st1.setStudent_name("김철수");
//		st1.setStudent_year(2);
//		Student.codeNum();
//		st1.showInfo();
//		
//
//		Student st2 = new Student();
//		st2.setStudent_name("홍길동");
//		st2.setStudent_year(4);
//		Student.codeNum();
//		st2.showInfo();

		Student st1 = new Student("김일일", 3);
		Student st2 = new Student("김일이", 4);
		Student st3 = new Student("김일삼", 4);
		Student st4 = new Student("김일사", 2);
		Student st5 = new Student("김일오", 1);

		st1.showInfo();
		st2.showInfo();
		st3.showInfo();
		st4.showInfo();
		st5.showInfo();

	}

}
