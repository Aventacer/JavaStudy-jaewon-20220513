package j05_조건;

import java.util.Scanner;

public class If04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("좌표입력 : ");
		int n1 = sc.nextInt(), n2 = sc.nextInt();

		/*
		 * (n1 < -1000 || n1 > 1000) || (n2 < -1000 || n2 > 1000) || n1 == 0 || n2 == 0
		 * && (n1 != 0 || n2 != 0) 조건문 갯수 많은것보다 연산(즉 조건문안의 조건문)이 많은게 더 낫다 %시간 줄이기
		 */

		if (((n1 < -1000 || n1 > 1000) || (n2 < -1000 || n2 > 1000))) {
			System.out.println("계산 불가");
		} else if (n1 == 0 && n2 == 0) { // ( 0, 0) 일때
			System.out.println("원점");
		} else if (n1 == 0 || n2 == 0) { // ( x, 0), ( 0, y) 일때
			System.out.println("계산은 되나 예외로 함");
		} else if (n1 > 0 && n2 > 0) { // 1 ( x, y)
			System.out.println("제 1 사분면입니다.");
		} else if (n1 < 0 && n2 > 0) { // 2 (-x, y)
			System.out.println("제 2 사분면입니다.");
		} else if (n1 < 0 && n2 < 0) { // 3 (-x,-y)
			System.out.println("제 3 사분면입니다.");
		} else { // 4 ( x,-y)
			System.out.println("제 4 사분면입니다.");
		}
		System.out.println();

		// 강사답안 + 삼항 연산자
		String result = (n1 < -1000 || n1 > 1000) || (n2 < -1000 || n2 > 1000) || n1 == 0 || n2 == 0 
				&& (n1 != 0 || n2 != 0) ? "계산불가"
						: n1 > 0 && n2 > 0 ? "제 1사분면"
								: n1 < 0 && n2 > 0 ? "제 2사분면"
										: n1 < 0 && n2 < 0 ? "제 3사분면" 
												: n1 > 0 && n2 < 0 ? "제 4사분면" : "원점";
		System.out.println(result);								

	}

}
