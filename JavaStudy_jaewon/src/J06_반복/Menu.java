package J06_반복;

import java.util.Scanner;

public class Menu {

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
				System.out.println("\njava를 선택함\n");
				while(true) {
					System.out.println("[ java 메뉴 ]");
					System.out.println("1. java란?");
					System.out.println("b. 뒤로가기");
					System.out.println("q. 프로그램 종료");
					
					System.out.print("명령을 입력하시오 : ");
					select = sc.next().charAt(0);
					sc.nextLine();
					System.out.println();
					if(select == 'b') {
						break;
					}else if(select == 'q'){
						loopFlag = false;
						break;
					}else if(select == '1'){
						System.out.println("java란 ... 입니다");
						System.out.println("계속하려면 아무키나 입력하라");
						sc.nextLine();
					}else { 
						System.out.println("해당 명령은 보기에 없습니다. \n다시 입력하시오. ");
					}
				}
			}else if(select == '2') {
				System.out.println("\npython를 선택함\n");
				while(true) {
					System.out.println("[ python 메뉴 ]");
					System.out.println("1. python이란?");
					System.out.println("b. 뒤로가기");
					
					System.out.print("명령을 입력하시오 : ");
					select = sc.next().charAt(0);
					sc.nextLine();
					System.out.println();
					if(select == 'b') {
						break;
					}else if(select == '1'){
						System.out.println("python이란 ... 입니다");
						System.out.println("계속하려면 아무키나 입력하라");
						sc.nextLine();
					}else { 
						System.out.println("해당 명령은 보기에 없습니다. \n다시 입력하시오. ");
					}
				}
			}else if(select == '3') {
				System.out.println("\njavaScript를 선택함\n");
				while(true) {
					System.out.println("[ javaScript 메뉴 ]");
					System.out.println("1. javaScript란?");
					System.out.println("b. 뒤로가기");
					
					System.out.print("명령을 입력하시오 : ");
					select = sc.next().charAt(0);
					sc.nextLine();
					System.out.println();
					if(select == 'b') {
						break;
					}else if(select == '1'){
						System.out.println("javaScript란 ... 입니다");
						System.out.println("계속하려면 아무키나 입력하라");
						sc.nextLine();
					}else { 
						System.out.println("해당 명령은 보기에 없습니다. \n다시 입력하시오. ");
					}
				}
			}else { 
				System.out.println("해당 명령은 보기에 없습니다. \n다시 입력하시오. ");
			}
			//System.out.println();
		}
		
		
		System.out.println("프로그램 종료");
	}
	
	//public static boolean checkFlag ( )

}
