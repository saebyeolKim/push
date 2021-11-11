package com.koreait.bookShop;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

//	VO(Value Object) 클래스 => 1건의 데이터와 데이터를 처리하는 메소드를 모아놓은 클래스, DTO(Data Transfer Object)
//	bean => 처리할 데이터를 기억하는 멤버 변수(필드)와 멤버 변수에 데이터를 입출력 할 수 있는 getters & setters 메소드로만 구성된 클래스  
public class BookVO {
	
//	데이터를 기억할 멤버 변수를 선언한다. => 멤버 변수는 클래스 내부의 모든 메소드에서 사용할 수 있다.(self.~)
//	멤버 변수 선언시 초기화를 하지 않으면 숫자는 0, char는 공백, boolean은 false로 클래스로 만든 참조 변수는 null로 자동 초기화 된다.
//	일반적으로 멤버 변수(파란색, 클래스 전체 사용) private 접근 권한을 사용하고 메소드는 public 접근 권한을 사용해서 선언한다.
	private String title; 		// 도서명
	private String author; 		// 저자
	private String publisher; 	// 출판사
	private Date date; 			// 출판일
	double price;		// 가격

//	생성자 메소드(이하 생성자)를 선언한다.
//	생성자 이름은 반드시 클래스 이름과 같아야 한다.
//	생성자는 리턴 타입을 사용하지 않고 생성자 내부에서 return도 사용하지 않는다. (ArrayTest)
//	생성자는 클래스의 객체가 생성될 때 자동으로 실행되며 멤버 변수를 초기화하는 목적으로 주로 사용된다.
//	생성자를 정의하지 않으면 컴파일러가 자동으로 아무런 일을 하지 않는 생성자(기본 생성자)를 만들어 주고 
//	생성자를 정의하면 기본 생성자를 자동으로 만들어 주지 않는다.
	

//  기본생성자
	public BookVO() {
//		title = "없음";
//		author = "없음";
//		publisher = "없음";
//		date = new Date(1900, 1, 1);
//		price = 0.0;
		
//		public BookVO(String title, String author, String publisher, Date date, double price) 생성자를 호출해서 초기화 한다.
		this("없음", "없음", "없음", new Date(1900, 1, 1), 0.0);
		System.out.println("BookVO 클래스의 기본 생성자가 실행됩니다.");
	}

	
//	멤버 변수를 초기화 할 데이터를 넘겨받아 멤버 변수를 초기화시키는 생성자(지역변수, 메소드 안에서 사용) 
	// 오른쪽 마우스 > 소스 > 컨스트럭터 유징 필드
	public BookVO(String title, String author, String publisher, Date date, double price) {
//		super()를 생략해도 자바 컴파일러가 자동으로 붙여준다.
//		super();	// 부모 클래스의 생성자를 의미한다.
//		this();		// 현재 클래스의 다른 생성자를 의미한다.
//		super()와 this는 반드시 생성자의 첫 문장으로 적어야 한다. => 동시에 사용할 수 없다.
//		super		// 부모 클래스를 의미한다.
//		this		// 현재 클래스를 의미한다.
//	멤버 변수와 지역 변수가 같은 {} 블록에 존재할 경우 자바는 지역 변수에 우선권을 부여한다.
//	멤버 변수와 지역 변수가 이름이 같을 경우 멤버 변수는 현재 클래스를 의미하는 "this"를 앞에 붙여서 표현한다.
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		
//		인수로 넘어온 date에 저장된 날짜 데이터에서 년은 1900을 월은 1일 빼서 다시 저장시킨다.
		
		date.setYear(date.getYear() - 1900);
		date.setMonth(date.getMonth() - 1);
		
		this.date = date;
		this.price = price;
		
	}
	
//	getters & setters 메소드를 선언한다. 
//	getters & setters 메소드는 private 권한으로 선언된 멤버 변수에 클래스 외부에서 접근할 수 있도록 예외를 만든다.

//	getter는 메소드 이름이 get으로 시작하고 멤버 변수의 이름을 붙여주며 멤버 변수의 자료형을 리턴 타입으로 가진다.
//	getter 메소드로 인수는 전달받지 않고 멤버 변수의 내용을 리턴시킨다.
//	public String getTitle() {
//		return title;
//	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

