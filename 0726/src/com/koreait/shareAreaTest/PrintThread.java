package com.koreait.shareAreaTest;

//	연산 결과를 출력하는 스레드, 실행 시간이 짧은 스레도
public class PrintThread extends Thread{

//	공유 영역으로 사용할 클래스 객체를 멤버로 선언한다.
	ShareArea shareArea = new ShareArea();
	public PrintThread() {	}
	public PrintThread(ShareArea shareArea) {
		this.shareArea = shareArea;
	}
	public ShareArea getShareArea() {
		return shareArea;
	}
	public void setShareArea(ShareArea shareArea) {
		this.shareArea = shareArea;
	}
	@Override
	public void run() {
//		CalculatorThread의 실행이 끝날 때까지 (shareArea.ready에 true가 저장될 때 까지) 대기시킨다.
		System.out.print("헉...헉.. 겁나게 열심히 계산중");
		/*
		while(!shareArea.ready) {
			System.out.print(".");
//			스레드는 너무 빠르게 실행되면 정상적인 처리가 되지 않기 때문에 sleep() 메소드로 실행을 지연시켜야 한다.
			try { sleep(250); } catch (InterruptedException e) { e.printStackTrace();}
		}
		*/
//		위의 주석으로 처리한 부분은 스레드 사이에 불필요한 작업 전환이 이루어진다.
//		wait() 메소드로 CalculatorThread의 실행이 끝날 때까지 대기한다.
//		wait(): 현재 스레드를 다른 스레드에서 깨울 때까지 멈춘다.
//		다시 실행되게 하려면 다른 스레드에서 notify() 또는 notifyAll() 메소드를 실행한다.
//		notify(): wait() 메소드로 일시 정지된 스레드를 임의의 순서대로 깨운다.
//		notifyAll(): wait() 메소드로 일시 정지된 모든 스레드를 깨운다.
//		wait(). notify(), notifyAll() 메소드는 모두 동기화 블록 내부에 코딩해야 한다.
		
//		동기화 블록 => 동기화 블록의 인수는 여러 스레드가 같이 사용하는 공유 영역으로 사용되는 객체 이름을 써줘야한다.
		synchronized (shareArea) {
			try {
				shareArea.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
		}
		
		System.out.println("원주율: " + shareArea.result);
	}
	
}
