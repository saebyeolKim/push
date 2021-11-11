package com.koreait.abstractClass;

class Base {
	
	String name;
	void say() {
		System.out.println(name + "님 안녕하세요.");
	}
}

class Sub extends Base {
	int age;

	@Override
	void say() {
		System.out.println(name + "님은 " + age + "살 입니다.");
	}
	
}

public class UpDownCasting {

	public static void main(String[] args) {

//		부모 클래스 타입으로 부모 클래스 타입의 객체를 만들어 사용하면 아무런 문제 없이 처리된다.
		Base base = new Base();
		base.name = "홍길동";
		base.say();
//		자식 클래스 타입으로 부모 클래스 타입의 객체를 만들어 사용하면 아무런 문제 없이 처리된다.
		Sub sub = new Sub();
		sub.name = "임꺽정";
		sub.age = 35;
		sub.say();
		
//		결론 => 부모가 자식을 제어할 수 있지만 자식이 부모를 제어할 수 없다.
//		부모 클래스 타입에 자식 클래스 타입의 객체가 생성된 주소를 대입했으므로 정상적으로 처리된다.
//		Base b = new Sub(); 	//정상 실행
//		자식 클래스 타입에 부모 클래스 타입의 객체가 생성된 주소를 대입했으므로 에러가 발생된다.
//		Sub s = new Base();		//에러 발생
		
//		부모 클래스 타입에 자식 클래스 타입의 객체가 생성된 주소를 대입한다. => upcasting
		Base b = sub;
//		b는 부모 클래스 타입의 객체지만 자식 클래스 타입의 객체가 생성된 주소를 대입했으므로 say() 메소드를 실행하면 
//		부모 클래스의 say() 메소드가 아닌 자식 클래스의 say()메소드가 실행된다.
//		c++은 virtual 예약어를 사용해 동적 바인딩을 지시하지 않으면 부모 클래스의 함수가 실행되므로 부모 클래스의 함수를 가상 함수로
//		선언하고 컴파일 단계에서 실행할 함수의 주소가 결정되는 정적 바인딩이 아닌 실행 단계에서 실행할 함수의 주소가 결정되는
//		동적 바인딩을 하도록 만들어야 한다.
		b.say();
		System.out.println("====================");

//		자식 클래스 타입의 객체에 부모 클래스 타입의 객체가 생성된 주소를 대입한다.
//		Sub s = base;			// 에러 발생
//		자식 클래스 타입에 부모 클래스 타입의 객체가 생성된 주소를 대입하면 에러가 발생되는데 이 떄 casting 시켜서 대입하면 대입은
//		가능하다. 이 경우 문법적인 오류는 발생되지 않지만 프로그램 실행 단계에서 ClassCaseException이 발생된다.
//		Sub s = (Sub) base;		// casting 시키면 문법적인 에러는 발생되지 않는다. (강제 형변환)
		
//		instanceof 연산자는 객체가 instanceof 뒤에 지정된 클래스 타입으로 안전하게 형변환이 가능한지 검사한다.
//		형식 => 객체이름 instanceof 클래스이름
		
		if (sub instanceof Base) {
			Base base2 = sub;
			base2.say();
		} else {
			System.out.println("Sub 클래스 타입의 객체는 Base 클래스 타입으로 형변환 시킬 수 없습니다.");
		}
		
		if (base instanceof Sub) {
			Sub sub2 = (Sub) base;
			sub2.say();
		} else {
			System.out.println("Base 클래스 타입의 객체는 Sub 클래스 타입으로 형변환 시킬 수 없습니다.");			
		}
		
		try {
			Sub sub2 = (Sub) base;
			sub2.say();			
		} catch (ClassCastException e) {
			System.out.println("Base 클래스 타입의 객체는 Sub 클래스 타입으로 형변환 시킬 수 없습니다.");						
		}
		
	}

}






