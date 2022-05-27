package j12_상속.동물;

public class Tiger extends Animal{
	
	@Override
	public void move() {
		//super.move();	// 상위(부모)클래스의 move()메소드를 호출
		System.out.println("호랑이는 네 발로 뛴다");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}

}
