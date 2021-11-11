package com.koreait.threadTest;

public class PriorityThread extends Thread{

	@Override
	public void run() {
		int sum = 0;
		Thread thread = Thread.currentThread();
		System.out.println(thread + " start");		
		for (int i = 0; i <= 1000000; i++) {
			sum += i;
		}
//		getPriority() 메소드로 스레드의 우선순위를 얻어올 수 있다.
		System.out.println(thread.getPriority() + "end");
	}

}
