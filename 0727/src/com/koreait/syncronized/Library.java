package com.koreait.syncronized;

import java.util.ArrayList;

public class Library {

	public ArrayList<String> bookList = new ArrayList<>();
	
	public Library() {
		bookList.add("다빈치 코드");
		bookList.add("천사와 악마");
		bookList.add("디지털 포레스트");
//		bookList.add("라스트 심볼");
//		bookList.add("타나토노트");
//		bookList.add("개미");
	}
	
//	도서 대여 메소드
	public synchronized String lendBook() {
//		currentThread() 메소드로 현재 스레드의 정보를 얻어온다.
		Thread thread = Thread.currentThread();
		
//		대여할 책이 없으면 책이 반납될 때 까지 스레드를 일시적으로 멈춘다.
//		returnBook() 메소드에서 notify() 메소드를 실행해서 스레드를 깨울 때
//		if (bookList.size() == 0) {
//			try {
//				System.out.println(thread.getName() + " 대기 시작");
//				wait();		// 얼음 
//				System.out.println(thread.getName() + " 대기 종료");
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}			
//		}
//		returnBook() 메소드에서 notifyAll() 메소드를 실행해서 스레드를 깨울 때
		while (bookList.size() == 0) {
			try {
				System.out.println(thread.getName() + " 대기 시작");
				wait();		// 얼음 
				System.out.println(thread.getName() + " 대기 종료");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
		}
		
		String book = bookList.remove(0);
//		getName() 메소드로 현재 클래스 정보에서 스레드 이름을 얻어온다.
		System.out.println(thread.getName() + ": " + book + " 대여");
		
		return book;
	}
	
//	도서 반납 메소드
	public synchronized void returnBook(String book) {
		Thread thread = Thread.currentThread();
		bookList.add(book);
//		notify();
		notifyAll();    	// 땡
		System.out.println(thread.getName() + ": " + book + " 반납");
	}
}





