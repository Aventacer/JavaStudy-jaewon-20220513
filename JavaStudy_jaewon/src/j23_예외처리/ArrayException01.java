package j23_예외처리;

/*
 * 프로그램의 오류
 * 1. 예외 RunTimeException(프로그램이 실행 중)
 * 2. 컴파일 에러(프로그램이 실행 전 컴파일 과정에서 오류)
 * -> ex) 드라이버 (다른 라이브러리나 다른 프로그램과 연동과정중) IOException
 * 3. 버그 (오작동)
 * throw
 * throws
*/

public class ArrayException01 {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5,6,7,8,9};
	
		try { // 오류가 날 수 있는 부분을 try
			for(int i = 0 ; i < arr1.length +1; i++) {
				System.out.println("index : " + i + " value : " + arr1[i]);
				
			}			
		}catch (ArrayIndexOutOfBoundsException errorCode) {	// 오류 발생시 
			System.out.println(errorCode);
			System.out.println("Array 예외가 발생하였음");
		}catch (StringIndexOutOfBoundsException errorCode) {	// 오류 발생시 
			System.out.println(errorCode);
			System.out.println("String 예외가 발생하였음");
		}catch (Exception errorCode) {
			System.out.println(errorCode);
		}
		
		System.out.println("지금까지 진행한 작업을 저장합니다.");
		System.out.println("프로그램이 정상적으로 종료되었습니다.");
	}
}
