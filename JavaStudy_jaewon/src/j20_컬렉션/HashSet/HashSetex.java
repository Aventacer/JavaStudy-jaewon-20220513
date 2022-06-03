package j20_컬렉션.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetex {
	public static void main(String[] args) {
		// set - 순서 없고, 중복 안됨
		HashSet<String> name = new HashSet<String>();
		
		name.add("유재석");
		name.add("박명수");
		name.add("정준하");
		name.add("정형돈");
		name.add("길성준");
		name.add("노홍철");
		name.add("하동훈");
		
		System.out.println(name);
		
		// 값 가져오기
		// name.get(); 안됨(x)
		
		// iterator = 값 줄 세우기 stack
		Iterator<String> iterator = name.iterator();
		while(iterator.hasNext()) {						// hasNext(); -> 다음 값 있는가 ==> T or F
			//System.out.println(iterator.next());		// next(); -> 다음 값
			//특정값찾기
			String s = iterator.next();					// iterator.next() -> 방금 가지고 온 값
			if(s.equals("유재석")) {
				System.out.println(s);
			}
		}
		
		//삭제
		name.remove("길성준");
		System.out.println(name);
		
		//수정이 안되므로 삭제 후 삽입을 해야한다.
	}
}
