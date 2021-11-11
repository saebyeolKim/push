package com.koreait.layouyTest;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;

//	CardLayout은 컨테이너에 카드를 여러장 엎어놓은 것처럼 컴포넌트를 배치하는 레이아웃 매니저이다. JFrame에는 적용이 안된다.
public class CardLayoutTest extends Frame {	
	
	Label label = new Label("1");
	Label label2 = new Label("2");
	Label label3 = new Label("3");
	
	public CardLayoutTest() {	
		setTitle("CardLayout");
		setBounds(800, 100, 400, 600);
		
//		CardLayout을 만들고 적용시킨다.
		CardLayout card = new CardLayout();
		setLayout(card);
//		위의 두문장을 아래와 같이 1문장으로 줄여서 사용할 수 있다.
//		setLayout(new CardLayout());
		
		label.setBackground(Color.orange);
		label.setForeground(Color.BLUE);
		label.setAlignment(Label.CENTER);
		label.setFont(new Font("Dialog", Font.BOLD, 400));
//		CardLayout은 컨테이너에 추가할 때 추가한 카드를 불러올 수 있어야 하므로 반드시 첫번째 인수로 카드 이름을 넣어줘야 한다.
//		add("카드 이름", 컴포넌트)
		add("1", label);
		
		label2.setBackground(Color.GREEN);
		label2.setForeground(Color.magenta);
		label2.setAlignment(Label.CENTER);
		label2.setFont(new Font("Dialog", Font.BOLD, 400));
		add("2", label2);
		
		label3.setBackground(Color.pink);
		label3.setForeground(Color.RED);
		label3.setAlignment(Label.CENTER);
		label3.setFont(new Font("Dialog", Font.BOLD, 400));
		add("3", label3);
		
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
		card.show(this, "2");
		
		try {Thread.sleep(2000);} catch (InterruptedException e1) {e1.printStackTrace();}
		card.show(this, "3");
		
	}
	
	public static void main(String[] args) {
		CardLayoutTest window = new CardLayoutTest();
	}
	
}
		
		
	
	

