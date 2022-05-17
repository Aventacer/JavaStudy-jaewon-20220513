package j03_연산;

/*
 * 논리연산자
 * 
 * AND ==  &&	-곱			둘다 참일때만 결과값이 참									T && T = T, T && F = F, F && F = F
 * OR == ||		-합			둘 중 하나만이라도 참일때 혹은 둘다 참일때 결과값이 참		T || T = T, T || F = T, F || F = F
 * NOT == !		-부정		참을 거짓, 거짓을 참으로									A = T 일때, !A = F
 * NOR == ^		-베타적논리합	A와 B가 있을떄 둘다 T거나 F일땐 F, 두 값이 다를때는 T
 * 
 * 
 * 0(false)
 * !0(true)
 * 
 * 
 * 
 * */

public class Operation02 {

	public static void main(String[] args) {
		int num = 10;
		
		boolean result1 = num > 5;
		boolean result2 = num == 10;

		System.out.println("result1 : " + result1 + "\n" + "result2 : " + result2 + "\n");
		
		System.out.println("AND ==>\t result1 AND result2 : " + (result1&&result2));
		System.out.println("OR ==>\t result1 OR result2 : " + (result1||result2));
		System.out.println("NOT ==>\t");
	}

}
