package j23_예외처리;

public class validationCustomException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;		// 다른프로그램이랑 연결할때 직렬할때

	public validationCustomException() {
		super();
		System.out.println("Custom Error");
	}
	
	public validationCustomException(String message) {
		super(message);
		System.out.println("Custom Error Message");
	}
	
	
}
