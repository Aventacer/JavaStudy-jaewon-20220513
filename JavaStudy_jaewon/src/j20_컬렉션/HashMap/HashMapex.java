package j20_컬렉션.HashMap;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapex {
	public static void main(String[] args) {
		HashMap<Integer, String> studentMap = new HashMap<Integer, String>();
		// map = <key, value>
		// 값 추가		-	키값(인덱스)는 중복 불가, Value(값)는 중복허용
		studentMap.put(0, "김준일");
		studentMap.put(1, "김준이");
		studentMap.put(2, "김준삼");
		studentMap.put(3, "김준사");
		studentMap.put(4, "김준오");
		
		// System.out.println(studentMap);
		
		// 키값으로 값 호출 map.get(key)
		System.out.println(studentMap.get(0));
		
		// 값 수정
		// studentMap.put(1, "김준육");	//	값이 없을땐 추가해버린다
		studentMap.replace(1, "김준육");	// 값이 없을땐 수정(추가)을 하지 않는다
		
		// 값 제거 - 값 제거 후 들어있던 value 값을 리턴한다.
		studentMap.remove(2);
		
		// map 순회
		
		Iterator<Integer> iterator = studentMap.keySet().iterator();
		while(iterator.hasNext()) {
			Integer key = iterator.next();
			String value = studentMap.get(key);
			if(value.equals("김준오")) {
			}	
			System.out.println(studentMap.get(key));
		}
		// lambda 람다식(함수형 프로그래밍)
		studentMap.forEach((k, v) -> {
			System.out.println("key : " + k);
			System.out.println("value : " + v);
		});
		
		
		// 값이 있는지 확인. 있으면 t 없으면 f
		studentMap.getOrDefault(0, "김준일");
		
		// 키값(인덱스)으로 Value(값) 확인
		System.out.println(studentMap.containsKey(0));
		
		// Value(값)으로 키값(인덱스) 확인
		System.out.println(studentMap.containsValue("김준태"));
		
		
		
	}
}
