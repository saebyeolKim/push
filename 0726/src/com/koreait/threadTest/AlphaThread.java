package com.koreait.threadTest;

// Runnable 인테페이스를 구현받고 run() 메소드를 Override해서 멀티 스레드를 구현한다.
public class AlphaThread implements Runnable{

//	'a' ~ 'z'를 0.2초 간격으로 출력한다.
	@Override
	public void run() {
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.print(ch);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
