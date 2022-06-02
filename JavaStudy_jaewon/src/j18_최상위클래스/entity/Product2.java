package j18_최상위클래스.entity;

import java.time.LocalDate;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@NoArgsConstructor 		// 기본 생성자 - args=매개변수		// final 쓸때는 지워줘야함 - 생성될때마다 초기화되어야하는데 충돌남
@AllArgsConstructor		// 전체 생성자
@RequiredArgsConstructor		// @NonNull 쓸때 필요함 
@Getter	
@Setter
@EqualsAndHashCode
@ToString
public class Product2 {
	@NonNull	// null일 수 없다
	private final int productCode;
	private String productName;
	private int category;
	private LocalDate productionDate;
	
	
}
