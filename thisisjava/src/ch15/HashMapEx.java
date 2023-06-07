package ch15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		
		//Map 객체 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
		//< > <- 원래 object가 들어가는 자리기때문에 int 안 되고 Integer만 가능함

		//객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95); //키가 같기때문에 제일 마지막에 저장한 값만 저장

		System.out.println("총 entry 수: " + map.size());
		System.out.println();

		String key = "홍길동";
		int value = map.get(key);
		System.out.println(key + ":" + value);
		System.out.println();

		//키 Set 컬렉션을 얻고, 반복해서 키랑 값 얻기
		Set<String> keySet = map.keySet(); //set 타입에 string 객체들이 담김
		Iterator<String> keyIterator = keySet.iterator(); //iterator 반복시켜주는 녀석

		while (keyIterator.hasNext()) {
			String k = keyIterator.next();
			Integer v = map.get(k);
			System.out.println(k + ":" + v);
		}
		System.out.println();

		//key와 value로 되어있는 Entry가 set로 되어있는,,,,
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();

		while (entryIterator.hasNext()) {
			Entry<String, Integer> entry = entryIterator.next();

			System.out.println();

			map.remove("홍길동");
			System.out.println("총 entry 수" + map.size());
			System.out.println();

		}
	}

}
