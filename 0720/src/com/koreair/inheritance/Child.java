package com.koreair.inheritance;

//	자식(하위, 서브, 파생)클래스
//	Child 클래스는 Parent 클래스를 상속받아 만든다.
//	상속이랑 부모 클래스에서 정의한 모든 변수와 메소드를 자식 클래스가 물려받는 것을 말한다 => 별도로 선언한 필요가 없다.
//	public class 자식클래스 이름 extends 부모 클래스이름
public class Child extends Parent{

//	Child 클래스에는 Parent 클래스의 모든 멤버 변수와 메소드를 사용할 수 있다.
//	Child 클래스에서 필요한 기능을 정의한다.
	private int age;
	private String nickname;
	
	public Child() {
		super();
// 		자식클래스 의 생성자가 실행되기 전에 부모 클래스의 생성자가 먼저 실행된다.
//		자식 클래스의 생성자에 별도의 설정을 하지 않으면 무조건 첫 줄에 부모 클래스의 기본 생성자를 실행하는 super()를
//		자바 컴파일러가 자동으로 붙여 준다.
//		super();를 생략한 경우 부모 클래스에 기본 생성자가 존재하지 않으면 에러가 발생되니 주의한다.
		System.out.println("자식 클래스의 기본 생성자가 실행됩니다.");
	}

	
//	이클립스가 지원하는 생성자 자동 완성 기능을 사용할 때 현재 클래스에 물리적으로 정의하지 않은 멤버(상속받은 멤버) 변수는
//	대화상자에 표시되지 않는다.
//	부모 클래스에서 상속받은 멤버를 초기화하기 위한 데이터를 받는 변수를 직접 코딩해야 한다.
	
//	부모 클래스에서 상속받은 멤버 변수에 접근권한이 private일 경우 자식 클래스에서도 접근할 수 없으므로
//	부모 클래스의 생성자를 실행해서 초기화 시킨다. => 1번째 방법 => 가장 많이 사용되는 방법
//	public Child(String name, boolean gender, int age, String nickname) {
//		super(name, gender);		// Parent(String name, boolean gender)가 실행된다.
//		this.age = age;
//		this.nickname = nickname;
//	}



//	부모 클래스에서 상속받은 멤버 변수의 접근 권한이 private일 경우 자식 클래스에서도 접근할 수 없으므로 부모 클래스에서
//	상속받은 setter 메소드가 있다면 상속받은 setter 메소드를 실행해서 초기화시킨다. => 2번째 방법
//	public Child(String name, boolean gender, int age, String nickname) {
//		setName(name);
//		setGender(gender);
//		this.age = age;
//		this.nickname = nickname;
//	}
	
//	부모 클래스에서 상속받은 멤버 변수의 접근 권한이 protected일 경우 자식 클래스에서 접근할 수 있으므로 this를 사용하는
//	초기화가 가능하다.
	public Child(String name, boolean gender, int age, String nickname) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.nickname = nickname;
	}
	
	@Override
//	@Override(재정의): 부모 클래스로부터 상속받은 메소드의 기능을 무시하고 다시 만들어 사용한다.
	public String toString() {
//	부모 클래스에서 상속받은 private 권한을 가지는 멤버는 자식 클래스에서도 접근할 수 없으므로 부모 클래스에서 상속받은
//	private권한을 가지는 멤버 변수에 저장된 데이터는 getter메소드를 사용해서 데이터를 얻어와야한다.
//		return getName() + "(" + (isGender() ? "남" : "여") + ")" + "-" + age + "," + nickname;
	
//		부모 클래스에서 상속받은 메소드에 기능을 추가할 때는 부모 클래스를 의미하는 super 뒤에 "."을 찍고 실행할 메소드 이름을 쓴다.
//		자식 클래스에서 부모 클래스에서 상속받은 메소드에 기능을 추가한다. => 부모 클래스에서 상속받은 메소드를 부분적으로 실행할 수 있다.
//		=> 부모 클래스에서 상속받은 메소드를 부분적으로 실행하려면 상속받은 메소드를 Override 해서 다시 정의해야한다.
//		super.toString(): 부모 클래스에서 상속받은 toString() 메소드를 실행한다.
//		return super.toString() + "-" + age + "," + nickname;
		
//		부모 클래스에서 상속받은 멤버 변수의 접근 권한이 protected일 경우 자식 클래스에서 접근할 수 있으므로 getter메소드를
//		사용하지 않아도 멤버 변수의 내용을 얻어올 수 있다.
		return name + "(" + (gender ? "남" : "여") + ")" + "-" + age + "," + nickname;
		}
	}

	
	

