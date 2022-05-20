package J06_반복;

public class For01 {

	public static void main(String[] args) {
		int num = 0;
		
		// for 쓰는 이유 = 규칙적인 반복
		/*
		 * for(int i = 0 ; i < 100 ; i++) { // for(선언 ; 조건 ; 조건변화수식)
		 * System.out.println(num += i + 1); }
		 */
		
		// while 쓰는 이유 = 자유로운 반복
		
		for(int i = 0; i < 10 ; i++) {
			System.out.println((i + 1) + "\t" +(10 - i));
		}
	}

}
