package j10_클래스기본정리.repository;

/*
 * Entity(독립체) Class
 * 
 * 정보를 담는 객체를 Entity 객체라고 한다.
 * 
 * 
*/

public class User {
	// 이 변수들이 핵심이다. (정보)
	private String usercode;
	private String email;
	private String name;
	private String username;
	private String password;
	
	// 기본생성자
	// ctrl + space "constructor"
	public User() {
		
	}
	
	// 전체생성자
	// alt + shift + s "generate constructor using field"
	public User(String usercode, String email, String name, String username, String password) {
		this.usercode = usercode;
		this.email = email;
		this.name = name;
		this.username = username;
		this.password = password;
		
	}

	// getter setter
	// alt + shift + s "generate getter setter"
	public String getUsercode() {
		return usercode;
	}

	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// toString
	@Override
	public String toString() {
		return "User [usercode=" + usercode + ", email=" + email + ", name=" + name + ", username=" + username
				+ ", password=" + password + "]";
	}
	
	
}
