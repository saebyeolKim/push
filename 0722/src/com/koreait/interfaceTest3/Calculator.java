package com.koreait.interfaceTest3;

public abstract class Calculator implements Calc {

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int sub(int num1, int num2) {
		return num1 - num2;
	}

//	@Override
//	public void description() {
//		System.out.println("Calc 인터페이스의 default 메소드를 Calculator 클래스에서 Override 함");
//	}
	
	

}
