package com.koreait.interfaceTest3;

public class ComplateCalc extends Calculator{

	@Override
	public int mul(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int div(int num1, int num2) {
		if (num2 == 0) {
			return ERROR;
		} else {
			return num1 / num2;			
		}
	}

//	@Override
//	public void description() {
//		System.out.println("Calc 인터페이스의 default 메소드를 ComplateCalc클래스에서 Override 함");
//	}
	

}
