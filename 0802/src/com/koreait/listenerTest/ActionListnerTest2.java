package com.koreait.listenerTest;


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ActionListnerTest2 extends JFrame implements ActionListener, Runnable{	

	JButton button1 = new JButton("시작");
	JButton button2 = new JButton("종료");
	static ActionListnerTest2 window;
	boolean flag = true;
	
	public ActionListnerTest2() {
		setTitle("ActionListnerTest");
		setBounds(800, 200, 300, 400);
		
		setLayout(new GridLayout(2, 1));
		add(button1);
		add(button2);
		button1.addActionListener(this);
		button2.addActionListener(this);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
			
		
	public static void main(String[] args) {
				
		window = new ActionListnerTest2();
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
			case "시작":
//				시작 버튼이 클릭되면 윈도우 제목 표시줄에 시간이 흐르게 하는 스레드를 실행한다.
				Thread thread = new Thread(window);
				thread.start();
				flag = true;
				break;
			case "종료":
//				종료 버튼이 클릭되면 스레드를 종료하기 위해서 flag 변수의 값을 false로 변경한다.
				flag = false;
				break;
		}
		
	}


	@Override
	public void run() {

		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");
		while(true) {
			long time = System.currentTimeMillis();
			setTitle(sdf.format(time));
			try {Thread.sleep(1);} catch (InterruptedException e) {e.printStackTrace();}
			if (!flag) {
				break;
			}
		}
		
		
	}
	
}
		
		
	
	

