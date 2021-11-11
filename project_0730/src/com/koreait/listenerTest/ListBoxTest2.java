package com.koreait.listenerTest;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.plaf.multi.MultiListUI;

//	화면 설계 평가문제
public class ListBoxTest2 extends JFrame implements ActionListener {

	JLabel topLabel;
	
	JPanel listPanel;
	JList<String> singleList;
	DefaultListModel<String> single;
	JList<String> multiList;
	DefaultListModel<String> multi;
	
	JPanel buttonPanel;
	JButton showButton;
	JButton removeButton;
	
	JLabel bottomLabel;
	
	public ListBoxTest2() {
		setTitle("ListBox");
		setBounds(800, 100, 400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(4, 1));
		
		topLabel = new JLabel("리스트 박스 테스트");
		topLabel.setFont(new Font("궁서체", Font.BOLD, 35));
		topLabel.setHorizontalAlignment(JLabel.CENTER);
		add(topLabel);
		
		listPanel = new JPanel();
		
		single = new DefaultListModel<String>();
		single.addElement("고구마");
		single.addElement("감자");
		single.addElement("옥수수");
		single.addElement("오이");
		single.addElement("호박");
		single.addElement("당근");
		singleList = new JList<String>(single);
		JScrollPane jspSingle = new JScrollPane(singleList);
		jspSingle.setPreferredSize(new Dimension(120, 75));
		singleList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listPanel.add(jspSingle);

		multi = new DefaultListModel<String>();
		multi.addElement("괌");
		multi.addElement("코타키나바루");
		multi.addElement("다낭");
		multi.addElement("나트랑");
		multi.addElement("대만");
		multi.addElement("보라카이");
		multiList = new JList<String>(multi);
		JScrollPane jspMulti = new JScrollPane(multiList);
		jspMulti.setPreferredSize(new Dimension(120, 75));
		multiList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		listPanel.add(jspMulti);
		
		add(listPanel);
		
		buttonPanel = new JPanel();
		showButton = new JButton("보기");
		buttonPanel.add(showButton);
		removeButton = new JButton("삭제");
		buttonPanel.add(removeButton);
		add(buttonPanel);
		
		bottomLabel = new JLabel("이곳에 작업 결과가 표시됩니다.");
		bottomLabel.setHorizontalAlignment(JLabel.CENTER);
		add(bottomLabel);
		
		showButton.addActionListener(this);
		removeButton.addActionListener(this);

		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		ListBoxTest2 graphic = new ListBoxTest2();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		switch (e.getActionCommand()) {
			case "보기":
				String str = "왼쪽 목록: ";
				if (singleList.getSelectedValue() == null) {
					str += "없음";
				} else {
					str += singleList.getSelectedValue();
				}
				
				str += ", 오른쪽 목록: ";
				ArrayList<String> items = null;
				try {
					items = (ArrayList<String>) multiList.getSelectedValuesList();
				} catch (Exception e2) { }
				
				if (items == null) {
					str += "없음";
				} else {
					System.out.println(items.size());
					for (int i = 0; i < items.size(); i++) {
						if (i > 0) {
							str += ", ";
						}
						str += items.get(i);
					}
				}
				
				bottomLabel.setText(str);
				break;
			case "삭제":
				if (singleList.getSelectedIndex() == -1) {
					JOptionPane.showMessageDialog(singleList, "왼쪽 리스트 박스에서 아무것도 선택하지 않았습니다.");
				} else {
					JOptionPane.showMessageDialog(singleList, singleList.getSelectedValue() + " 삭제 성공");
					single.removeElementAt(singleList.getSelectedIndex());
				}
				
				int[] deleteIndex = multiList.getSelectedIndices();
				ArrayList<String> deleteItem = null;
				try {
					deleteItem = (ArrayList<String>) multiList.getSelectedValuesList();
				} catch (Exception e2) { }

				if (deleteIndex.length == 0) {
					JOptionPane.showMessageDialog(multiList, "오른쪽 리스트 박스에서 아무것도 선택하지 않았습니다.");
				} else {
					
					String deleteList = "";
					for (int i = 0; i < deleteIndex.length; i++) {
						if (i > 0) {
							deleteList += ", ";
						}
						deleteList += deleteItem.get(i);
					}
					JOptionPane.showMessageDialog(multiList, deleteList + " 삭제 성공");
					
					for (int i = deleteIndex.length - 1; i >= 0; i--) {
						multi.removeElementAt(deleteIndex[i]);
					}
					
				}
				break;
		}
	}

}























