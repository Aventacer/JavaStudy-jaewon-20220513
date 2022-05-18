package j05_조건;

public class If02 {

	public static void main(String[] args) {
		int score = 85;
		
		if(score == 100) {
			System.out.println("만점임");
		}else if(score > 89) {
			System.out.println("90점 이상임");
		}else if(score > 79) {
			System.out.println("80점 이상임");
		}else {
			System.out.println("...");
		}
		
		int num = 1;
		boolean test = true;
		
		if(num>0?true:false) System.out.println("양수");
		else System.out.println("0 또는 음수");
	}
	
	

}
