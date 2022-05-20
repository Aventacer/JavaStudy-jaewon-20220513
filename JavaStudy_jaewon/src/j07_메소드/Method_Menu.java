package j07_메소드;

import java.util.Scanner;

public class Method_Menu {
	
	public static void select_Menu () {
		System.out.println("[메뉴 선택]");
		System.out.println("1. java");
		System.out.println("2. python");
		System.out.println("3. javascript");
		System.out.println("q. 프로그램 종료");
	}
	
	public static char inp_select(char select) {
		Scanner sc = new Scanner(System.in);
		System.out.print("명령을 입력하시오 : ");
		select = sc.next().charAt(0);
		sc.nextLine();
		return select;
	}

	public static void main(String[] args) {
		int i = 0, j = 0;
		
		boolean loopFlag = true;
		
		System.out.println("프로그램 시작");
		while(loopFlag) {
			char select = 0;
			
			select_Menu();
			inp_select(select);
			
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