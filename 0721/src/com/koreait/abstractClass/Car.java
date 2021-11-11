package com.koreait.abstractClass;

public abstract class Car {

//	자식클래스에서 다르게 구현되어야 하는 부분은 추상 클래스에서 추상 메소드로 선언한다.
	public abstract void drive();
	public abstract void stop();
	
//	자식 클래스에서 공통적으로 실행될 부분은 추상 클래스에서 일반 메소드로 선언한다.
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
//	템플릿 메소드
//	추상 메소드나 구현된 메소드를 활용해서 코드의 흐름(시나리오)을 정의하는 메소드
//	final로 선언해서 자식 클래스에서 Override 할 수 없게 만든다.
//	프레임워크에서 많이 사용하느 설계 패턴이다.
//	추상클래스로 선언된 부모 클래스에서 템플릿 메소드를 활용해서 전체적인 흐름을 정의하고 자식 클래스에서 다르게
//	구현되어야 하는 부분은 추상 메소드로 선언해서 자식 클래스에서 Override해서 구현하도록 한다.
	
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
	
}






