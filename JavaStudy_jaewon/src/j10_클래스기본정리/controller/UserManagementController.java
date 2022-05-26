package j10_클래스기본정리.controller;

import j10_클래스기본정리.repository.User;
import j10_클래스기본정리.service.UserService;

public class UserManagementController {
	private UserService userService;
	private User[] users;
	// 기본생성자

	public UserManagementController() {
		userService = new UserService();
		users = new User[2];
	}

	// 인터페이스할때 사용방법

	/*
	 * public UserManagementController(UserService userService) { this.userService =
	 * userService; }
	 */

	public void createUser() {
		// ★
		// insertUser에서 User를 생성하고 반환을 User로 하기 때문에
		// insertUser의 User user의 주솟값을 반환해줌으로
		// 아래의 User user 라고 단순히 자료형 변수형태로 사용가능하다
		// User user = userService.insertUser();
		
		int indexResult = findEmptyInUsers();
		if (indexResult != -1) {	
			users[indexResult] = userService.insertUser();
			System.out.println("[새로 추가된 사용자]");
			System.out.println(users[indexResult].toString());
		}else {
			System.out.println("더 이상 사용자를 추가 할 수 없습니다.");
		}
		
		/*
		 * User user = new User(); user = userService.insertUser();
		 */

		
		//System.out.println("[새로 추가된 사용자]");
		//System.out.println(user.toString());

	}
	
	private int findEmptyInUsers () {
		for(int i = 0; i< users.length ; i++) {
			if(users[i] == null) return i;
		}
		return -1;
	}

	public void updateUser() {

	}
}
