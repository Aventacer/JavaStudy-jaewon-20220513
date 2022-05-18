package j05_조건;

public class SwitchCase {

	public static void main(String[] args) {
		int num = 2;
		char c = 'c';
		String str = "둘리";
		// break 가 없으면 해당 case 부터 끝까지 실행한다
		switch (num) { // (num)부분 즉 조건문에 수식도 입력 가능 ex) (num / 10)
			case 1: 
				System.out.println("case 1");
				break;
			case 2:
				System.out.println("case 2");
				break;
			case 3: 
				System.out.println("case 3");
				break;
			default:
				System.out.println("Unknown");
				break;
		}
		switch (c) {
			case 'a': 
				System.out.println("case a");
				break;
			case 'b': 
				System.out.println("case b");
				break;
			case 'c': 
				System.out.println("case c");
				break;
			default:
				System.out.println("Unknown");
				break;
		}
		switch (str) {
			case "홍길동":
				System.out.println("홍길동");
				break;
			case "둘리":
				System.out.println("둘리");
				break;
			case "짱구":
				System.out.println("짱구");
				break;
			default:
				System.out.println("Unknown");
				break;
		}
	}

}
