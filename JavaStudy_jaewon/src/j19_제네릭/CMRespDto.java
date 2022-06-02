package j19_제네릭;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data // getter, setter, equalhash, tostring 포함
public class CMRespDto<T> {		// 제네릭함수 - 자료형을 때에따라 유동적으로 사용하기위해
	private int code;
	private String msg;
	private T data;
	// private T temp;
	
	
}
