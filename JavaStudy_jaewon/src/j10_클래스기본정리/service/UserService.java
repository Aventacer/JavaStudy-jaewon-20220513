package j10_클래스기본정리.service;

import java.util.Scanner;

import j10_클래스기본정리.repository.User;

public class UserService {
	private Scanner scanner;
	
	// 생성자 
	// scanner가 생성될때 생성해라
	public UserService() {
		scanner = new Scanner(System.in);
	}
	
	public User insertUser() {
		showInsertView();
		String usercode = null;
		String email = null;
		String name = null;
		String username = null;
		String password = null;
		
		System.out.print("사용자번호입력 : ");
		usercode = scanner.nextLine();
		System.out.print("이메일 : ");
		email = scanner.nextLine();
		System.out.print("이름 : ");
		name = scanner.nextLine();
		System.out.print("사용자이름 : ");
		username = scanner.nextLine();
		System.out.print("비밀번호 : ");
		password = scanner.nextLine();
		
		
		//this.getClass().getField();
		
		User user = new User(usercode, email, name, username, password);
		return user;
	}
	
	private void showInsertView() {
		System.out.println("[사용자 추가]");
		System.out.println("아래의 양식에 맞게 정보를 입력하세요.");
	}
}
