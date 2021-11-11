package com.koreait.animationTest;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

import javax.swing.JPanel;


public class AnimationTest3 extends JPanel implements Runnable{	
		
	Image bg, ship ;			
	int w = 488 / 4, h = 65;		// 배 한 장의 크기를 저장해둔다.
	int xpos = 100;
	int index = 0;					// 우주선 이미지 출력 순서 조정에 사용하는 변수
	
	public AnimationTest3() {
//		읽어올 이미지가 저장된 경로와 파일명을 지정한다.
		String filename = ".\\src\\images\\bg.png";
//		디스크에 저장된 이미지를 읽어서 Image 변수에 저장한다.
		bg = Toolkit.getDefaultToolkit().getImage(filename);
		
		filename = ".\\src\\images\\ship.png";
		ship = Toolkit.getDefaultToolkit().getImage(filename);
		
	}
	
	public static void main(String[] args) {
		
		Frame window = new Frame("AnimationTest");
		window.setBounds(600, 100, 720, 320);
		
		AnimationTest3 graphic = new AnimationTest3();
		window.add(graphic);
		
		Thread thread = new Thread(graphic);
		thread.start();
		
		window.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);		
			}
		});
		window.setVisible(true);
		
	}

	public void paint(Graphics g) {
		
		
		g.drawImage(bg, 0, 0, this);
		g.drawImage(ship, xpos, 100, xpos + w, 100 + h, index * w, 0, (index+1)*w, h, this);
		
	}

	@Override
	public void run() {
		while (true) {
			if (++xpos > 720) {
//				xpos = 0;
				xpos = -w;
			}
			try {Thread.sleep(50);} catch (InterruptedException e) {e.printStackTrace();}
			index = ++index == 4 ? 0 : index;
			repaint();
		}
		

	}
	
}
		
		
	
	

