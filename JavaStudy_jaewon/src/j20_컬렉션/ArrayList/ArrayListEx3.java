package j20_컬렉션.ArrayList;

import java.util.ArrayList;

import j20_컬렉션.Entity.Student;

/*
 * 1.student 자료형을 담을 수 있는 Arraylist를 생성.
 * 
 * 2.학생정보 추가
 * studenCode	name	schoolName
 * 20220001		김준일	부산교육대학원
 * 20220002		곽나경	부산대학교
 * 20220003		정현경	부경대학교
 * 20220004		한재안	부산대학교
 * 20220005		전주홍	동아대학교
 * 
 * 3.전체 학생 정보 출력
 * 
 * 4.인덱스 3에 추가
 * 20220006		한대경	서울대학교
 * 
 * 5.인덱스 2의 위치에 있는 학생의 학교명을 고려대학교
 * 
 * 6.인덱스 5의 위치에 있는 학생의 정보를 수정
 * 20220007 	김나예	부산여자대학교
 * 
 * 7.인덱스 0의 위치에 있는 학생의 정보를 삭제
*/ 
public class ArrayListEx3 {
	public static void main(String[] args) {
		ArrayList<Student> studentArray = new ArrayList<Student>();	
		Student s = new Student(20220001, "김준일", "부산교육대학원");
		// 1. 학생정보 추가
		studentArray.add(s);
		studentArray.add(new Student(20220002, "곽나경", "부산대학교"));
		studentArray.add(new Student(20220003, "정현경", "부경대학교"));
		studentArray.add(new Student(20220004, "한재안", "부산대학교"));
		studentArray.add(new Student(20220005, "전주홍", "동아대학교"));
		
		// studentArray.get(0).getName().equals(s.getSchoolName());
		
		// 2. 전체 학생 정보 출력
//		System.out.println(studentArray);
//		for(Student s : studentArray) System.out.println(s);
//		System.out.println("==================");

		// 3. 인덱스 3에 추가
		studentArray.add(3, new Student(20220006, "한대경", "서울대학교"));
//		for(Student s : studentArray) System.out.println(s);
//		System.out.println("==================");
		
		// 4. 인덱스 2의 위치에 있는 학생의 학교명을 고려대로
		//studentArray.set(2, new Student(20220003, "정현경", "고려대학교"));
		studentArray.get(2).setSchoolName("고려대학교");
//		for(Student s : studentArray) System.out.println(s);
//		System.out.println("==================");
		
		// 5. 인덱스 5의 위치에 있는 학생의 정보를 수정
		studentArray.set(5, new Student(20220007, "김나예", "부산여자대학교"));
//		for(Student s : studentArray) System.out.println(s);
//		System.out.println("==================");
		
		// 6. 인덱스 0의 위치에 있는 학생의 정보를 삭세
		studentArray.remove(0);
//		for(Student s : studentArray) System.out.println(s);
		
	}
}
