package com.koreait.animationTest;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

import javax.swing.JPanel;


public class AnimationTest2 extends JPanel implements Runnable{	
		
	Image cards ;			
	int w = 1027 / 13, h = 615 / 5;		// 카드 한 장의 크기를 저장해둔다.
	Random random = new Random();
	int[] numbers = new int[52];
	
	public AnimationTest2() {
//		읽어올 이미지가 저장된 경로와 파일명을 지정한다.
		String filename = ".\\src\\images\\cards.png";
//		디스크에 저장된 이미지를 읽어서 Image 변수에 저장한다.
		cards = Toolkit.getDefaultToolkit().getImage(filename);
		
		for (int i = 0; i <numbers.length; i++) {
			numbers[i] = i;
		}
		
	}
	
	public static void main(String[] args) {
		
		Frame window = new Frame("AnimationTest");
		window.setBounds(200, 100, 1045, 533);
		
		AnimationTest2 graphic = new AnimationTest2();
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
		
		
//		g.drawImage(cards, 0, 0, this);

		for (int i = 0; i < 1000000; i++) {
			int r = random.nextInt(51) + 1;
			int temp = numbers[0];
			numbers[0] = numbers[r];
			numbers[r] = temp;
		}
		
		for (int i = 0; i < numbers.length; i++) {
			g.drawImage(cards, w*(i%13), h*(i/13), w*(i%13+1), h*(i/13+1), 
					w*(numbers[i]%13), h*(numbers[i]/13), w*(numbers[i]%13+1), h*(numbers[i]/13+1), this);
		}
		
	}

	@Override
	public void run() {

		while (true) {
			try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
			repaint();
		}
	}

	
	
}
		
		
	
	

