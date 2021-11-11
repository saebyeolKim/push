package com.koreair.inheritance;

//	부모(상위, 슈퍼, 기반) 클래스
public class Parent {
	
//	private String name;
//	private boolean gender;

//	protected 접근 권한은 현재 클래스와 현재 클래스를 상속받은 자식 클래스에서만 접근할 수 있다.
	protected String name;
	protected boolean gender;
	
	public Parent() {
//		name = "무명씨";
//		gender = false;
//		현재 클래스의 다른 생성자인 Parent(String name, boolean gender)를 호출해서 초기화시킨다.
		this("무명씨", false);
		System.out.println("부모 클래스의 기본 생성자가 실행됩니다.");
	}

	public Parent(String name, boolean gender) {
		this.name = name;
		this.gender = gender;
		System.out.println("부모 클래스의 초기화 기능이 있는 기본 생성자가 실행됩니다.");
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}


//	홍길동(남)
	@Override
	public String toString() {
//		조건식 ? 조건이 참일 때 실행할 문장 : 조건이 거짓일 때 실행할 문장
		return name + "(" + (gender ? "남" : "여") + ")";
	}
	
}






