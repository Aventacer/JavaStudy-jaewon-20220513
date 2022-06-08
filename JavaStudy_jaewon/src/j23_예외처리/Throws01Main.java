package j23_예외처리;

public class Throws01Main {
	
	public void test() throws Exception	{
		Throws01 throws01 = new Throws01();
		
		try {
			throws01.printArray(new int[] {1,2,3,4,5,6,7,8,9});
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public static void main(String[] args)  {
		Throws01Main main = new Throws01Main();
		try {
			main.test();
		} catch (Exception e) {
			e.printStackTrace();// 에러난 경로 보여줌 주로 이걸씀
		}
		
		
		System.out.println("프로그램 종료");
	}
}
