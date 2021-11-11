package com.koreait.bookShop;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class BookList {
	
//	여러권의 책 정보를 저장할 ArrayList를 만든다.
	ArrayList<BookVO> bookList = new ArrayList<BookVO>();
	
	public ArrayList<BookVO> getBookList() {
		return bookList;
	}

	public void setBookList(ArrayList<BookVO> bookList) {
		this.bookList = bookList;
	}

	@Override
	public String toString() {
//		return "BookList [bookList=" + Arrays.toString(bookList) + "]";			
		String str = "";
		double total = 0.0;
		DecimalFormat df = new DecimalFormat("#,##0원");
		str += "=============================================================\n";
		str += "도서명 저자명   출판사명   출판일   가격 \n";
		str += "=============================================================\n";
		for (int i = 0; i < bookList.size(); i++) {
			str += bookList.get(i) + "\n";	
			total += bookList.get(i).getPrice();
		}
		
//		for (BookVO vo : bookList) {
//			str += vo + "\n";
//			total += vo.getPrice();
//		}
		
		str += "=============================================================\n";
		str += "               합계 금액:" + df.format(total) + "\n";
		str += "=============================================================\n";
		return str;			
		
		
	}

//	BookList 클래스의 ArrayList bookList에 인수로 넘겨받은 도서 정보를 저장하는 메소드
	public void addbook(BookVO book) {
		bookList.add(book);
		
	}
}





