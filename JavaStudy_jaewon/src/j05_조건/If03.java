package j05_조건;

import java.util.Scanner;

public class If03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하시오 : ");
		
		int score = sc.nextInt();
		
		System.out.print("\n성적 결과 : ");
		
		if(score < 0 || score > 100) {				// 0 보다 작거나 100 보다 클 경우 에러
			System.out.println("계산 할 수 없는 점수입니다.");
		}else if(score > 89) {						// 90 ~ 100
			System.out.println("A");
		}else if(score > 79) {						// 80 ~ 89
			System.out.println("B");
		}else if(score > 69) {						// 70 ~ 79 
			System.out.println("C");
		}else if(score > 59) {						// 60 ~ 69
			System.out.println("D");
		}else {										// 0 ~ 59
			System.out.println("F");
		}
		
		// >= <= 는 가능한 사용자제
		
	}	

}
