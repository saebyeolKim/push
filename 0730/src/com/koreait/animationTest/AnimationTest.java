package com.koreait.animationTest;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JPanel;


public class AnimationTest extends JPanel {	
		
	Image bg, duke;			// 디스크의 이미지를 읽어서 저장할 변수
	int w = 55, h = 68;		// 이미지 한 장의 크기를 저장해둔다.
	
//	생성자에서 객체가 생성될 때 윈도우에 표시할 이미지를 읽어 Image변수에 저장한다.
	public AnimationTest() {
//		읽어올 이미지가 저장된 경로와 파일명을 지정한다.
		String filename = ".\\src\\images\\bg.png";
		bg = Toolkit.getDefaultToolkit().getImage(filename);
//		디스크에 저장된 이미지를 읽어서 Image 변수에 저장한다.
		
		filename = ".\\src\\images\\Duke06.gif";
		duke = Toolkit.getDefaultToolkit().getImage(filename);
		
	}
	
	public static void main(String[] args) {
		
		Frame window = new Frame("AnimationTest");
		window.setBounds(600, 100, 720, 320);
		
		AnimationTest graphic = new AnimationTest();
		window.add(graphic);
		
		window.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);		
			}
		});
		window.setVisible(true);
		
	}

	public void paint(Graphics g) {
		
//		drawImage(imag, x, y, observer): 원본 이미지를 변형없이 그대로 원도우에 표시한다. => 배경 이미지를 표시할 때 사용한다.
//		img: 원도우에 표시할 이미지가 저장된 Image 객체
//		x, y: 윈도우에 이미지가 표시되기 시작할 좌표 => 0, 0을 지정하면 원도우 좌픅 상단 모서리 부터 이미지가 표시된다.
//		observer: 이미지를 표시할 윈도우 => 현재 윈도우에 표시하면 되기 때문에 this를 적는다.
//		g.drawImage(bg, 0, 0, this);
		g.drawImage(duke, 0, 0, this);
		
//		drawImage(img, dx1, dy1, dx2, dy2, sx1, sy1, sx2, sy2, observer): 원본 이미지를 변형하거나 원본 이미지의 일부를 얻어와
//		윈도우에 표시한다.
//		dx1, dy1: 윈도우에 이미지가 표시될 시작 좌표
//		dx2, dy2: 윈도우에 이미지가 표시될 끝 좌표
//		sx1, sy1: 윈도우에 표시할 원본 이미지에서 읽기 시작할 좌표
//		sx2, sy2: 윈도우에 표시할 원본 이미지에서 읽을 끝 좌표
		g.drawImage(duke, w*1, h*0, w*2, h*1, 0, 0, 55, 68, this);	// 원래 모양, 원본 이미지를 왼쪽 위 => 오른쪽 아래
		g.drawImage(duke, w*2, h*0, w*3, h*1, 55, 0, 0, 68, this);	// 좌우 대칭, 원본 이미지를 오른쪽 위 => 왼쪽 아래
		g.drawImage(duke, w*3, h*0, w*4, h*1, 0, 68, 55, 0, this);	// 상하 대칭, 원본 이미지를 왼쪽 아래 => 오른쪽 위
		g.drawImage(duke, w*4, h*0, w*5, h*1, 55, 68, 0, 0, this);	// 상하 대칭, 원본 이미지를 오른쪽 아래 => 왼쪽 위
		g.drawImage(duke, w*5, h*0, w*7, h*2, 0, 0, 55, 68, this);	// 4배확대
		g.drawImage(duke, w*7, h*0, w*7+w/2, h/2, 0, 0, 55, 68, this);	// 1/4배 축소
		
		
	}

	
	
}
		
		
	
	

