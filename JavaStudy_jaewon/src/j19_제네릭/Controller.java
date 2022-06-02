package j19_제네릭;

import j10_클래스기본정리.repository.User;
import j12_상속.동물.Animal;
import j12_상속.동물.Human;
import j12_상속.동물.Tiger;

public class Controller {

	public Object createUser() {
		return new CMRespDto<String>(1, "회원추가 성공", "aaa,1234");
	}

	public Object updateUser() {
		return new CMRespDto<Integer>(1, "회원정보(나이)추가 성공", 29);
	}

	// 제네릭의 와일드카드
	public CMRespDto<?> getUser() { // wildcard - 반환자료형이 어떤 타일일지 모를때
		User user = new User();
		user.setUsercode("2");
		user.setUsername("gildong");
		user.setPassword("1234");
		user.setName("홍길동");
		user.setEmail("asd@asdf.saf");

		if (user.getUsercode().equals(1)) {
			return new CMRespDto<>(1, "회원정보(나이)추가 성공", user);
		} else {
			return new CMRespDto<String>(-1, "회원정보가져오기 실패", "usercode = 2");
		}

	}

	public CMRespDto<? extends Animal> getAnimal() {	// 와일드카드에서 상속으로 제한건다 = 제약조건
		Animal animal = new Human();

		if (animal instanceof Human) {
			return new CMRespDto<Human>(1, "사람입니다.", (Human) animal);
		} else if (animal instanceof Tiger) {
			return new CMRespDto<Tiger>(1, "호랑이입니다.", (Tiger) animal);
		} else {
			return new CMRespDto<>(-1, "찾을 수 없는 동물", null);
		}

	}
}
