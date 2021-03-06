package com.koreait.layoutTest;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JLabel;

//	BorderLayout은 컨테이너를 5부분으로 나누고 컨테이너를 저장한 영역에 배치하는 레이아웃 매니저이다.
public class BorderLayoutTest extends Frame {	
	
	JLabel label = new JLabel("TEXT1");
	JLabel label2 = new JLabel("TEXT2");
	JLabel label3 = new JLabel("TEXT3");
	JLabel label4 = new JLabel("TEXT4");
//	javax.swing 패키지 객체를 사용해 문자열을 표시할 때 2줄 이상을 표시하려면 html을 사용
	JLabel label5 = new JLabel("<html>한줄<br>두우주울</html>");
	JLabel label6 = new JLabel("TEXT6");
	
	
	public BorderLayoutTest() {	
		setTitle("BorderLayout");
		setBounds(800, 100, 400, 600);

//		BorderLayout을 만들고 적용시킨다. => BorderLayout은 Frame, JFrame의 기본 레이아웃이므로 적용하지 않아도 된다.
//		BorderLayout border = new BorderLayout();
//		setLayout(border);
//		위의 2문장을 아래와 같이 1문장으로 줄여서 사용할 수 있다.
		setLayout(new BorderLayout());
		
		label.setOpaque(true);
		label.setBackground(Color.PINK);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setPreferredSize(new Dimension(400, 50));		
//		add(컴포넌트, 방향), 방향을 생략하면 Center가 기본값으로 적용된다.
		add(label, BorderLayout.NORTH);
		
		label2.setOpaque(true);
		label2.setBackground(Color.ORANGE);
		label2.setHorizontalAlignment(JLabel.CENTER);
//		label2.setPreferredSize(new Dimension(400, 50));		
//		add(label2, BorderLayout.SOUTH);
		
		label3.setOpaque(true);
		label3.setBackground(Color.CYAN);
		label3.setHorizontalAlignment(JLabel.CENTER);
		label3.setPreferredSize(new Dimension(50, 50));		
		add(label3, BorderLayout.EAST);
		
		label4.setOpaque(true);
		label4.setBackground(Color.GREEN);
		label4.setHorizontalAlignment(JLabel.CENTER);
		label4.setPreferredSize(new Dimension(50, 50));		
//		add(label4, BorderLayout.WEST);
//		add("방향", 컴포넌트) => 방향은 반드시 문자열로 첫 문자만 대문자로 지정해야 한다.
		add("West", label4);
		
		label5.setOpaque(true);
		label5.setBackground(Color.GRAY);
		label5.setHorizontalAlignment(JLabel.CENTER);
//		add(label5, BorderLayout.CENTER);
//		add(label5);		// 방향 생략했으므로 기본값인 CENTER에 배치된다.
		
		label6.setOpaque(true);
		label6.setBackground(Color.BLUE);
		label6.setHorizontalAlignment(JLabel.CENTER);
//		label6.setPreferredSize(new Dimension(400, 50));		
//		add(label6, BorderLayout.SOUTH);
		
//		한 구역에 여러개의 컴포넌트를 넣고 싶으면 Panel이나 JPanel에 컴포넌트를 배치해서 컨테이너에 넣어주면 된다.
//		Panel, JPanel의 기본 레이아웃은 FlowLayout이다.
//		Panel panel = new Panel();
//		panel.setLayout(new GridLayout(1, 2));
		Panel panel = new Panel(new GridLayout(1, 2));
		panel.add(label2);
		panel.add(label6);
		panel.setPreferredSize(new Dimension(400, 50));
		add(panel, BorderLayout.SOUTH);
		
//		BorderLayout의 Center에 전화기 숫자 키패드를 넣는다.
		/*
		JButton[] buttons = new JButton[12];
		String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "*", "0", "#"};
		Panel panel2 = new Panel(new GridLayout(4, 3, 3, 4));
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(numbers[i]);
			buttons[i].setFont(new Font("Dialog", Font.BOLD, 30));
			panel2.add(buttons[i]);
		}
		add(panel2, BorderLayout.CENTER);
		*/
		
		Phone phone = new Phone();
		add(phone, BorderLayout.CENTER);
		
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);		
			}
		});
		setVisible(true);
	}
	
	public static void main(String[] args) {
		BorderLayoutTest window = new BorderLayoutTest();
	}
	
}
		
		
	
	

