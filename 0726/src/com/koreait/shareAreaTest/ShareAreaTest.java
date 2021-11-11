package com.koreait.shareAreaTest;

public class ShareAreaTest {

	public static void main(String[] args) {

//		공유 영역으로 사용할 클래스의 객체를 선언한다.
//		ShareArea 클래스의 객체 참조 변수(주소를 기억한다.)로 ShareArea 클래스의 객체에 메모리에 생성된 주소를 기억한다.
		ShareArea shareArea = new ShareArea();
		
//		공유 영역을 만드는 1번째 방법
//		공유 영역을 공유해서 사용할 클래스의 객체를 선언하고 생성된 공유 영역의 주소를 넣어준다.
//		CalculatorThread calculator = new CalculatorThread();
//		PrintThread print = new PrintThread();
//		calculator.shareArea = shareArea;
//		print.shareArea = shareArea;
		
//		공유 영역을 만드는 2번째 방법
//		공유 영역을 공유해서 사용할 클래스의 객체를 생성할 때 생성자의 인수로 공유 영역의 주소를 넘겨준다.
//		CalculatorThread calculator = new CalculatorThread(shareArea);
//		PrintThread print = new PrintThread(shareArea);
		
//		공유 영역을 만드는 3번째 방법
//		공유 영역을 공유해서 사용할 클래스의 객체를 선언하고 setter 메소드를 사용해서 공유 영역의 주소를 넣어준다.
		CalculatorThread calculator = new CalculatorThread();
		PrintThread print = new PrintThread();
		calculator.setShareArea(shareArea);
		print.setShareArea(shareArea);
		
//		공유 영역 확인 테스트
//		calculator.shareArea.result = 555;
//		System.out.println("calculator.shareArea.result: " + calculator.shareArea.result);
//		System.out.println("print.shareArea.result: " + print.shareArea.result);
		
//		스레드를 실행한다.
		calculator.start();
		print.start();
		
		
	}

}
