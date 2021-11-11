package com.koreait.animationTest;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

import javax.swing.JPanel;


public class AnimationTest6 extends JPanel implements Runnable{	
		
	Image[] images = new Image[10] ;			
	int w = 55, h = 68, xpos = 50, index = 0;
	
		
	
	public AnimationTest6() {
		for (int i = 1; i < images.length; i++) {
//			String filename = ".\\src\\images\\princess_walk_"+(i < 10 ? "0" + i : i)+".png";
			String filename = String.format(".\\src\\images\\Duke%02d.gif", i);
//			System.out.println(filename);
			images[i] = Toolkit.getDefaultToolkit().getImage(filename);
		}
			
		
	}
	
	public static void main(String[] args) {
		
		Frame window = new Frame("AnimationTest");
		window.setBounds(600, 100, 720, 320);
		
		AnimationTest6 graphic = new AnimationTest6();
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
		
		
		g.setColor(Color.white);
		g.fillRect(0, 0, 720, 320);
		g.drawImage(images[index], xpos, 100, this);		
		
	}

	@Override
	public void run() {
		while(true) {
			try {Thread.sleep(67);} catch (InterruptedException e) {e.printStackTrace();}
			if (++xpos > 720) {
				xpos = -w;
			}
			index = ++index % images.length;
			repaint();
		}
	}
	
}
		
		
	
	

