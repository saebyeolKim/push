package com.koreait.listenerTest;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MouseMotionListenerTest3 extends JPanel {
	
	static int xpos = 50, ypos = 50;
	
	public static void main(String[] args) {
		
		JFrame window = new JFrame("MouseMotionListener");
		window.setBounds(700, 100, 500, 600);
		
		MouseMotionListenerTest3 graphic = new MouseMotionListenerTest3();
		window.add(graphic);
		
		graphic.addMouseMotionListener(new MouseAdapter() {

			@Override
			public void mouseDragged(MouseEvent e) {
				
				xpos = e.getX() - 15;
				ypos = e.getY() - 15;
				graphic.repaint();
			}
			
		});
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);

	}

	@Override
	public void paint(Graphics g) {
		
		g.setColor(Color.RED);
		g.fillOval(xpos, ypos, 30, 30);
		
	}

	
	
}






