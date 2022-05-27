package j10_클래스기본정리;

import j10_클래스기본정리.controller.UserManagementController;
import j10_클래스기본정리.repository.User;

import j10_클래스기본정리.service.UserService;

public class UserManagementApplication {

	public static void main(String[] args) {
		
		
		  UserManagementController userManagementController = new UserManagementController(); 
		  userManagementController.createUser();
		  userManagementController.createUser();
		  userManagementController.createUser();
		 
		// 인터페이스에서 사용하는것
		/*
		 * UserManagementController userManagementController = new UserManagementController(new UserService());
		 * userManagementController.createUser();
		 */
		
		
	}

}
