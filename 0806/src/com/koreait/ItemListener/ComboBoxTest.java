package com.koreait.ItemListener;



import java.awt.Choice;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class ComboBoxTest extends JFrame implements ActionListener{	

	JLabel topLabel;		// 윈도우 상단의 제목 레이블
	
	JPanel comboPanel;		// 콤보박스와 보기, 삭제 버튼이 올라갈 패널
	Choice comboBox;		// 콤보 박스
	JButton showButton;		// 보기 버튼
	JButton removeButton;	// 삭제 버튼
	
	JPanel addPanel;		// 텍스트 필드와 추가 버튼이 올라갈 패널
	TextField addField;		// 콤보 박스에 추가할 데이터를 입력받는 텍스트 필드
	JButton addButton;		// 추가 버튼
	
	JLabel bottomLabel;		// 윈도우 하단에 작업 결과 메시지를 표시할 레이블
	
	public ComboBoxTest() {
		setTitle("ComboBox");
		setBounds(800, 100, 400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(4, 1));
		
//		윈도우 상단의 제목 레이블 세팅
		topLabel = new JLabel("콤보 박스 테스트");
		topLabel.setFont(new Font("궁서체", Font.BOLD, 35));
		topLabel.setHorizontalAlignment(JLabel.CENTER);
		add(topLabel);
		
//		윈도우 중단의 콤보 박스와 보기, 삭제 버튼 세팅
		comboPanel = new JPanel();
		comboBox = new Choice();	// 콤보 박스를 만든다.
//		Choice 클래스로 만든 콤보 박스에 add() 메소드로 표시할 항목을 추가한다.
		comboBox.add("바나나");
		comboBox.add("파인애플");
		comboBox.add("망고");
		comboBox.add("두리안");
		comboBox.add("베리베리스트로베리");
		comboPanel.add(comboBox);	
		
		showButton = new JButton("보기");
		comboPanel.add(showButton);
		removeButton = new JButton("삭제");
		comboPanel.add(removeButton);
		
		add(comboPanel);

//		윈도우 중단의 텍스트 필드와 추가 버튼 세팅
		addPanel = new JPanel();
		
		addField = new TextField(20);
		addPanel.add(addField);
		addButton = new JButton("추가");
		addPanel.add(addButton);
		
		add(addPanel);
		
//		윈도우 하단의 레이블 세팅
		bottomLabel = new JLabel("이곳에 작업결과가 표시됩니다.");
		bottomLabel.setHorizontalAlignment(JLabel.CENTER);
		add(bottomLabel);
		
//		보기, 삭제, 추가 버튼에 ActionListener를 걸어준다.
		showButton.addActionListener(this);
		removeButton.addActionListener(this);
		addButton.addActionListener(this);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		ComboBoxTest graphic = new ComboBoxTest();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

//		어떤 버튼에서 ActionListener가 실행되었나 판단해서 적당한 작업을 한다.
		switch(e.getActionCommand()) {
		case "보기":
//			getSelectedIndex() 메소드로 콤보 박스에서 몇 번째 index가 선택되었나 얻어온다. => index는 0부터 시작한다.
//			bottomLabel.setText(comboBox.getSelectedIndex() + "");
//			getItem(index) 메소드로 index 번째 항목에 해당되는 데이터(레이블)을 얻어온다.
//			bottomLabel.setText(comboBox.getItem(comboBox.getSelectedIndex()));
//			getSelectedItem() 메소드로 콤보 박스에서 선택한 데이터를 얻어온다. comboBox.getItem(comboBox.getSelectedIndex())와 같은
//			기능이 실행된다.
			bottomLabel.setText("선택된 아이템: " + comboBox.getSelectedItem());
			break;
		case "삭제":
			String message = comboBox.getSelectedItem() + "을(를) 삭제하시겠습니까?";
			int result = JOptionPane.showConfirmDialog(comboBox, message, "삭제 확인", JOptionPane.YES_NO_OPTION);
			if (result == 0) {
				bottomLabel.setText(comboBox.getSelectedItem() + " 삭제 성공");
//				remove(position) 메소드로 콤보 박스에서 position번째 index에 해당되는 데이터를 제거할 수 있고 remove(item)
//				메소드로 콤보 박스에서 선택한 데이터를 제거할 수 있다.
//				comboBox.remove(comboBox.getSelectedIndex());
				comboBox.remove(comboBox.getSelectedItem());
			} else {
				bottomLabel.setText(comboBox.getSelectedItem() + " 삭제 취소");
			}
			break;
		case "추가":
			String item = addField.getText().trim();
			if (item.length() == 0) {
				JOptionPane.showMessageDialog(addField, "콤보 박스에 추가할 데이터를 입력하세요", "입력하기", JOptionPane.ERROR_MESSAGE);
			} else {
				comboBox.add(item);
				bottomLabel.setText(item + " 추가 완료");
				
//				select(pos) 메소드로 pos번째 위치의 데이터를 콤보 박스에 표시할 수 있다.
//				getItemCount() 메소드로 콤보 박스의 데이터 개수를 얻어온다.
//				System.out.println(comboBox.getItemCount());
				comboBox.select(comboBox.getItemCount() - 1);
			}
			addField.setText("");
			addField.requestFocus();
			break;
			
	
		}
	}

}
		
		
	
	

