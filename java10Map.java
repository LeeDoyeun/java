package human20221031;

import java.util.HashMap;
import java.util.Iterator;

public class java10Map {

	public static void main(String[] args) {
		// HashMap<String,Integer> = > key, value 형태로 데이터를 저장하는 컬렉션(자료구조)
		// <String,> => Key, 중복값 불가, key를 통해서 value를 얻어올 수 있다.
		// <,Integer> => value, 중복값 가능
		// key로 객체를 사용하려면 반드시 hashcode를 재정의 해야 한다.
		// hashmap은 데이터의 순서가 없는 컬렉션(자료구조)이다.
		HashMap<String,Integer> hashmap = new HashMap<String, Integer>();
		//데이터 입력
		hashmap.put("삼십", 30);
		hashmap.put("십", 10);
		hashmap.put("열", 10);
		hashmap.put("사십", 40);
		hashmap.put("이십", 20);
		
		//데이터 변경 두가지 방법 1. replace(key,value) 2. put(key, value)
		hashmap.replace("십", 100);
		hashmap.put("십", 1000);//키는 중복이 안되서 십 키위치의 값이 10에서  100으로 변경된다.
		
		//데이터 삭제
		hashmap.remove("십");
		
		for(String key : hashmap.keySet()) {
			System.out.println(key);
		}
		//데이터 검색
		for(String key : hashmap.keySet()) {
			System.out.println(String.format("key : %s value : %d",
					key, hashmap.get(key)));
		}
		
		System.out.println(hashmap.size());
		
		Iterator<String> keys = hashmap.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			System.out.println(String.format("key : %s value : %d",
					key,hashmap.get(key)));
		}
		

	}

}
