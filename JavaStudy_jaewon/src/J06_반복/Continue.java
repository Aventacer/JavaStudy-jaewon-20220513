package J06_반복;

public class Continue {

	public static void main(String[] args) {
		int count = 0;
		for(int i = 0 ; i < 10; i++) {
			System.out.println(i);
			if (i == 6) {
				continue;
			}
			System.out.println("\t *\t" + (count++));
			
		}
		
		System.out.println();
		for(int i = 0 ; i < 10 ; i++) {
			if( i % 2 == 0) continue;
			System.out.println(i);
		}
	}

}
