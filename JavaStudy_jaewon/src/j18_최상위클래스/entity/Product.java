package j18_최상위클래스.entity;

import java.time.LocalDate;
import java.util.Objects;

/*
 * 상품 정보 클래스(Entity Class) - 정보를 담는 클래스
 * 
 * 익힐때까진 필수!( '-'는 제외{문제임})
 * 
 * 변수
 * -productCode	int
 * -productName string
 * -category	int
 * -productionDate (생산날짜)	localdate
 * 기본생성자
 * 
 * 전체 생성자
 * 
 * getter, setter
 * 
 * hashcode()
 * 
 * equals()
 * 
 * toString()
*/

public class Product {
	private int productCode;
	private String productName;
	private int category;
	private LocalDate productionDate;
	
	// 기본 생성자
	public Product() {}
	// 전체 생성자
	public Product(int productCode, String productName, int category, LocalDate productionDate) {
		super();
		this.productCode = productCode;
		this.productName = productName;
		this.category = category;
		this.productionDate = productionDate;
	}
	
	// 각 getter, setter
	public int getProductCode() {
		return productCode;
	}
	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	public LocalDate getProductionDate() {
		return productionDate;
	}
	public void setProductionDate(LocalDate productionDate) {
		this.productionDate = productionDate;
	}
	
	// hashcode 주소값생성
	@Override
	public int hashCode() {
		return Objects.hash(category, productCode, productName, productionDate);
	}
	
	// equals 클래스정보 비교
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return category == other.category && productCode == other.productCode
				&& Objects.equals(productName, other.productName)
				&& Objects.equals(productionDate, other.productionDate);
	}
	
	// toString 각 변수 정보
	@Override
	public String toString() {
		return "Product [productCode=" + productCode + ", productName=" + productName + ", category=" + category
				+ ", productionDate=" + productionDate + "]";
	}
	
	
}
