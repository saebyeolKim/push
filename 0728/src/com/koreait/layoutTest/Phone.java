package com.koreait.layoutTest;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.JButton;

public class Phone extends Panel{
	
	JButton[] buttons = new JButton[12];
	String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "*", "0", "#"};
	
	public Phone() {

		setLayout(new GridLayout(4, 3, 3, 4));
		
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(numbers[i]);
			buttons[i].setFont(new Font("Dialog", Font.BOLD, 30));
			add(buttons[i]);
		}
	}
}
