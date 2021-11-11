package com.koreait.windowTest;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;


public class WindowTest5 extends Frame implements Runnable {
	
	public WindowTest5() {	
		this("제목 없는 윈도우");
	}
	
	public WindowTest5(String title) {
		setTitle(title);
		setBounds(800, 100, 400, 300);
		setBackground(new Color(new Random().nextInt(16777215)));		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
//				System.exit(0);		
				dispose();		
			}
		
		});
		setVisible(true);
	}
	
	public static void main(String[] args) {

		WindowTest5 window = new WindowTest5();
		Thread thread = new Thread(window);
		thread.start();
	}

	@Override
	public void run() {
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");
		while (true) {
//			setTitle(sdf.format(new Date()) + "");
//			setTitle(sdf.format(Calendar.getInstance().getTime()));
			setTitle(sdf.format(System.currentTimeMillis()));	
			
			try {Thread.sleep(1);} catch (InterruptedException e) {e.printStackTrace();}
		}
		
		
	}

}
