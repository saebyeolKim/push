package com.koreait.listnerTest;


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

// ActionListner는 버튼을 마우스 왼쪽 버튼으로 클릭하거나 텍스트 상자에서 엔터키를 누를 때 실행되는 이벤트이다.
// ActionListner를 걸어주는 방법은 2가지가 있는데 클래스에 ActionListner 인터페이스를 구현하고 actionPerformed() 메소드를
// Override해서 구현하는 방법과 ActionListner를 걸어줄 객체에 addActionListner() 메소드를 사용해서 구현하는 방법이 있다.
public class ActionListnerTest extends JFrame implements ActionListener{	

	JButton button1 = new JButton("1");
	JButton button2 = new JButton("2");
	JButton button3 = new JButton("3");
	
	public ActionListnerTest() {
		setTitle("ActionListnerTest");
		setBounds(800, 200, 300, 400);
		
		setLayout(new GridLayout(3, 1));
		add(button1);
		add(button2); 
		add(button3);
		
//		만약에 버튼에 이미지를 올려야 할 경우 어떤 버튼에서 ActionListner가 실행되었나 판단하기 위해 setName() 메소드로 
//		버튼에 이름을 지정한다.
		button1.setName("button1");
		button2.setName("button2");
		button3.setName("button3");
		
//		button1에만 ActionListner를 걸어준다.
//		컴포넌트 단위로 ActionListner를 걸어주려면 컴포넌트에서 addActionListner() 메소드를 실행하고 메소드의 인수로
//		aActionListner 인터페이스 객체를 익명으로 구현한다 => actionPerformed() 메소드가 자동으로 Override 되고
//		이 actionPerformed() 메소드에서 실행할 기능을 구현한다.
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
//				System.out.println("꺄아");
//				System.exit(0);
				
//				MessageDialog: 간단한 메시지를 화면에 표시한다. => javascript에서 alert() 함수의 기능이 실행된다.
//				showMessageDialog(parentComponent, message)
//				parentComponent: MessageDialog가 어떤 컴포넌트 위에 표시될지 지정한다. null을 입력하면 화면 정가운데 표시된다.
//				message: MessageDialog에 표시할 메시지
//				JOptionPane.showMessageDialog(button1, "눌렸냐");
				
//				showConfirmDialog(parentComponent, message, Title(), messageType)
//				title: MessageDialog의 제목 표시줄에 나타낼 문자열을 지정한다.
//				messageType: 메시지 앞에 표시할 아이콘을 설정한다. *_MESSAGE 상수를 사용한다.
//				JOptionPane.showMessageDialog(button1, "눌렸냐", "에러", JOptionPane.INFORMATION_MESSAGE);
				
//				showConfirmDialog(parentComponent, message, Title(), messageType, icon)
//				icon: messageType을 대신 표시할 이미지 ImageIcon 클래스 객체를 사용해서 넣어준다.
				JOptionPane.showMessageDialog(button1, "눌렸냐", "에러", JOptionPane.INFORMATION_MESSAGE,
						new ImageIcon(".\\src\\images\\Duke01.gif"));
				
				
			}
		});
		
//		클래스에 ActionListener 인터페이스를 구현받아 여러 컴포넌트에서 실행되는 ActionListner를 구현하려는 경우 아래와 같이
//		addActionListner() 메소드를 실행하고 메소드의 인수로 자신을 의미하는 this를 넘겨서 ActionListner가 실행되는 컴포넌트의
//		정보를 actionPerformed() 메소드의 인수 ActionEvent 타입의 클래스 객체 e로 넘겨준다.
		button2.addActionListener(this);
		button3.addActionListener(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
			
		
	public static void main(String[] args) {
				
		ActionListnerTest window = new ActionListnerTest();
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {

//		System.out.println("꺄아");
//		System.out.println(e);
//		클래스에 ActionListner 인터페이스를 구현받아 여러 컴포넌트에서 같이 실행하는 ActionListner를 적용해야 할 경우 어떤
//		컴포넌트에서 ActionListner가 실행되었나 판단하는 코드가 필요하다.
//		System.out.println(e.getActionCommand());
//		getActionCommand() 메소드로 버튼 위의 명령(문자열)을 얻어와서 어떤 버튼에서 ActionListner가 실행되었나 판단한다.
//		if(e.getActionCommand().equals("2")) {
//			System.out.println("button2에서 ActionListner가 실행됨");
//		} else if (e.getActionCommand().equals("3")) {
//			System.out.println("button3에서 ActionListner가 실행됨");
//		}
		
//		switch (e.getActionCommand()) {
//		case "2":
//			System.out.println("button2에서 ActionListner가 실행됨");
//			break;
//		case "3":
//			System.out.println("button3에서 ActionListner가 실행됨");
//			break;
//		}
		
//		버튼위에 문자열이 없으면 getActionCommand() 메소드를 사용할 수 없다.
//		버튼 위에 문자열을 사용할 수 없을 경우 버튼에 setName() 메소드로 이름을 지정해놓고 필요할 때 getName() 메소드를 사용해서
//		버튼에 지정된 이름(문자열)을 얻어와서 사용한다.
		
//		getSource(): Listener가 실행된 컴포넌트를 얻어온다.
//		getSource() 메소드는 Object 클래스 타입으로 boxing된 객체를 얻어오기 때문에 반드시 형변환(unboxing) 시켜서 사용해야 한다.
		Object object = e.getSource();
		JButton button = (JButton) object;
//		System.out.println(button.getName());
		
//		if(button.getName().equals("button2")) {
//			System.out.println("button2에서 ActionListner가 실행됨");
//		} else if (button.getName().equals("button3")) {
//			System.out.println("button3에서 ActionListner가 실행됨");
//		}
		
//		switch (button.getName()) {
//		case "button2":
//			System.out.println("button2에서 ActionListner가 실행됨");
//			break;
//		case "button3":
//			System.out.println("button3에서 ActionListner가 실행됨");
//			break;
//		}
	
//		객체 자체를 비교해서 어떤 버튼이 클릭되었나 판단할 수 있다.
		if (button == button2) {
			System.out.println("button2에서 ActionListner가 실행됨");
		} else if (button == button3) {
			System.out.println("button3에서 ActionListner가 실행됨");
		}
		
	}
	
}
		
		
	
	

