package com.koreait.bookShop;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class BookShopMain {
	
	public static void main(String[] args) {
		BookList bookList = new BookList();
		
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
		bookList.addbook(book6);
	
		
		System.out.println(bookList);
		
	}

}







