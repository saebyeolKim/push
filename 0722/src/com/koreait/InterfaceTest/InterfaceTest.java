package com.koreait.InterfaceTest;

class Point {
	int x,y;
	void move() {}
}

class Shape {
//	final을 멤버 변수 선언시 앞에 붙여주면 그 변수는 프로그램에서 값을 변경할 수 없다. => 상수 => 일반적으로 대문자로 만들어 사용한다.
//	final을 메소드 선언시 앞에 붙여주면 그 메소드는 프로그램에서 Override 시켜서 사용할 수 없다.
//	final을 클래스 선언시 앞에 붙여주면 그 클래스는 프로그램에서 상속시켜 사용할 수 없다.
	public static final double PI = 3.141592;	// 정벅 멤버 변수, 상수
}

//	자바는 다중 상속을 지원하지 않기 때문에 아래와 같이 상속시키면 에러가 발생된다.
//class Line extends Point {}

//	interface는 class의 특별한 형태로 무조건 정적 멤버(public static) 변수(final)와 추상 메소드(public abstact)로만 구성된다.
interface Draw {
	public static final double PI = 3.141592;	// 정적 멤버 변수, 상수
//	인터페이스는 변수 선언시 앞의 내용을 생략하고 선언해도 컴파일러가 자동으로 public static final을 붙여준다.
	int Limit = 1000;
//	인터페이스는 무조건 추상 메소드만 포함될 수 있으므로 아래와 같이 일반 메소드를 선언하면 에러가 밸생된다.
//	public void rotate() { }		// 에러 발생
	public abstract void move1();	// 추상 메소드
//	인터페이스는 메소드 선언시 앞의 내용을 생략하고 추상 메소드를 선언해도 컴파일러가 자동으로 public abstract을 붙여준다.
	void erase();
}

interface Graphic {
	void rotate();
	void resize();
}
//	클래스는 인터페이스를 상속받을 수 없기 때문에 에러가 발생된다.
//class Lines extends Graphic { }		// 에러

//	인터페이스는 클래스를 상속받을 수 없기 때문에 에러가 발생된다.
//interface Graphics extends Point { }	// 에러

//	클래스는 클래스끼리 인터페이스는 인터페이스끼리 상속을 시켜야 한다.
//	클래스는 다중 상속을 허용하지 않지만 인터페이스는 다중 상속을 허용한다.
interface Graphics extends Draw, Graphic {
//	아무런 내용을 가지지 않는 인터페이스를 표시(Marker) 인터페이스라 부른다.
	
}

//	클래스에 클래스를 붙일 때는 extends 예약어를 사용해서 상속시키고 클래스에 인터페이스를 붙일때는 implements 예약어를 사용해
//	구현시킨다.
//	Line 클래스는 Point 클래스를 상속받고, Graphic 인터페이스를 구현받아 만든다.
class Line extends Point implements Draw, Graphic {

	@Override
	public void rotate() {
		
	}
	@Override
	public void resize() {
		
	}
	@Override
	public void move1() {
		
	}
	@Override
	public void erase() {
		
	}

	
}

public class InterfaceTest {

	public static void main(String[] args) {
		
		Shape shape = new Shape();
		System.out.println(shape.PI);
//		final변수(상수)의 값을 프로그램에서 변경하려 했으므로 에러가 발생된다.
//		shape.PI = 5.147453; 	// 에러 발생
//		static으로 선언된 변수나 메소드는 클래스의 객체를 생성하지 않고 클래스 이름에 "."을 찍어서 바로 접근할 수 있다.
		System.out.println("Shape.PI = " + Shape.PI);
		System.out.println("Math.PI = " + Math.PI);
//		Math.PI = 1.23456;		// 에러 발생
		
		System.out.println("Draw.PI = " + Draw.PI);
		System.out.println("Draw.Limit = " + Draw.Limit);
		
	}
}
