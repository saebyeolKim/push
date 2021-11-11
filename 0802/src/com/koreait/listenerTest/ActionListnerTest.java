package com.koreait.listenerTest;


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
		button1.setName("btn1");
		button2.setName("btn2");
		button3.setName("btn3");
		
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
		
//		if(button.getName().equals("btn2")) {
//			System.out.println("button2에서 ActionListner가 실행됨");
//		} else if (button.getName().equals("btn3")) {
//			System.out.println("button3에서 ActionListner가 실행됨");
//		}
		
//		switch (button.getName()) {
//		case "btn2":
//			System.out.println("button2에서 ActionListner가 실행됨");
//			break;
//		case "btn3":
//			System.out.println("button3에서 ActionListner가 실행됨");
//			break;
//		}
	
//		객체 자체를 비교해서 어떤 버튼이 클릭되었나 판단할 수 있다.
		if (button == button2) {
//			System.out.println("button2에서 ActionListner가 실행됨");
			
//			ConfirmDialog: 메시지를 보여주고 사용자의 응답(예/아니오/취소, 확인/취소)을 받는다. 
//			=> javascript에서 confirm()함수 기능이 실행된다.
//			예(YES), 확인(OK) => 0을 리턴한다.
//			아니오(NO) => 1을 리턴한다.
//			취소(CANCLE) => 2를 리턴한다.
			
//			showConfirmDialog(parentComponent, message)
//			int result = JOptionPane.showConfirmDialog(button2, "프로그램을 종료하시겠습니까?");
//			System.out.println(result);
			
//			showConfirmDialog(parentComponent, message, title, optionType)
//			optionType: ConfirmDialog에 표시할 버튼의 종류를 지정한다. *_OPTION
//			OK_CANCLE_OPTION => 확인/취소, YES_NO_CANCLE_OPTION(기본값) => 예/아니오/취소, YES_NO_OPTION => 예/아니오
//			int result = JOptionPane.showConfirmDialog(button2, "프로그램을 종료하시겠습니까?", "종료확인", JOptionPane.YES_NO_CANCEL_OPTION);
			
//			showConfirmDialog(parentComponent, message, title, optionType, messageType)
//			int result = JOptionPane.showConfirmDialog(button2, "프로그램을 종료하시겠습니까?", "종료확인", JOptionPane.YES_NO_CANCEL_OPTION,
//					JOptionPane.WARNING_MESSAGE);
			
//			showConfirmDialog(parentComponent, message, title, optionType, messageType, icon)
			int result = JOptionPane.showConfirmDialog(button2, "프로그램을 종료하시겠습니까?", "종료확인", JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.WARNING_MESSAGE, new ImageIcon(".\\src\\images\\Duke01.gif"));
			
			
			
			if (result == 0) {
				System.exit(0);
			}
			
		} else if (button == button3) {
//			System.out.println("button3에서 ActionListner가 실행됨");
			
//			InputDialog: 메시지를 보여주고 사용자가 입력하는 문자열을 받아서 변수에 저장한다. => javascript에서 prompt() 함수의 기능이
//			실행된다.
			
//			showInputDialog(message)
//			String str = JOptionPane.showInputDialog("니 이름이 뭐니?");
			
//			showInputDialog(parentComponent, message)
//			String str = JOptionPane.showInputDialog(button3, "니 이름이 뭐니?");
			
//			showInputDialog(message, initialSelectionValue)
//			initialSelectionValue: InputDialog에 표시되는 기본값을 지정할 수 있다.
//			String str = JOptionPane.showInputDialog("니 이름이 뭐니?", "홍길동");
			
//			showInputDialog(parentComponent, message, initialSelectionValue)
//			String str = JOptionPane.showInputDialog(button3, "니 이름이 뭐니?", "홍길동");
			
//			showInputDialog(parentComponent, message, title, messageType)
//			String str = JOptionPane.showInputDialog(button3, "니 이름이 뭐니?", "이름 입력", JOptionPane.PLAIN_MESSAGE);
//			System.out.println(str + "님 어서오세요");
			
			
//			showInputDialog(parentComponent, message, title, messageType, icon, selectionValues)
//			selectionValues: 콤보 상자에 표시할 데이터가 저장된 배열
//			initialSelectionValue: 콤보 상자에 표시할 배열의 데이터 중에서 InputDialog에 표시할 기본값을 지정한다.
			String[] trip = {"괌", "코타키나발루", "대만", "다낭", "나트랑", "보라카이"};
			
			
			String str = (String) JOptionPane.showInputDialog(button3, "어디에 가고싶니?", "여행지 입력", JOptionPane.PLAIN_MESSAGE,
					new ImageIcon(".\\src\\images\\Duke01.gif"), trip, "보라카이");
			System.out.println("코로나 끝나면 "+ str + "에 놀러가고 싶어요");
			
			
		}
		
	}
	
}
		
		
	
	

