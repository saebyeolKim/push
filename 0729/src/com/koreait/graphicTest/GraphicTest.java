package com.koreait.graphicTest;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JPanel;


public class GraphicTest extends JPanel implements Runnable {	
	static int xpos = 0;		// 팩맨의 이동을 담당하는 x좌표
	static int ypos = 350;
	int xsw = 1;		// 팩맨의 이동 방향을 바꿀 때 
	static int position = 0;	// 팩맨이 벽에 부딪혔을 때 입 방향을 반대로 바꿀 때 사용하는 변수
	int angle = 0;		// 팩맨이 입을 벌렸다 닫았다 하는데 사용하는 변수
	
	public static void main(String[] args) {
		
		Frame window = new Frame("GraphicTest");
		window.setBounds(800, 100, 500, 600);
		window.setLayout(new BorderLayout());
		
//		Panel 또는 JPanel 클래스를 상속받아 그래픽을 구현한 클래스 객체를 만든다.
		GraphicTest graphic = new GraphicTest();
		window.add(graphic, BorderLayout.CENTER);
		
		Thread thread = new Thread(graphic);
		thread.start();
		
		window.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					xpos = (xpos -= 10) < 0 ? 0 : xpos;
					position = 180;
					break;
				case KeyEvent.VK_RIGHT:
					xpos = (xpos += 10) > 405 ? 405 : xpos;
					position = 0;
					break;
				case KeyEvent.VK_UP:
					ypos = (ypos -= 10) < 0 ? 0 : ypos;
					position = 90;
					break;
				case KeyEvent.VK_DOWN:
					ypos = (ypos += 10) > 480 ? 480 : ypos;
					position = 270;
					break;
				}
			}
			
		});
		
		window.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);		
			}
		});
		window.setVisible(true);
		
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(0, 0, 500, 600);
		
		g.setColor(Color.PINK);
		g.fillArc(xpos, ypos, 80, 80, position + angle, 360 - angle * 2);
		
	}

	@Override
	public void run() {
		
		int asw = 1;
		while(true) {
			angle += asw;
			if (angle > 35 || angle < 0) {
				asw *= -1;
			}
//			xpos += xsw;
//			if (xpos >= 400 || xpos <= 0) {
//				xsw *= -1;
//				position = (position += 180) % 360;
//			}
			try {Thread.sleep(5);} catch (InterruptedException e) {e.printStackTrace();}
			repaint();
		}
		
	}
	
}
		
		
	
	

