package j23_예외처리;

public class ThrowEx {

	public static void main(String[] args) {
		try {
			System.out.println("Program is running...");
			int i = 0;

			if (i == 0) {
				// throw new IndexOutOfBoundsException(); // 강제 예외 실행(발생)
				// throw new RuntimeException("예외 발생"); // 강제 예외 실행(발생)
				// throw new validationCustomException(); // 강제 커스텀 예외 실행(발생)
				throw new validationCustomException("예외 발생"); // 강제 커스텀 예외 실행(발생)
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally { // 무조건 실행. 예외 있든 없든
			System.out.println("무조건 실행");
		}

	}

}
