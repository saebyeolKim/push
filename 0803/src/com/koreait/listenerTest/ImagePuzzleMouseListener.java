package com.koreait.listenerTest;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ImagePuzzleMouseListener extends JFrame implements ActionListener, MouseListener{

	JPanel puzzlePanel = new JPanel(new GridLayout(4, 4)); 
	JButton[] puzzleButton = new JButton[16]; 
	String[] numbers = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16" };
	JButton startButton = new JButton("시작"); 
	Random random = new Random();
	
	
//	퍼즐에 사용할 이미지를 저장할 Image 배열을 선언한다.
	Image[] images = new Image[16];
	

	public ImagePuzzleMouseListener() {

		setTitle("숫자 퍼즐 게임");
		setBounds(700, 200, 400, 500);
		
//	생성자에서 퍼즐에 사용할 이미지를 읽어들인다.
		for (int i = 0; i < images.length; i++) {
			String filename = String.format(".\\src\\conan\\%02d.jpg", i + 1);
//			System.out.println(filename);
			images[i] = Toolkit.getDefaultToolkit().getImage(filename);
		}
		
		viewPuzzle();
		
		startButton.setFont(new Font("궁서체", Font.BOLD, 45));
		startButton.setPreferredSize(new Dimension(400, 100));
		startButton.addActionListener(this);
		add(startButton, BorderLayout.SOUTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		}
	private void viewPuzzle() {
		for (int i = 0; i < puzzleButton.length; i++) {
//			puzzleButton[i] = new JButton(numbers[i]);
//			puzzleButton[i].setFont(new Font("Dialog", Font.BOLD, 40));
			
//			버튼에 이미지가 표시되는 퍼즐을 만들기 위해서 images 배열에 저장된 이미지를 ImageIcon 클래스 객체로 생성해서 올려준다.
			int index = Integer.parseInt(numbers[i]) - 1;
			puzzleButton[i] = new JButton(new ImageIcon(images[index]));
			
//			puzzleButton[i].addActionListener(this);
			puzzleButton[i].addMouseListener(this);
			
			puzzlePanel.add(puzzleButton[i]);
//			if (puzzleButton[i].getActionCommand().equals("16")) {
//				puzzleButton[i].setVisible(false);
//			}
//			버튼에 이미지를 올리면 getActionCommand() 메소드를 사용할 수 없으므로 setName() 메소드로 버튼에 이름을 지정해 처리한다.
			puzzleButton[i].setName(numbers[i]);
			if (puzzleButton[i].getName().equals("16")) {
				puzzleButton[i].setVisible(false);
			}
			
		}
		add(puzzlePanel, BorderLayout.CENTER);
	}

	public static void main(String[] args) {

		ImagePuzzleMouseListener puzzle = new ImagePuzzleMouseListener();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getActionCommand().equals("시작")) {
			for (int i = 0; i < 1000000; i++) {
				int r = random.nextInt(15) + 1;
				String temp = numbers[0];
				numbers[0] = numbers[r];
				numbers[r] = temp;
			}
			
			for (int i = 0; i < puzzleButton.length; i++) {
				puzzleButton[i].setVisible(true);
				puzzlePanel.remove(puzzleButton[i]);
			}
			viewPuzzle();
			revalidate();
			
		} 
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {

		
//		ActionEvent 클래스 타입의 변수 e에는 ActionListener가 실행된 ActionCommend는 넘어오지만 버튼에 지정된 이름은 넘어오지
//		않기 때문에 Object 클래스 타입의 객체로 ActionListener가 실행된 버튼 정보를 받아서 형변환 시킨 후 이름을 얻어내서 사용한다.
		Object object = e.getSource();
		JButton button = (JButton) object;
		
		int i;
		for (i = 0; i < puzzleButton.length; i++) {
//			if (puzzleButton[i].getActionCommand().equals(e.getActionCommand())) {
			if (puzzleButton[i].getName().equals(button.getName())) {
				break;
			}
		}
		
		if (i % 4 != 0 ) {
			if (puzzleButton[i - 1].getName().equals("16")) {
				String temp = numbers[i - 1];
				numbers[i - 1] = numbers[i];
				numbers[i] = temp;
			}
			
		}
		if (i % 4 != 3 ) {
			if (puzzleButton[i + 1].getName().equals("16")) {
				String temp = numbers[i + 1];
				numbers[i + 1] = numbers[i];
				numbers[i] = temp;
			}
		}
		
		if (i / 4 != 0) {
			if (puzzleButton[i - 4].getName().equals("16")) {
				String temp = numbers[i - 4];
				numbers[i - 4] = numbers[i];
				numbers[i] = temp;
			} 		
			
		}
			
		
		if (i / 4 != 3) {
			if (puzzleButton[i + 4].getName().equals("16")) {
				String temp = numbers[i + 4];
				numbers[i + 4] = numbers[i];
				numbers[i] = temp;
			}
	
		}
		for (i = 0; i < puzzleButton.length; i++) {
			puzzleButton[i].setVisible(true);
			puzzlePanel.remove(puzzleButton[i]);
		}
		viewPuzzle();
		revalidate();
	
	
		good:	// 레이블
		while(true) {
		for (i = 0; i < puzzleButton.length - 1; i++) {
			if (i + 1 != Integer.parseInt(puzzleButton[i].getName())) {
				break good;		
			}
		}
		JOptionPane.showMessageDialog(puzzlePanel, "맞췄다~~~~");
		System.exit(0);
		}
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}






