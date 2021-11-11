package com.koreait.listenerTest;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PuzzleGameActionListener extends JFrame {

	JPanel puzzlePanel = new JPanel(new GridLayout(4, 4)); // 퍼즐 버튼을 올려서 원도우의 CENTER에 배치할 패널
	JButton[] puzzleButton = new JButton[16]; // 퍼즐버튼
	String[] numbers = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16" };
	JButton startButton = new JButton("시작"); // 시작버튼

	public PuzzleGameActionListener() {

		setTitle("숫자 퍼즐 게임");
		setBounds(700, 200, 400, 500);
		
//		Frame과 JFrame의 기본 레이아웃은 BorderLayout이므로 별도로 레이아웃을 지정하지 않아도 상관없다.
//		setLayout(new BorderLayout());

//		패널에 버튼을 올려서 BorderLayout의 CENTER에 올려준다.
		for (int i = 0; i < puzzleButton.length; i++) {
			puzzleButton[i] = new JButton(numbers[i]);
			puzzleButton[i].setFont(new Font("Dialog", Font.BOLD, 40));
			puzzlePanel.add(puzzleButton[i]);
			if (puzzleButton[i].getActionCommand().equals("16")) {
				puzzleButton[i].setVisible(false);
			}
		}
		add(puzzlePanel, BorderLayout.CENTER);
		
//		시작 버튼을 BorderLayout의 SOUTH에 올려준다.
		startButton.setFont(new Font("궁서체", Font.BOLD, 45));
		startButton.setPreferredSize(new Dimension(400, 100));		
		add(startButton, BorderLayout.SOUTH);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		}

	public static void main(String[] args) {

		PuzzleGameActionListener puzzle = new PuzzleGameActionListener();

	}

}
