package com.koreait.windowTest;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class WindowTest8 extends Frame implements Runnable {
	
	Dimension dimension, dimension2;
	int xpos = 0;
	
	public WindowTest8() {	
		this("제목 없는 윈도우");
	}
	
	public WindowTest8(String title) {
		setTitle(title);
		setBounds(xpos, 0, 400, 300);
		
		dimension = Toolkit.getDefaultToolkit().getScreenSize();
		dimension2 = getSize();
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);		
			}
		
		});
		setVisible(true);
	}
	
	public static void main(String[] args) {

		WindowTest8 window = new WindowTest8();
		Thread thread = new Thread(window);
		thread.start();
	}

	@Override
	public void run() {
		
		int xsw = 1;
		while (true) {
			xpos += xsw;
			dimension2 = getSize();
			if (xpos > dimension.width - dimension2.width || xpos <= 0) {
				xsw *= -1;
				
			}
			setLocation(xpos, 0);
			try {Thread.sleep(1);} catch (InterruptedException e) {e.printStackTrace();}
			
		}
	}

}
