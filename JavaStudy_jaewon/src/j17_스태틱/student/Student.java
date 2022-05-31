package j17_스태틱.student;

/*
 * student_code(정수)
 * student_name(이름)
 * student_year(학년)
 * 
 * 학생을 한명 생성할때마다 자동으로 student_code의 값이
 * 1씩 증가하여 부여될 수 있게 작성.
 * 
 * 20220001
 * 20220002
*/

public class Student {
	private static int auto_increment = 20220000;	// 공통학번
	private int student_code; 
	private String student_name;
	private int student_year;

	// 기본 생성자
	public Student() { // 생성될 때마다 code값 증가

	}
	
	// 전체 생성자
	public Student(String student_name, int student_year) {
		this.student_code = ++auto_increment;
		this.student_name = student_name;
		this.student_year = student_year;
	}
	

//	public Student(int code, String name, int year) {
//		student_code = code;
//		student_name = name;
//		student_year = year;
//	}

	public void showInfo() {
		System.out.println("학번 : " + student_code);
		System.out.println("이름 : " + student_name);
		System.out.println("학년 : " + student_year + "학년\n");
	}

	
//	public static void codeNum() {
//		//System.out.println(student_code);		
//	}
//	
//	public String getStudent_name() {
//		return student_name;
//	}
//	public void setStudent_name(String student_name) {
//		this.student_name = student_name;
//	}
//	public int getStudent_year() {
//		return student_year;
//	}
//	public void setStudent_year(int student_year) {
//		this.student_year = student_year;
//	}

}
