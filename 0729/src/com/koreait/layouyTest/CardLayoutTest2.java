package com.koreait.layouyTest;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

import javax.swing.JButton;

public class CardLayoutTest2 extends Frame {	
	
	Label[] label = new Label[10];
	
	
	public CardLayoutTest2() {	
		setTitle("CardLayout");
		setBounds(800, 100, 400, 600);
		
		CardLayout card = new CardLayout();
		setLayout(card);
		for (int i = 0; i < label.length; i++) {
			label[i] = new Label(9 - i + "");
			label[i].setBackground(new Color(new Random().nextInt(16777215)));
			label[i].setForeground(new Color(new Random().nextInt(16777215)));
			label[i].setAlignment(Label.CENTER);
			label[i].setFont(new Font("Dialog", Font.BOLD, 400));
			add(9 - i + "", label[i]);
		}
		
		
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);		
			}
		});
		setVisible(true);
		
		try {Thread.sleep(2000);} catch (InterruptedException e1) {e1.printStackTrace();}
		
//		CardLayout의 카드 교체 방법
//		CardLayout객체이름.show(this, "카드이름")
		for(int i = 0; i < label.length; i++) {
			card.show(this, 9 - i + "");
			try {Thread.sleep(2000);} catch (InterruptedException e1) {e1.printStackTrace();}
			
		}
		
		
	}
	
	public static void main(String[] args) {
		CardLayoutTest2 window = new CardLayoutTest2();
	}
	
}
		
		
	
	

