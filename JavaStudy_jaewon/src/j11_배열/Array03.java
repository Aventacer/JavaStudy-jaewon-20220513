package j11_배열;

import java.util.ArrayList;
import java.util.List;

public class Array03 {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8 };

//		for(int i = 0 ; i < numbers.length ; i++) {
//			System.out.print(numbers[i]);
//			System.out.print((i!=numbers.length-1)?", ":"");
//		}
		int lastIndex = numbers.length - 1;
		// foreach문
		for(int num : numbers) {	// numbers에서 인덱스 순차적으로 num에다가 넣어주는것
			System.out.print(num + ((num != numbers[lastIndex])?", ":""));
		}
		
		//List<Integer> listArray = new ArrayList<>();
	}
	

}
