package com.koreait.windowTest;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class WindowTest6 extends Frame {
	
//	클래스의 여러 메소드에서 사용해야 하는 변수나 객체는 멤버로 만들어 사용한다.
//	Dimension 클래스는 모니터 해상도를 기억하거나 윈도우 크기에 대한 작업을 하려는 경우 사용한다.
	Dimension dimension, dimension2;
	
	public WindowTest6() {	
		this("제목 없는 윈도우");
	}
	
	public WindowTest6(String title) {
		setTitle(title);
		setBounds(800, 100, 400, 300);
		
//		모니터 해상도를 얻어와서 Dimension 클래스 객체 dimension에 저장한다.
//		Toolkit 클래스는 모니터 해상도를 얻어오거나 디스크에 저장된 이미지 파일을 읽어올 수 있다.
		dimension = Toolkit.getDefaultToolkit().getScreenSize();
//		System.out.println(dimension);
//		System.out.println("모니터 해상도: " + dimension.getWidth() + " * " + dimension.getHeight());
//		System.out.println("모니터 해상도: " + dimension.width + " * " + dimension.height);
		
//		1. 모니터 해상도와 관계없이 프로그램이 시작되면 윈도우가 모니터 전체에 가득차게 표시되게 한다.
//		setBounds(0, 0, dimension.width, dimension.height);
		
//		원도우의 크기를 얻어와서 Dimension 클래스 객체 dimension2에 저장한다.
		dimension2 = getSize();
//		System.out.println("원도우 크기: " + dimension2.width + " * " + dimension2.height);
		
//		2. 모니터 해상도와 관계없이 프로그램이 시작되면 윈도우가 화면 정 가운데 위치하게 한다.
//		setLocation(500, 200);
		int xpos = dimension.width / 2 - dimension2.width / 2;
		int ypos = dimension.height / 2 - dimension2.height / 2;
		setLocation(xpos, ypos);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);		
			}
		
		});
		setVisible(true);
	}
	
	public static void main(String[] args) {

		WindowTest6 window = new WindowTest6();
	}

}
