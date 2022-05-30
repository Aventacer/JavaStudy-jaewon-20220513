package j16_인터페이스_활용;

import j16_인터페이스_활용.controller.APIController;
import j16_인터페이스_활용.service.AuthUserService;
import j16_인터페이스_활용.service.OAuth2UserService;

public class Main {

	public static void main(String[] args) {
		
//		AuthUserService authUserService = new AuthUserService();
//		OAuth2UserService oauth2UserService = new OAuth2UserService();
		
//		APIController company_A = new APIController(new AuthUserService());
		APIController company_A = new APIController(new OAuth2UserService());
		company_A.addUser();
		company_A.getUser();
		company_A.modifiUser();
		company_A.removeUser();
	}

}
