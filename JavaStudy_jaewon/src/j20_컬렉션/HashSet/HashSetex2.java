package j20_컬렉션.HashSet;

import java.util.HashSet;
import java.util.Iterator;

import j20_컬렉션.Entity.Student;

/*
 * hashSet 생성
 * 
 * 20220001, 김준일, "부산대학교"
 * 20220002, 김준이, "부경대학교"
 * 
 * 20220002의 코드를 가진 학생을 조회 iterator
 *
 * 20220001의 코드를 가진 학생을 삭제 iterator
*/
public class HashSetex2 {
	public static void main(String[] args) {
		// set - 순서 없고, 중복 안됨
		HashSet<Student> std = new HashSet<Student>();
		
		std.add(new Student(20220001, "김준일", "부산대학교"));
		std.add(new Student(20220002, "김준이", "부경대학교"));
		
		// Stack 화 (?)
		Iterator<Student> iterator = std.iterator();
		
		while(iterator.hasNext()) {
			// 클래스접근
			Student stditer = iterator.next();
			// 조회
			if(stditer.getStudentCode() == 20220002) {
				System.out.println(stditer);
			}
			// 삭제
			if(stditer.getStudentCode() == 20220001) {
				std.remove(stditer);
			}
		}
		
		System.out.println(std);
		
		
	}
}
