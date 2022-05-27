package j12_상속.동물;

/*
 * 
 * @ <- 어노테이션 Annotation
 * 
 * @Override 오버라이드란? - 재정의 (다형성)
 * 부모가 가진 메소드를 재정의 하는것
 * 상위 클래스 또는 인터페이스가 가지고 있는 메소드를 재정의를 하겠다는 의미.
*/

public class Human extends Animal {
	
	@Override		
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}
	
	
}
