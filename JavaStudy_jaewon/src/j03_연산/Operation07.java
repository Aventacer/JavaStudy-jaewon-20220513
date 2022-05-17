package j03_연산;

public class Operation07 {

	public static void main(String[] args) {
		// 문제 2)
		// 윤년이면 T 아니면 F
		// 4의배수 이고 100의 배수아닐때 혹은 400의 배수일때
		// 참이면 윤년 , 거짓이면 윤년아님 출력
		int year = 1999;
		String result = null;
		
		result = (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) ? "윤년" : "윤년아님";
		
		System.out.println("결과 : " + result);
		
		String clone = "d  \"  d";
		
		System.out.println(clone);
	}

}
