package j18_최상위클래스.entity;

import java.time.LocalDate;
import java.util.Objects;

public class School {
	private String schoolName;				// 학교명
	private LocalDate constructionDate;		// 건설날짜
	private String schoolLocation;			// 학교위치
	private String schoolType;				// 학교종료
	private String major;					// 학과
	private int teacherNum;					// 선생 수
	private int studentNum;					// 선생 수
	
	public School() {}

	public School(String schoolName, LocalDate constructionDate, String schoolLocation, String schoolType, String major,
			int teacherNum, int studentNum) {
		super();
		this.schoolName = schoolName;
		this.constructionDate = constructionDate;
		this.schoolLocation = schoolLocation;
		this.schoolType = schoolType;
		this.major = major;
		this.teacherNum = teacherNum;
		this.studentNum = studentNum;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public LocalDate getConstructionDate() {
		return constructionDate;
	}

	public void setConstructionDate(LocalDate constructionDate) {
		this.constructionDate = constructionDate;
	}

	public String getSchoolLocation() {
		return schoolLocation;
	}

	public void setSchoolLocation(String schoolLocation) {
		this.schoolLocation = schoolLocation;
	}

	public String getSchoolType() {
		return schoolType;
	}

	public void setSchoolType(String schoolType) {
		this.schoolType = schoolType;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getTeacherNum() {
		return teacherNum;
	}

	public void setTeacherNum(int teacherNum) {
		this.teacherNum = teacherNum;
	}

	public int getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(constructionDate, major, schoolLocation, schoolName, schoolType, studentNum, teacherNum);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		School other = (School) obj;
		return Objects.equals(constructionDate, other.constructionDate) && Objects.equals(major, other.major)
				&& Objects.equals(schoolLocation, other.schoolLocation) && Objects.equals(schoolName, other.schoolName)
				&& Objects.equals(schoolType, other.schoolType) && studentNum == other.studentNum
				&& teacherNum == other.teacherNum;
	}

	@Override
	public String toString() {
		return "School [schoolName=" + schoolName + ", constructionDate=" + constructionDate + ", schoolLocation="
				+ schoolLocation + ", schoolType=" + schoolType + ", major=" + major + ", teacherNum=" + teacherNum
				+ ", studentNum=" + studentNum + "]";
	}
	
	

	
}
