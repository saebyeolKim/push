package com.koreait.listenerTest;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MouseMotionTest4 extends Panel implements Runnable {	
		
		int xpos = 50, ypos = 50;
		static int xbar = 100;
		
		public static void main(String[] args) {
		
		Frame window = new Frame("GraphicTest");
		window.setBounds(800, 100, 500, 600);
		window.setLayout(new BorderLayout());
		
		MouseMotionTest4 graphic = new MouseMotionTest4();
		window.add(graphic, BorderLayout.CENTER);
		
		Thread thread = new Thread(graphic);
		thread.start();
		
		graphic.addMouseMotionListener(new MouseAdapter() {

			@Override
			public void mouseMoved(MouseEvent e) {
				
				xbar = e.getX() - 75; 
				xbar = xbar < 0 ? 0 : xbar;
				xbar = xbar > 340 ? 340 : xbar;
				
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

	public void paint(Graphics g) {

		g.setColor(Color.RED);
		g.fillOval(xpos, ypos, 30, 30);
		
		g.setColor(Color.GREEN);
		g.fillRect(xbar, 450, 150, 20);
	}
	
	@Override
	public void run() {
		int xsw = 1, ysw =1;
		while (true) {
			xpos += xsw;
			if(xpos > 435 || xpos < 0) {
				xsw *= -1;
			}
			ypos += ysw;
			if ((ypos > 430 && xpos >= xbar && xpos <= xbar + 150) || ypos < 0) {
				ysw *= -1;
			}
			if (ypos >= 550) {
				break;
			}
			try {Thread.sleep(1);} catch (InterruptedException e) {e.printStackTrace();}
			
			
			repaint();
			
		}
		JOptionPane.showMessageDialog(null, "Game Over!!!");
		System.exit(0);
		
	}
	
}
		
		
	
	

