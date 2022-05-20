package J06_반복;

public class While02 {

	public static void main(String[] args) {
		int num = 0, dan = 2;
		
		System.out.println(dan + "단 구구단\n");
		while(num<9) {
			System.out.println(dan + " x " + (num + 1) + " = " + (dan * (num + 1)));	
			num++;
		}
		
	}

}
