package com.koreait.windowTest;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

//	JFrame 클래스 객체를 생성해 원도우 만들기
public class WindowTest3 {
	public static void main(String[] args) {
		
//		JFrame window = new JFrame();
		JFrame window = new JFrame("제목 있는 윈도우");
		window.setTitle("제목이 변경된 윈도우");
//		window.setSize(400, 300);
//		window.setLocation(800, 100);
		window.setBounds(800, 100, 400, 300);
		
//		JFrame은 Frame의 색상을 변경하듯이 아래와 같이 실행하면 윈도우의 배경색이 변경되지 않는다.
//		window.setBackground(Color.black);
//		JFrame으로 만든 윈도우의 색상 변경 방법은 아래와 같다.
		Container container = window.getContentPane();
		container.setBackground(Color.CYAN);
		
//		Frame 클래스를 이용해 윈도우를 만들면 윈도우를 닫는 코드를 별도로 작성해야 윈도우를 닫을 수 있지만 JFrame 클래스를
//		사용해서 윈도우를 만들면 닫는 코드를 별도로 작성하지 않아도 "X" 버튼을 클릭하면 윈도우가 닫힌다.
//		하지만 윈도우가 닫혔는데 프로그램이 종료되지 않는 문제점이 발생되므로 Frame 클래스의 윈도우를 닫는 코드를 사용하거나
//		아래의 코드를 사용하면 윈도우가 닫히면서 프로그램이 종료된다.
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
	}

}
