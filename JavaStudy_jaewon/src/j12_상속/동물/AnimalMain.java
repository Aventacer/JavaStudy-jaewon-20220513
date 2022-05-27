package j12_상속.동물;

public class AnimalMain {
	public static void main(String[] args) {
		Animal animal = new Animal();
		Human human = new Human();
		Tiger tiger = new Tiger();
		
		animal.move();
		human.move();
		tiger.move();
		
		// human 과 tiger는 move를 쓸수 있고 각자 가진 메소드도 각자 쓸 수 있다
		human.readBooks();
		tiger.hunting();
	}
}
