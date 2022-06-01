package j18_최상위클래스;

import java.util.Objects;

/*
 * Object Class 오브젝트 클래스 = 최상위클래스
 * - 모든 클래스마다 이미 상속되어있다.
 * - 생략되어있다.
 * - 어떤 클래스든 Object 클래스로 업캐스팅이 가능하다.
*/

public class Teacher extends Object{
	private String name;
	private String subject;
	private int age;
	
	public Teacher(String name, String subject, int age) {
		super();
		this.name = name;
		this.subject = subject;
		this.age = age;
	}
	
	@Override
	public String toString() {		// 변수들의 값을 확인하기위해 많이 사용된다
		//return super.toString();
		return "이름 : " + name + ", 과목 : " + subject;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name, subject);	// 매개변수들로 주솟값을 만들어주는것
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)	// 자기자신과 비교 될 obj와 비교
			return true;
		if (obj == null)	// 비교 될 obj가 null이면 false
			return false;
		if (getClass() != obj.getClass())	// getClass() = 클래스내부에 들어있는 정보 == Teacher
			return false;
		Teacher other = (Teacher) obj;
		return age == other.age && Objects.equals(name, other.name) && Objects.equals(subject, other.subject);
	}
	
	public void classInfo() {
		// A == B == C
		System.out.println(getClass().getSimpleName());			// A
		System.out.println(Teacher.class.getSimpleName());		// B
		System.out.println(this.getClass().getSimpleName()); 	// C
	}
	
	// 클래스끼리 값 비교 (java에 이미 정의된 (String 등) 클래스를 제외한 일반 클래스의 값 비교
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Teacher) {	// 같은 클래스명으로 만들어진지 확인하기위해
//			Teacher teacher = (Teacher) obj;	// 다운캐스팅 - obj로 들어온 클래스의 변수를 접근하기위해
//			if(this.name.equals(teacher.name) && this.subject.equals(teacher.subject) /* 이때 equals 는 String */
//					&& this.age == teacher.age) {	
//				return true;
//			}
//		}
//		return false;
//	}
	
	
	
	
}
