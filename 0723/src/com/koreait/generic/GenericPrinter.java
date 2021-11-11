package com.koreait.generic;

// 	Powder와 Pasic을 재료로 사용하는 3D프린터 => Generic 사용
// 	Generic => 자료형 변수로 데이터의 타입을 받는다. 
//	이 클래스를 사용하는 시점에 실제 사용할 자료형을 지정한다. static에는 사용할 수 없다.
//	E: element, K: key, V: value, 등 여러 알파벳을 의미에 따라 사용이 가능하다. 
public class GenericPrinter<E> {

	private E material;

	public E getMaterial() {
		return material;
	}

	public void setMaterial(E material) {
		this.material = material;
	}
	
}
