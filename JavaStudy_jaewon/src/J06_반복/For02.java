package J06_반복;

public class For02 {

	public static void main(String[] args) {
		/*
		 * * ** *** **** *****
		 * 
		 * ***** **** *** ** *
		 * 
		 * 출력
		 */
		int count = 0;

		for (int i = 0; i < 5; i++) { 			// 0 ~ 4
			for (int j = 0; j < i + 1; j++) {			// 0, 1, 2, 3, 4
				System.out.print("*");
			}
			System.out.println();
		}
		// 역
		for (int i = 0; i < 5; i++) { 			// 0 ~ 4
			for (int j = 0; j < 5 - i; j++) {			// 4, 3, 2, 1, 0
				System.out.print("*");
			}
			System.out.println();
		}
		// 반대쪽
		for (int i = 0; i < 5; i++) { 			// 0 ~ 4
			for (int j = 0; j < 5 - i; j++) {			// 4, 3, 2, 1, 0
				System.out.print(" ");
			}
			for (int k = 0; k < i + 1; k++) {			// 0, 1, 2, 3, 4
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < 5; i++) { 			// 0 ~ 4
			for (int j = 0; j < i + 1; j++) {			// 0, 1, 2, 3, 4	
				System.out.print(" ");
			}
			for (int k = 0; k < 5 - i; k++) {			// 4, 3, 2, 1, 0
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		// 피라미드
		for (int i = 0; i < 5; i++) { 			// 0 ~ 4
			for (int j = 0; j < 5 - i; j++) { 				// 4, 3, 2, 1, 0
				System.out.print(" ");
			}
			for (int k = 0; k < (i * 2) + 1; k++) { 		// 1, 3, 5, 7, 9
				System.out.print("*");
				count++;
			}
			// System.out.println("\t\t count = " + count);
			System.out.println();
			count = 0;
		}

		// 역 피라미드
		for (int i = 0; i < 5; i++) { 			// 0 ~ 4
			for (int j = 0; j < i + 1; j++) { 				// 0, 1, 2, 3, 4
				System.out.print(" ");
			}
			for (int k = 0; k < (10 - (i * 2)) - 1; k++) { 	// 9, 7, 5, 3, 1
				System.out.print("*");
				count++;
			}
			// System.out.println("\t\t count = " + count);
			System.out.println();
			count = 0;
		}

	}

}
