package j19_제네릭;

import j10_클래스기본정리.repository.User;

public class Main {
	public static void main(String[] args) {
		Controller controller = new Controller();
		System.out.println(controller.createUser());
		System.out.println(controller.updateUser());
		// 다운캐스팅 해야 getData를 사용할 수 있다
		//System.out.println(((CMRespDto<User>)controller.getUser()).getData());
		//와일드카드 썻을땐 다운캐스팅을 할 필요가 없어졋다
		System.out.println(controller.getUser().getData());
		
		controller.getAnimal().getData().move();
	}
}
