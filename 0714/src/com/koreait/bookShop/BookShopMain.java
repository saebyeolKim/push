package com.koreait.bookShop;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BookShopMain {
	
	public static void main(String[] args) {
		
//		BookVO 클래스 테스트
//		BookVO book = new BookVO();
//		System.out.println(book);
////		클래스로 생성한 객체를 출력할 때 객체에서 toString() 메소드를 실행하지 않아도 자바가 알아서 실행한다.
//		System.out.println(book.toString());
////		System.out.println(book.title);		// private 권한을 가지는 멤버에는 접근할 수 없으므로 에러가 발생된다.
//		System.out.println(book.getTitle());
//		
//		BookVO book2 = new BookVO("JAVA", "홍길동", "코리아 출판사", new Date(2012, 5, 12), 35000);
//		System.out.println(book2.getTitle());
//		System.out.println(book2.getAuthor());
//		System.out.println(book2.getPublisher());
//		System.out.println(book2.getDate());
//		System.out.println(book2.getPrice());
//		
//		BookVO book3 = new BookVO("JAVA", "홍길동", "코리아 출판사", new Date(2012, 5, 12), 35000);
//		System.out.println(book3);
//		
////		"=="을 사용해서 같은가 비교할 수 있는 데이터는 기본 자료형 8가지와 null만 가능하다. => 클래스 객체는 비교할 수 없다.
////		String은 단일 데이터가 저장되는 클래스라서 equals() 메소드만 사용하면 저장된 내용이 같은가 다른가 비교할 수 있지만 String을
////		제외한 나머지 클래스 객체는 equlas() 메소드만 사용하면 hashcode - 자바가 객체를 식별하기 위해 붙이는 의미없는 32비트의 숫자 - 를
////		비교하기 때문에 저장된 데이터가 같으면 같은 객체로 인식하게 하기 위해서 hashcode를 같게 만들어주고 
////		객체 내부에 실제로 저장된 데이터를 비교한다.
//		if (book2.equals(book3)) {
//			System.out.println("같다");
//		} else {
//			System.out.println("다르다");
//		}
		
//		도서 정보를 저장할 클래스(BookList)의 객체를 만든다.
		BookList bookList = new BookList(5);
		
		
		BookVO book1 = new BookVO("JAVA", "홍길동", "코리아출판사", new Date(2015, 9, 20), 35000);
		BookVO book2 = new BookVO("JAVA", "홍길자", "코리아출판사", new Date(2015, 9, 20), 35000);
		BookVO book3 = new BookVO("JAVA", "홍길숙", "코리아출판사", new Date(2015, 9, 20), 35000);
		BookVO book4 = new BookVO("JAVA", "홍길희", "코리아출판사", new Date(2015, 9, 20), 35000);
		BookVO book5 = new BookVO("JAVA", "홍길영", "코리아출판사", new Date(2015, 9, 20), 35000);
		BookVO book6 = new BookVO("JAVA", "홍길도", "코리아출판사", new Date(2015, 9, 20), 35000);
		
//		BookList 클래스 객체의 배열 bookList에 도서 정보를 저장하는 메소드(addbook)를 실행한다. 
		bookList.addbook(book1);
		bookList.addbook(book2);
		bookList.addbook(book3);
		bookList.addbook(book4);
		bookList.addbook(book5);
//		bookList.addbook(book6);
	
		
		System.out.println(bookList);
		
	}

}







