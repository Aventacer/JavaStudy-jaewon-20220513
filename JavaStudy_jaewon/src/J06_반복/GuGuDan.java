package J06_반복;

public class GuGuDan {

	public static void main(String[] args) {
		for(int i = 0 ; i < 8 ; i++) {
			System.out.println(( i + 2 ) + "단");		
			for(int j = 0 ; j < 9 ; j++) {
				System.out.println((i+2) + " x " + (j+1) + " = " + ((i+2)*(j+1)));
			}
			System.out.println();
		}
	}

}
