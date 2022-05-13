package j02_변수와_상수;

public class Casting {

	public static void main(String[] args) {
		// 업캐스팅 = 문자 -> 정수 -> 실수
		char a = 'A';
		System.out.println(a);
		int b = a;	// char a에서 int로 업캐스팅 형변환 (문자 -> 정수)
		// int C = 'A';
		// int d = 3.14; (x)
		System.out.println(b);
		// System.out.println(c);
		
		double c = b; // int b에서 double로 업캐스팅 형변환 (정수 -> 실수)
		System.out.println(c);
		
		System.out.println("\\\\\\\\\\\\\\\\\\\\\\");

		// 다운캐스팅 = 실수 -> 정수 -> 실수

		int d = (int)c; // double c에서 int로 다운캐스팅 형변환 (실수 -> 정수)
		System.out.println(d);

		char e = (char)d;	// int d에서 char로 다운캐스팅 형변환 (정수 -> 문자)
		System.out.println(e);
		
		

	}

}
