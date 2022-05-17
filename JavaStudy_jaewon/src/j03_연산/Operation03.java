package j03_연산;

public class Operation03 {

	public static void main(String[] args) {
		// 문제 1)
		// year = 1999
		// 년도가 4의 배수 이면 true 아니면 false
		
		int year = 1999;
		boolean result = (year % 4 == 0) ? true : false;
		//boolean result = year % 4 == 0;
		
		
		System.out.println("result = " + result);
		
		
		
		// 문제 2)
		// 윤년이면 T 아니면 F
		// 4의배수 이고 100의 배수아닐때 혹은 400의 배수일때
		
		int year1 = 2000;
		boolean result1 = ((year1 % 4 == 0) && !(year1 % 100 == 0)) || (year1 % 400 == 0);
		//boolean result1 = ((year1 % 4 == 0) && (year1 % 100 != 0)) || (year1 % 400 == 0);
		
		System.out.println("입력한 연도 = " + year1);
		System.out.println("윤년입니까? = " + result1);
		
		
		
		
	}

}




