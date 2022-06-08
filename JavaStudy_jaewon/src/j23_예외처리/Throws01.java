package j23_예외처리;

public class Throws01 {
	public void printArray(int[] arrays) throws Exception{	// throws Exception 호출되는 클래스?에게 강제로 예외처리 해야되게 미루는것
		for(int i = 0; i< arrays.length + 1 ; i++) {		//  -> 인터페이스에 메소드구현할때 거의 항상 해주는편
			System.out.println("index : " + i + " value : " + arrays[i]);
		}
	}
}
