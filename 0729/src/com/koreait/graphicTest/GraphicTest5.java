package com.koreait.graphicTest;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JPanel;

public class GraphicTest5 extends Panel implements Runnable {	
		
		int xpos = 50, ypos = 50, xpos2 = 180, ypos2 = 180;
		
		public static void main(String[] args) {
		
		Frame window = new Frame("GraphicTest");
		window.setBounds(800, 100, 500, 600);
		window.setLayout(new BorderLayout());
		
		GraphicTest5 graphic = new GraphicTest5();
		window.add(graphic, BorderLayout.CENTER);
		
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

		
		g.setColor(Color.RED);
		g.fillOval(xpos, ypos, 50, 50);
		g.setColor(Color.BLUE);
		g.fillOval(xpos2, ypos2, 50, 50);
		
	}
	
	
	@Override
	public void run() {
		int xsw = 1, ysw =1, xsw2 = -1, ysw2 = -2;
		while (true) {
//			빨간공
			xpos += xsw;
			if(xpos > 435 || xpos < 0) {
				xsw *= -1;
			}
			ypos += ysw;
			if (ypos > 515 || ypos < 0) {
				ysw *= -1;
			}
			
//			파란공
			xpos2 += xsw2;
			if(xpos2 > 435 || xpos2 < 0) {
				xsw2 *= -1;
			}
			ypos2 += ysw2;
			if (ypos2 > 515 || ypos2 < 0) {
				ysw2 *= -1;
			}
			
//			충돌감지
			if (Math.abs(xpos - xpos2) <= 40 && Math.abs(ypos - ypos2) <= 40) {
				xsw *= -1;
				ysw *= -1;
				xsw2 *= -1;
				ysw2 *= -1;
			}
			try {Thread.sleep(1);} catch (InterruptedException e) {e.printStackTrace();}
			repaint();
		}
		
	}
	
}
		
		
	
	

