package com.koreait.listenerTest;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseWheelListenerTest extends JFrame {

	JLabel label = new JLabel("테스트");
	JPanel panel = new JPanel();
	int size = 35;

	public MouseWheelListenerTest() {

		setTitle("MouseWheelListener");
		setBounds(700, 200, 400, 500);
		
		setLayout(new GridLayout(2,1));
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setFont(new Font("Dialog", Font.BOLD, size));
		add(label);
		panel.setBackground(Color.pink);
		add(panel);
		
		panel.addMouseWheelListener(new MouseWheelListener() {
			
			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {

//				getWheelRotation() 메소드로 마우스의 휠이 굴러가는 방향을 얻어온다.
//				휠을 앞으로 밀면 -1(음수)이 리턴되며 뒤로 당기면 1(양수)이 리턴된다.
//				System.out.println(e.getWheelRotation());
				
//				휠을 앞으로 밀면 글씨가 커지게 하고 뒤로 당기면 글씨가 작아지게 한다.
					
				if (e.getWheelRotation() < 0) {
					size = ++size > 100 ? 100 : size;
				} else {	
					size = --size < 10 ? 10 : size;
				}
				label.setFont(new Font("Dialog", Font.BOLD, size));
			}
		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		}
	public static void main(String[] args) {

		MouseWheelListenerTest window = new MouseWheelListenerTest();

		
	}

}






