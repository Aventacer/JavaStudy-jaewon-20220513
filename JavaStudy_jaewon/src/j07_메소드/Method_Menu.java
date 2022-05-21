package j07_메소드;

import java.util.Scanner;

public class Method_Menu {
	
	public static void main(String[] args) {
		
		boolean loopFlag = true;
		
		System.out.println("프로그램 시작");
		while(loopFlag) {
			char select = 0;
			
			select_Menu();
			select = inp_select(select);
		 
			if(select == 'q') {
				break;
			}else if(select == '1') {
				loopFlag = inside_menu(loopFlag, select);
			}else if(select == '2') {
				loopFlag = inside_menu(loopFlag, select);
			}else if(select == '3') {
				loopFlag = inside_menu(loopFlag, select);
			}else { 
				System.out.println("해당 명령은 보기에 없습니다. \n다시 입력하시오. ");
			}
			//System.out.println();
		}
		System.out.println("프로그램 종료");
	}
	
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
	public static boolean inside_menu(boolean loopFlag, char select) {
		Scanner sc = new Scanner(System.in);
		
		String 	s1 = "java",	
				s2 = "python",
				s3 = "javaScript",
				menu = null;
				
		menu = select == '1' ? s1 
				: select == '2' ? s2 
						:select == '3' ? s3 : null;
		
		System.out.println("\n" + menu + " 를 선택함\n");
		while(true) {
			System.out.println("[ " + menu + " 메뉴 ]");
			System.out.println("1. " + menu + " 란?");
			System.out.println("b. 뒤로가기");
			System.out.println("q. 프로그램 종료");
			
			select = inp_select(select);
			System.out.println();
			if(select == 'b') {
				break;
			}else if(select == 'q'){
				loopFlag = false;
				return loopFlag;
			}else if(select == '1'){
				System.out.println(menu + "란 ... 입니다");
				System.out.println("계속하려면 아무키나 입력하라");
				sc.nextLine();
			}else { 
				System.out.println("해당 명령은 보기에 없습니다. \n다시 입력하시오. ");
			}
		}
		
		return loopFlag;
	}
	
}