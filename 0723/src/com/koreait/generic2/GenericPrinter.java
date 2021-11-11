package com.koreait.generic2;

//	<T extends 클래스>
//	T 자료형의 범위를 제한할 수 있고 상위 클래스에서 선언한거나 정의하는 메소드를 사용할 수 있다.
//	상속을 받지 않는 경우 T는 Object로 변환되어 Object 클래스가 기본으로 제공하는 메소드만 사용할 수 있다.

//	GenericPrinter 클래스에 Material 클래스를 상속 받아 구현하면 T에 무작위 클래스가 들어갈 수 없게 한다.
//	Material 클래스를 상속받은 클래스만 제네릭으로 GenericPrinter 클래스에 자료형을 넘겨줄 수 있다.
public class GenericPrinter<T extends Material> {

	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	

}

