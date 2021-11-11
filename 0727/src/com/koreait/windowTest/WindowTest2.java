package com.koreait.windowTest;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

//	Frame 클래스를 상속받아 윈도우 만들기
//	Frame 클래스를 상속받으면 현재 클래스 windowTest2는 Frame 클래스의 모든 기능을 가지게 되므로 현재 클래스 객체가 생성될 때
//	생성자에서 윈도우에 대한 모든 설정을 하고 main() 메소드에서 현재 클래스의 객체를 생성하면 윈도우가 만들어진다.

public class WindowTest2 extends Frame {

	public WindowTest2() {
		this("제목 없는 윈도우");
	}
	
	public WindowTest2(String title) {
		setTitle(title);
		setBounds(800, 100, 400, 300);
		setBackground(new Color(new Random().nextInt(16777215)));		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
//				System.exit(0);		// 모든 윈도우 닫힘
				dispose();			// 하나만 닫힘
			}
		
		});
		setVisible(true);
	}
	
	public static void main(String[] args) {

		WindowTest2 window = new WindowTest2();
		new WindowTest2("제목있는 윈도우");
	}

}
