package j20_컬렉션.HashMap;

import java.util.HashMap;
import java.util.Iterator;

import j20_컬렉션.Entity.Student;

public class HashMapex3 {
	public static void main(String[] args) {
		HashMap<Integer, Student> students = new HashMap<Integer, Student>();
		
		students.put(20220001, new Student(20220001,"김준일", "부산대학교"));
		students.put(20220002, new Student(20220002,"권오강", "부경대학교"));
		students.put(20220003, new Student(20220003,"남민아", "동아대학교"));
		students.put(20220004, new Student(20220004,"김재현", "경상대학교"));
		students.put(20220005, new Student(20220005,"송새미", "경북대학교"));
		
		
		/*
		 * 1. 이름이 김재현 인 학생의 대학을 서울대로 변경.
		 * 2. 20220003 학번의 학생을 20220003, "박호훈", "고려대학교"로 변경
		 * 3. 20220005 학번의 학생을 삭제
		 * 4. 20220002 학번 학생정보 출력
		 * 
		*/
		
		// 1. 김재현의 학교를 서울대로 변경
		Iterator<Integer> iterator = students.keySet().iterator();
		while(iterator.hasNext()) {
			Integer key = iterator.next();
			
			// 내 답안
			Student value = students.get(key);
			if(value.getName().equals("김재현")) {
				value.setSchoolName("서울대학교");
				break;
			}
			
//			// 강사 답안
//			if(students.get(key).getName().equals("김재현")) {
//				students.get(key).setSchoolName("서울대학교");
//				break;
//			}
		}
		
//		// 강사 답안 2 forEach
//		for(Student student : students.values()) {	//values == collection형태로 가져옴 - list처럼 사용가능
//			if(student.getName().equals("김재현")) {
//				student.setSchoolName("서울대학교");
//				break;
//			}
//		}
		
//		// 강사 답안 3 람다     // stream 이라는건데 반복문이 아니라서 break를 못쓴다
//		students.forEach((k, v) -> {
//			if(v.getName().equals("김재현")) {
//				v.setSchoolName("서울대학교");
//			}
//		});
		
		// 2. 20220003 학번의 학생을 20220003, "박호훈", "고려대학교"로 변경
		students.replace(20220003, new Student(20220003, "박호훈", "고려대학교"));
		
		// 3. 20220005 학번의 학생을 삭제
		students.remove(20220005);
		
		// 4. 20220002 학번 학생정보 출력
		System.out.println(students.get(20220002));
		
		// 전체출력
		System.out.println(students);
	}
}
