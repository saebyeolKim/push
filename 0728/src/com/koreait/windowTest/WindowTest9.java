package com.koreait.windowTest;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class WindowTest9 extends Frame implements Runnable {
	
	Dimension dimension, dimension2;
	int xpos = 0;
	int ypos = 0;
	public WindowTest9() {	
		this("제목 없는 윈도우");
	}
	
	public WindowTest9(String title) {
		setTitle(title);
		setBounds(xpos, ypos, 400, 300);
		
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

		WindowTest9 window = new WindowTest9();
		Thread thread = new Thread(window);
		thread.start();
	}

	@Override
	public void run() {
		int xsw = 1, ysw = 1;
		boolean flag = true;
		while (true) {
			dimension2 = getSize();
			if (flag) {
				xpos += xsw;
				if (xpos > dimension.width - dimension2.width || xpos <= 0) {
					xsw *= -1;
					flag = false;
				}
			
			} else {
				ypos += ysw;
				if (ypos > dimension.height - dimension2.height || ypos <= 0) {
					ysw *= -1;					
					flag = true;
				}
			}
			setLocation(xpos, ypos);
			try {Thread.sleep(1);} catch (InterruptedException e) {e.printStackTrace();}
			
		
		}

	}
}
