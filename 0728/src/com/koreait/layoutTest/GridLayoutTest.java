package com.koreait.layoutTest;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

import javax.swing.JButton;

// GridLayout은 컨테이너를 격자(grid, 바둑판) 모양으로 나누고 컴포넌트를 나눠진 구역에 차례대로 배치하는 레이아웃 매니저이다.
public class GridLayoutTest extends Frame {	
	
//	버튼 배열이 선언만 된 상태로 실제 프로그램에서 사용할 버튼 객체는 아직 생성되지 않은 상태(null)이다.
//	버튼 배열을 선언한 후 각각의 버튼 배열 요소에 객체를 생성해서 넣치 않은 상태로 사용하면 NullPointerExeption이 발생된다.
	JButton[] buttons = new JButton[16];
	String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16"};
	
	public GridLayoutTest() {	
		setTitle("GridLayout");
		setBounds(800, 100, 400, 400);
		
//		GridLayout 레이아웃을 만들어 적용시킨다.
//		new GridLayout(행 개수, 열 개수[, 세로여백, 가로여백])
//		GridLayout grid= new GridLayout(4, 4);
//		setLayout(grid);
//		위의 2문장을 아래와 같이 1문장으로 줄여서 사용할 수 있다.
		setLayout(new GridLayout(4, 4, 3, 3));
		
//		GridLayout 객체를 생성할 때 생성자에서 grid사이에 여백을 지정할 수 있다.
//		new GridLayout(4, 4) => 여백 없는 4행 4열 GridLayout
//		setLayout(new GridLayout(4, 4, 3, 0)); => 세로 여백이 3인 4행 4열 GridLayout
//		setLayout(new GridLayout(4, 4, 0, 3)); => 가로 여백이 3인 4행 4열 GridLayout
//		setLayout(new GridLayout(4, 4, 3, 3)); => 모든 여백이 3인 4행 4열 GridLayout
		
//		numbers 배열에 저장된 데이터를 섞는다.
		Random random = new Random();
		for (int i = 0; i < 100000; i++) {
			int r = random.nextInt(15) + 1;
			String temp = numbers[0];
			numbers[0] = numbers[r];
			numbers[r] = temp;
		}
		
//		버튼 배열의 크기만큼 반복하며 GridLayout에 버튼을 넣어준다.
		for (int i = 0; i < buttons.length; i++) {
//			컨테이너에 추가할 컴포넌트를 배열로 선언한 경우 반드시 모든 배열 요소마다 객체를 생성한 후 넣어줘야한다.
//			buttons[i] = new JButton(String.valueOf(i + 1));
//			buttons[i] = new JButton(String.format("%d", i + 1));
//			buttons[i] = new JButton(i + 1 + "");
			buttons[i] = new JButton(numbers[i]);
			buttons[i].setFont(new Font("Dialog", Font.BOLD, 30));
			add(buttons[i]);
			
//			버튼 위에 글씨가 있을 때
//			getActionCommand() 메소드가 버튼위의 명령(문자열)을 얻어온다.
			if (buttons[i].getActionCommand().equals("16")) {
//				setEnabled(false) 메소드로 컴포넌트를 비활성화 시킨다.
//				buttons[i].setEnabled(false);
//				setVisible(false); 메소드로 컴포넌트를 컨테이너에 표시하지 않는다. => 자리는 차지한다.
				buttons[i].setVisible(false);
			}
		}
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);		
			}
		});
		setVisible(true);
	}
	
	public static void main(String[] args) {
		GridLayoutTest window = new GridLayoutTest();
	}
	
}
		
		
	
	

