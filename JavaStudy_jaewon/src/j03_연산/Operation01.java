package j03_연산;

public class Operation01 {

	public static void main(String[] args) {
		int num = 10; 
		int num1 = 10, num2 = 10;
		
		num = num + 1;
		
		System.out.println(num);
		
		// ++변수 는 선증가 변수++ 는 후증가
		System.out.println("          num1++ = " + (num1++) + "  ++num2 = " + (++num2));		
		System.out.println("처리후 값 num1 = " + num1 + "  num2 = " + num2);

		System.out.println(--num);
		System.out.println(num--);
		
		
		
		
	}

}
