package com.koreait.listenerTest;


import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ActionListnerTest4 extends JFrame implements ActionListener, Runnable{	

	JLabel label = new JLabel("00:00:05.000");
	JPanel panel = new JPanel(new GridLayout(1,3));
	JButton button1 = new JButton("시작");
	JButton button2 = new JButton("일시정지");
	JButton button3 = new JButton("초기화");
	static ActionListnerTest4 window;
	boolean flag = true;
	long start, stop;
	SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");
	
	public ActionListnerTest4() {
		setTitle("ActionListnerTest");
		setBounds(700, 200, 600, 400);
		
//		여기부터
		setLayout(new GridLayout(2, 1));
		label.setFont(new Font("Dialog", Font.BOLD, 90));
		label.setHorizontalAlignment(JLabel.CENTER);
		add(label);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		add(panel);
//		여기까지 레이아웃 구성
		
//		버튼에 ActionListner를 걸어준다.
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		
		button1.setEnabled(true);
		button2.setEnabled(false);
		button3.setEnabled(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
			
		
	public static void main(String[] args) {
				
		window = new ActionListnerTest4();
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {

		switch (e.getActionCommand()) {
		case "시작": case "재시작":
			Thread thread = new Thread(window);
			thread.start();
			flag = true;
//			일시 정지 버튼만 활성화 시키고 나머지 버튼은 비활성화 시킨다.
			button1.setEnabled(false);
			button2.setEnabled(true);
			button3.setEnabled(false);
			break;
		case "일시정지":
			flag = false;
			button1.setText("재시작");
			button1.setEnabled(true);
			button2.setEnabled(false);
			button3.setEnabled(true);
			break;
		case "초기화":
//			label.setText("00:00:05.000");
			label.setText(sdf.format(-32395000));
			button1.setText("시작");
			button1.setEnabled(true);
			button2.setEnabled(false);
			button3.setEnabled(false);
			start = 0;
			break;
			
		}
	}


	@Override
	public void run() {
		
		
//		스톱워치 시작 시간으로 00:00:00.000으로 만들기 위해서 시작 시간과 종료 시간을 같은 시간으로 설정한다.
		if (start == 0) {
			start = System.currentTimeMillis();
			stop = start;
		}
		while (true) {
			long time = 5000 - (++stop - start) - 32400000;
			label.setText(sdf.format(time));
			
			if (time == -32400000) {
//				JOptionPane.showMessageDialog(label, "Game Over!");
//				System.exit(0);
				
//				int result = JOptionPane.showConfirmDialog(label, "Continue?", "이어서 하기", JOptionPane.YES_NO_OPTION,
//						JOptionPane.QUESTION_MESSAGE);
//				if (result == 1) {
//					System.exit(0);
//				} 
				
//				OptionDialog: 메시지가 표시된 클릭한 버튼의 인덱스를 리턴한다.
//				showInputDialog(parentComponent, message, title, optionType, messageType, icon, options, initialValues)
//				options: 버튼에 표시할 내용을 기억하는 배열
//				initialValues: 버튼 중에서 기본적으로 선택될 값을 지정한다.
				String[] money = {"100", "200", "300", "400", "500"};
				int choice = JOptionPane.showOptionDialog(label, "얼마를 투입하시겠습니까?", "동전넣기", JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE, new ImageIcon(".\\src\\images\\Duke01.gif"), money, "300");
				System.out.println(money[choice] + "원 충전~~~");

				label.setText(sdf.format(-32395000));
				button1.setText("시작");
				button1.setEnabled(true);
				button2.setEnabled(false);
				button3.setEnabled(false);
				start = 0;
				break;
				
				
			}
			
			try {Thread.sleep(1);} catch (InterruptedException e) {e.printStackTrace();}
			if (!flag) {
				break;
			}
		}
	
	}
	
}
		
		
	
	

