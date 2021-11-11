package com.koreait.windowTest;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;


//	Frame 클래스 객체를 생성해 윈도우 띄우기
public class WindowTest {

	public static void main(String[] args) {

//		Frame window = new Frame();				// 제목 없는 윈도우를 만든다.
		Frame window = new Frame("제목");		// 제목 없는 윈도우를 만든다.
		
		window.setTitle("제목 변경"); 			// 윈도우의 제목을 변경한다.
//		window.setSize(400, 300);				// 윈도우의 크기를 변경한다.
//		window.setLocation(800, 100);;			// 윈도우의 위치를 변경한다.
//		setBounds(x축 위치, y축 위치, 폭, 높이)
		window.setBounds(800, 100, 400, 300);	// 윈도우의 위치와 크기를 모두 변경할 수 있다.
//		window.setBackground(Color.GREEN);		// 원도우의 배경색을 변경한다.
		
//		Color 클래스를 이용해 색상 만들기
//		Color(int r, int g, int b): r(빨강), g(녹색), b(파랑)의 값을 각각 0 ~ 255 사이의 정수를 입력해 색상을 만든다.
//		숫자를 크게 할수록 색상이 밝아지고(가법혼합) 작게 할 수록 어두워진다.
//		숫자를 모두 같은 크기로 지정하면 무조건 회색이 나오며 숫자의 크기에 따라 명도만 변경된다.
//		Color color = new Color(0, 0, 0);
//		window.setBackground(color);
		
		Random random = new Random();
//		int r = random.nextInt(256);
//		int g = random.nextInt(256);
//		int b = random.nextInt(256);
//		Color color = new Color(r, g, b);
//		window.setBackground(color);
		
//		Color(int rgb): 3개의 색상이 6자리 16진수로 표현된 것을 10진수로 변경해 입력해서 색상을 만든다.
//		Color color = new Color(7894450);					// 특정 색
		Color color = new Color(random.nextInt(16777216));	// 랜덤 색
		window.setBackground(color);
		
		
		
//		Frame 클래스를 이용해 윈도우를 띄우면 "X" 버튼을 클릭해도 윈도우가 닫히지 않기 때문에 닫아주는 코드를 넣어야 한다.
		window.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
//				System.exit(0); 		// 프로그램을 강제로 종료한다. => 모든 윈도우가 종료된다.
				window.dispose(); 		// 윈도우가 사용하던 자원을 컴퓨터에게 반납한다. => 현재 윈도우만 종료된다.
			}
			
		});
		
		
		window.setVisible(true);		// 윈도우를 화면에 보여준다.
		
	}

}
