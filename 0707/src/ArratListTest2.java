import java.util.ArrayList;

public class ArratListTest2 {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<>();
//		add(value): ArrayList의 맨 뒤에 value를 추가한다.
		arrayList.add("홍길동");
//		size(): ArrayList에 저장된 데이터의 개수를 얻어온다.
		System.out.println("ArrayList에 저장된 데이터의 개수 => " + arrayList.size() + ": " + arrayList);
		arrayList.add("임꺽정");
		System.out.println("ArrayList에 저장된 데이터의 개수 => " + arrayList.size() + ": " + arrayList);
		arrayList.add("장길산");
		System.out.println("ArrayList에 저장된 데이터의 개수 => " + arrayList.size() + ": " + arrayList);
		arrayList.add("일지매");
		System.out.println("ArrayList에 저장된 데이터의 개수 => " + arrayList.size() + ": " + arrayList);
		arrayList.add("홍길동");
		System.out.println("ArrayList에 저장된 데이터의 개수 => " + arrayList.size() + ": " + arrayList);
		
//		add(index, value): ArrayList의 index번째 위치에 value를 삽입한다.
		arrayList.add(1, "손오공");
		System.out.println("ArrayList에 저장된 데이터의 개수 => " + arrayList.size() + ": " + arrayList);
		
//		set(index, value): ArrayList의 index번째 위치의 데이터를 value로 수정한다.
		arrayList.set(1, "저팔계");
		System.out.println("ArrayList에 저장된 데이터의 개수 => " + arrayList.size() + ": " + arrayList);
		
		for (int i = 0; i < arrayList.size(); i++) {
//			get(index): ArrayList의 index번째 위치의 value를 얻어온다.
			System.out.println("arrayList.get(" + i +") = " + arrayList.get(i));
		}
		
		for (String str : arrayList) {
			System.out.println(str);
		}
		
//		remove(index): ArrayList의 index번째 위치의 value를 제거한다.
		arrayList.remove(1);
		System.out.println("ArrayList에 저장된 데이터의 개수 => " + arrayList.size() + ": " + arrayList);
	
//		remove(object): ArrayList의 object를 제거한다.
		arrayList.remove("홍길동");
		System.out.println("ArrayList에 저장된 데이터의 개수 => " + arrayList.size() + ": " + arrayList);
	
//		clear(): ArrayList에 저장된 모든 데이터를 제거한다.
		arrayList.clear();
		System.out.println("ArrayList에 저장된 데이터의 개수 => " + arrayList.size() + ": " + arrayList);
		
	
	
	}

}
