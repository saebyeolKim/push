package com.koreait.collectionTest;

import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetTest2 {

	public static void main(String[] args) {

		TreeSet<String> tset = new TreeSet<String>();
		tset.add("홍길동");
		System.out.println(tset.size() + " : " + tset);
		tset.add("임꺽정");
		System.out.println(tset.size() + " : " + tset);
		tset.add("장길산");
		System.out.println(tset.size() + " : " + tset);
		tset.add("일지매");
		System.out.println(tset.size() + " : " + tset);
		tset.add("홍길동");
		System.out.println(tset.size() + " : " + tset);
		
//		Iterator 인터페이스 TreeSet이나 TreeSet과 같이 입력하는 순서와 저장되는 순서가 달라서 get(), set() 메소드를 사용할 수 없는
//		객체를 Iterator() 메소드를 사용해서 분리한다.
		Iterator<String> iterator = tset.iterator();
		
//		hasNext(): Iterator 인터페이스 객체에서 다음에 읽을 데이터가 있으면 ture, 없으면 false를 리턴한다.
		while(iterator.hasNext()) {
//			next(): Iterator 인터페이스 객체에서 다음 데이터를 얻어온다.
			System.out.println(iterator.next());
		}
		
//		향상된 for문을 사용해서 TreeSet이나 TreeSet 객체의 데이터를 한 개씩 얻어올 수 있다.
		for (String str : tset) {
			System.out.println(str);
		}
		
		tset.remove("장길산");
		System.out.println(tset.size() + " : " + tset);
		tset.clear();
		System.out.println(tset.size() + " : " + tset);
		
		
		
	}

}
