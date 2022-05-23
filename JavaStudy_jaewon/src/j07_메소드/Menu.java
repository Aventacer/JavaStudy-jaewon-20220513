package j07_메소드;

import java.util.Scanner;
// ㅗ
public class Menu {
	
	public static void sleepAndContinue() {
		Scanner sc = new Scanner(System.in);
		System.out.println("계속하려면 아무키나 입력하라");
		sc.nextLine();
	}

	public static char inputselect() {
		Scanner sc = new Scanner(System.in);
		char select = 0;
		System.out.print("명령을 입력하시오 : ");
		select = sc.next().charAt(0);
		sc.nextLine();
		return select;
	}

	
	public static boolean menu2() {
		System.out.println("\njava를 선택함\n");
		while (true) {
			char select;

			System.out.println("[ java 메뉴 ]");
			System.out.println("1. java란?");
			System.out.println("b. 뒤로가기");
			System.out.println("q. 프로그램 종료");

			System.out.print("명령을 입력하시오 : ");
			select = inputselect();
			System.out.println();
			if (select == 'b') {
				break;
			} else if (select == 'q') {
				return true;
			} else if (select == '1') {
				System.out.println("java란 ... 입니다");
				sleepAndContinue();
			} else {
				System.out.println("해당 명령은 보기에 없습니다. \n다시 입력하시오. ");
			}
		}
		return false;
	}
	 
	public static boolean menu() {
		
		while(true) {
			
			char select = 0;
			
			while(true) {
				System.out.println("[ java 메뉴 ]");
				System.out.println("1. java란?");
				System.out.println("b. 뒤로가기");
				System.out.println("q. 프로그램 종료");
				
				select = inputselect();
				
				System.out.println();
				if(select == 'b') {
					break;
				}else if(select == 'q'){
					return true;
				}else if(select == '1'){
					System.out.println("java란 ... 입니다");
					sleepAndContinue();
				}else { 
					System.out.println("해당 명령은 보기에 없습니다. \n다시 입력하시오. ");
					sleepAndContinue();
				}
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = 0, j = 0;
		
		boolean loopFlag = true;
		
		System.out.println("프로그램 시작");
		
		// charAt(i)	이때 i는 입력되는 문자열의 번지 i == 3 이면 ex)"ABCDE" 입력 받는건 'D' 다
		/* while(true) {
			char select = 0;
			System.out.print("명령을 입력하세요 : ");
			select = sc.next().charAt(0);			// 만약 "A B C"라고 입력된 경우 차례로 자동 입력된다
			System.out.println("" + select);		// 순서대로 버퍼에 저장되기 때문이다
			sc.nextLine();				// 버퍼에 있는것을 모두 날린다
			if(select == 'q') {			// nextLine을 제외한 모든것들은 nextLine을 이용해 버퍼를 날린다
				break;
			}else {
				System.out.println("\t\tWrong!");
			}
		}
		*/
		
		while(loopFlag) {
			char select = 0;
			
			System.out.println("[메뉴 선택]");
			System.out.println("1. java");
			System.out.println("2. python");
			System.out.println("3. javascript");
			System.out.println("q. 프로그램 종료");
			
			System.out.print("명령을 입력하시오 : ");
			select = sc.next().charAt(0);
			sc.nextLine();
			
			if(select == 'q') {
				break;
			}else if(select == '1') {
				menu2();
			}else if(select == '2') {
				menu2();
			}else if(select == '3') {
				menu2();
			}else { 
				System.out.println("해당 명령은 보기에 없습니다. \n다시 입력하시오. ");
				sleepAndContinue();
			}
			//System.out.println();
		}
		
		
		System.out.println("프로그램 종료");
	}

	// public static boolean checkFlag ( )

}
