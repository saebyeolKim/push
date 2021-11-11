package com.koreait.collectionTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashMapTset {

	public static void main(String[] args) {

//		HashMap은 사전식으로 데이터를 저장한다. => key(K)에 value(V)를 할당하는 방식으로 저장된다.
//		key는 일반적으로 String타입으로 말고 value는 저장할 데이터 타입으로 만든다.
		HashMap<String, Integer> hmap = new HashMap<>();
		
//		put(key, value): key에 value를 저장한다.
		hmap.put("apple", 1000);
//		size() => TreeMap에 저장된 데이터의 개수를 얻어온다.
		System.out.println(hmap.size() + " : " + hmap);
		hmap.put("banana", 2000);
		System.out.println(hmap.size() + " : " + hmap);
		hmap.put("orange", 3000);
		System.out.println(hmap.size() + " : " + hmap);
		hmap.put("melon", 10000);
		System.out.println(hmap.size() + " : " + hmap);
		hmap.put("water melon", 5000);
		System.out.println(hmap.size() + " : " + hmap);
		
//		put() 메소드로 없는 key에 vaule를 할당하면 데이터가 추가되고 사용중인 key에 데이터를 할당하면 데이터가 수정된다.
		hmap.put("melon", 9999);
		System.out.println(hmap.size() + " : " + hmap);
		
//		get(key): HashMap에 저장된 데이터 중에서 key에 해당되는 value를 얻어온다.
		System.out.println(hmap.get("water melon"));
		
//		remove(key): HashMap에 저장된 데이터 중에서 key에 해당되는 데이터를 제거한다.
		hmap.remove("orange");
		System.out.println(hmap.size() + " : " + hmap);
		
//		ketSet(): HashMap에 저장된 데이터에서 key에 해당되는 부분만 Set 인터페이스 타입으로 얻어온다.
		System.out.println(hmap.keySet());
		ArrayList<String> keyList = new ArrayList<String>();
		ArrayList<Integer> valList = new ArrayList<>();
		for (String key : hmap.keySet()) {
			keyList.add(key);
			System.out.println("key: " + key + ", value: " + hmap.get(key));
		}
		System.out.println(keyList);
		System.out.println(valList);
		System.out.println("======================================");
		
		
		
//		clear(): HashMap에 저장된 모든 데이터를 제거한다.
		hmap.clear();
		System.out.println(hmap.size() + " : " + hmap);
		
		
		
	}

}
