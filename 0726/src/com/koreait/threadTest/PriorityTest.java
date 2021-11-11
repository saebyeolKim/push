package com.koreait.threadTest;

public class PriorityTest {

	public static void main(String[] args) {

//		Thread 우선순위: 1 ~ 10 사이를 지정할 수 있다.
//		Thread.MIN_PRIORITY => 1
//		Thread.MAX_PRIORITY => 10
//		Thread.NORM_PRIORITY => 5, 기본값
//		우선순위가 높은 Thread가 CPU의 배분을 받을 확률이 높다.
		
		
//		for (int i = Thread.MIN_PRIORITY; i <= Thread.MAX_PRIORITY; i++) {
//			PriorityThread pt = new PriorityThread();
////			스레드 객체가 생성될 때 setPriority() 메소드로 우선순위를 지정할 수 있다.
//			pt.setPriority(i);
//			pt.start();
//		}
		
		PriorityThread pt1 = new PriorityThread();
		PriorityThread pt2 = new PriorityThread();
		PriorityThread pt3 = new PriorityThread();
		
		pt1.setPriority(Thread.MAX_PRIORITY);
		pt2.setPriority(Thread.NORM_PRIORITY);
		pt3.setPriority(Thread.MIN_PRIORITY);
		
		pt1.start();
		pt2.start();
		pt3.start();
	}

}
