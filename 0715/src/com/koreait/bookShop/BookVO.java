 package com.koreait.bookShop;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class BookVO {
	
	private String title; 		// 도서명
	private String author; 		// 저자
	private String publisher; 	// 출판사
	private Date date; 			// 출판일
	double price;		// 가격

	public BookVO() {
		this("없음", "없음", "없음", new Date(1900, 1, 1), 0.0);
		System.out.println("BookVO 클래스의 기본 생성자가 실행됩니다.");
	}

	
	public BookVO(String title, String author, String publisher, Date date, double price) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		
		
		date.setYear(date.getYear() - 1900);
		date.setMonth(date.getMonth() - 1);
		
		this.date = date;
		this.price = price;
		
	}
	
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






