package j03_연산;

public class Operation06 {

	public static void main(String[] args) {
		int num = 80;
		
		System.out.println(num%4==0?"4의배수":"4의배수가 아님");
		String result = num%4==0?"4의배수":"4의배수가 아님";
		boolean result1 = num%4==0?true:false;
		int res01 = num%4==0?1:0;
		
		System.out.println(result + result1 + res01);
		// ctrl + alt + up || down 한줄복사 단축키
		// 단축키 보기 ctrl + shift + l
		
		
	}

}
