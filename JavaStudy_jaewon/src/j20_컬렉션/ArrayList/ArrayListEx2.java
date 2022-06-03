package j20_컬렉션.ArrayList;

import java.util.ArrayList;

public class ArrayListEx2 {
	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<String>();
		ArrayList<String> nameList2 = new ArrayList<String>();
		//ArrayList<String> nameList2 = nameList;		// 얕은 복사 (주소 복사)
		
		// List 값 추가 -> .add(___);
		nameList.add("유재석");
		nameList.add("박명수");
		nameList.add("정준하");
		nameList.add("정형돈");
		nameList.add("길성준");
		nameList.add("노홍철");
		nameList.add("하동훈");

		// list 중간에 (인덱스로) 값 삽입 -> .add(index, ___);
		nameList.add(4, "황광휘");
		
		// list의 해당 인덱스 값 수정 -> .set(index, ___);
		nameList.set(5, "길");
		
		// list에서 index로 값 삭제 -> .remove(index);
		nameList.remove(2);
		
		// list에서 값으로 값 삭제 -> .remove(___);
		nameList.remove("하동훈");
		
		// list to list 값 옮기기(깊은 복사) (값 복사)
		nameList2.addAll(nameList);
		
		// list에서 index로 값 가져오기 -> .get(index);
		nameList.get(0);
		
		// list에서 원하는 값 찾기 -> .contains(___);
		System.out.println(nameList.contains("전진"));
		System.out.println(nameList.contains("노홍철"));
		
		// list 내에 값이 하나라도 있으면 비우기 -> .clear();   ,  isEmpty() = 값이 있는지 체크. -> 비었다 = true
		if(!nameList.isEmpty()) {
			nameList.clear();			
		}
		
		// list 모든 값 확인 -> .toString() <-생략되어져있음
		System.out.println(nameList);
		System.out.println(nameList2);
		
		// list를 배열로 변환
		Object[] obj = nameList2.toArray();
		for(Object ob:obj) {
			System.out.println((String) ob);
		
		
		
		}
	}
}