	//	클래스 객체에 저장된 내용을 보고 싶다면 toString() 메소드를 Override(재정의) 해야한다.
//	@Override 어노테이션은 이 메소드가 부모 클래스에서 상속받은 메소드를 Override한 메소드임을 의미한다.
//	@Override 어노테이션이 붙어있는 메소드는 메소드 이름을 수정해서 상속받은 메소드와 이름이 달라지면 에러를 발생시킨다.
	@Override // 오른쪽 마우스 > 소스 > 제너레이트 스트링
//	toString() 메소드는 객체의 멤버 변수에 저장된 데이터 출력에 사용된다.
	public String toString() {
//		출력할 내용을 문자열로 만들어서 return 시킨다.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E)");
		
//		NumberFormat 클래스로 숫자 출력 서식 지정하기 => 이미 제작되서 제공되는 서식만 사용할 수 있다.
//		NumberFormat 클래스는 singleton 패턴으로 제작되어있어서 객체를 생성하지 못하고 제작되어있는 서식을 얻어오는 
//		메소드를 사용해 클래스 내부에 미리 작성된 서식을 얻어와 사용한다.
//		NumberFormat nf = NumberFormat.getNumberInstance();		// 천 단위마다 ","를 출력한다.
//		NumberFormat nf = NumberFormat.getCurrencyInstance();	// 통화표시(￦)와 천 단위마다 ","를 출력한다
//		NumberFormat nf = NumberFormat.getPercentInstance();	// 백분율 표시(%)와 천 단위마다 ","를 출력한다 => 숫자에 100이 자동으로 곱
		
//		DecimalFormat 클래스로 숫자 출력 서식 지정하기 => 사용자가 직접 서식을 만들어 사용할 수 있다.
//		DecimalFormat df = new DecimalFormat("출력 서식");
//		출력 서식에는 "#,##0"을 입력하고 앞, 뒤로 서식 표현에 사용할 문자를 직접 입력한다.
//		DecimalFormat df = new DecimalFormat("#,##0");			// NumberFormat.getNumberInstance()
//		DecimalFormat df = new DecimalFormat("￦#,##0");		// NumberFormat.getCurrencyInstance()
//		DecimalFormat df = new DecimalFormat("#,##0%");			// NumberFormat.getPercentInstance()
//		소수점 아래 자리수는 보고싶은 만큼 "."을 입력하고 "0"을 적어넣으면 된다.
//		DecimalFormat df = new DecimalFormat("$#,##0.00");			
		DecimalFormat df = new DecimalFormat("#,##0원");			
		
//		return title + " " + author + " " + publisher + " " + sdf.format(date) + " " + df.format(price);
//		String 클래스의 format() 메소드를 사용하면 서식을 지정해서 출력할 수 있다.
//		String.format("출력 서식", 출력할 데이터)	
		return String.format("%s %s %s %s %s", title, author, publisher, sdf.format(date), df.format(price));
		
	
	}

//  클래스 객체에 저장된 데이털르 비교해야 한다면 hashcode() 메소드와 equals() 메소드를 Override 하면 된다. (소스 > 해쉬코드 앤 이콜스)
	@Override
//	저장된 데이터가 같으면 같은 hashcode로 만들어 주는 메소드
	public int hashCode() {
		return Objects.hash(author, date, price, publisher, title);
	}


	@Override
//	객체에 저장된 실제 데이터를 비교하는 메소드
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookVO other = (BookVO) obj;
		return Objects.equals(author, other.author) && Objects.equals(date, other.date)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(publisher, other.publisher) && Objects.equals(title, other.title);
	}

	
}






