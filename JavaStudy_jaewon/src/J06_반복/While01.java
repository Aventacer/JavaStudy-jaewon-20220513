package J06_반복;

public class While01 {

	public static void main(String[] args) {
		int result = 0, i = 0;
		
		while(i<100) {
			System.out.println(result += ++i);
		}
		
		/*
		 * for(i=1;i<=100;i++) result += i;
		 * 
		 * System.out.println(result);
		 */
	}

}
