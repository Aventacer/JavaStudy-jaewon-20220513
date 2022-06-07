package j21_익명클래스;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PrincipalDetailse {
	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<String>();

		strList.add("a");
		strList.add("b");
		strList.add("c");
		strList.add("d");
		strList.add("e");
		strList.add("f");
		
		// 방법 1 - 익명클래스 
		// - 구현 내용이 달라져야할때
		// - 사용빈도가 적을때 ?
		// - 새로운 객체 만들때 객체 내부의 메소드를 매번 수정해야함
		GrantedAuthority grantedAuthority = new GrantedAuthority() {
			
			@Override
			public Collection<String> getRoles(List<String> roles) {
				System.out.println(roles);
				return roles;
			}
		};
		GrantedAuthority grantedAuthority2 = new GrantedAuthority() {
			
			@Override
			public Collection<String> getRoles(List<String> roles) {
				
				return roles;
			}
		};
		// 방법 2 - GrantedAuthority 인터페이스를 implements 한 클래스로 생성
		GrantedAuthority grantedAuthorityImpl = new GrantedAuthorityImpl();
		
		grantedAuthority.getRoles(strList).forEach(r -> {System.out.println(r);}); // 콜렉션이라 forEach를 쓸 수 있다.
		grantedAuthority2.getRoles(strList).forEach(r -> {System.out.println(r);});
		grantedAuthorityImpl.getRoles(strList).forEach(r -> {System.out.println(r);});
		
		
	}
}
