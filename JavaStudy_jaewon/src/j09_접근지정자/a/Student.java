package j09_접근지정자.a;

public class Student {
	private String name;
	private String schoolName;
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	
	// getter
	public String getName() {
		return name;
	}
	
	// setter
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	// getter
	public String getSchoolName() {
		return schoolName;
	}
}
