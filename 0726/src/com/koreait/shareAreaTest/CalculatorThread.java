 package com.koreait.shareAreaTest;


//	연산을 하는 클래스, 실행 시간이 긴 스레드
public class CalculatorThread extends Thread{

//	공유 영역으로 사용할 클래스 객체를 멤버로 선언한다.
	ShareArea shareArea = new ShareArea();
	
	public CalculatorThread() {	}
	public CalculatorThread(ShareArea shareArea) {
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
//		무한 급수를 이용한 원주율 계산 => 실행 시간이 오래 걸린다.
		long startTime = System.currentTimeMillis(); 	// 계산 시작 시간을 저장한다.
		
		double total = 0.0;
		for (int i = 1; i < 100000000; i += 2) {
			if (i / 2 % 2 == 0) {
				total += 1.0 / i;
			} else {
				total += -1.0 / i;
			}
		}
		long endTime = System.currentTimeMillis();		// 계산 종료 시간을 저장한다.
		System.out.println("\n계산시간: " + (endTime - startTime) / 1000. + "초");
//		System.out.println("원주율: " + total * 4);
//		연산 결과를 공유 영역의 연산 결과를 기억하는 멤버 변수 result에 넣어준다.
		shareArea.result = total * 4;
//		계산이 완료되었음을 알려준다.
		shareArea.ready = true;
		
		synchronized (shareArea) {
			shareArea.notifyAll();			
		}
	}
	
	
	
}
