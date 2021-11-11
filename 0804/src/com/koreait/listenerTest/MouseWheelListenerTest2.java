package com.koreait.listenerTest;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseWheelListenerTest2 extends JFrame implements MouseWheelListener{

	JPanel colorPanel = new JPanel();						// 변경되는 색상이 표시될 패널
	JPanel controlPanel = new JPanel(new GridLayout(1, 3));	// 빨간, 녹색, 파란색 색상 패널을 올려줄 패넝
	JPanel redPanel = new JPanel();							// 빨간 패널
	JPanel greenPanel = new JPanel();						// 초록 패널
	JPanel bluePanel = new JPanel();						// 파란 패널
	
	int r = 127, g = 127, b = 127;
	JLabel redLabel = new JLabel(r + "");
	JLabel greenLabel = new JLabel(g + "");
	JLabel blueLabel = new JLabel(b + "");
	
	public MouseWheelListenerTest2() {

		setTitle("MouseWheelListener");
		setBounds(700, 100, 400, 500);
		setLayout(new BorderLayout());
		
		colorPanel.setBackground(new Color(r, g, b));
		add(colorPanel, BorderLayout.CENTER);
		
		redLabel.setPreferredSize(new Dimension(50, 30));
		redLabel.setHorizontalAlignment(JLabel.CENTER);
		redLabel.setOpaque(true);
		redLabel.setBackground(Color.white);
		redPanel.add(redLabel);
		redPanel.setBackground(Color.red);

		greenLabel.setPreferredSize(new Dimension(50, 30));
		greenLabel.setHorizontalAlignment(JLabel.CENTER);
		greenLabel.setOpaque(true);
		greenLabel.setBackground(Color.white);
		greenPanel.add(greenLabel);
		greenPanel.setBackground(Color.green);
		
		blueLabel.setPreferredSize(new Dimension(50, 30));
		blueLabel.setHorizontalAlignment(JLabel.CENTER);
		blueLabel.setOpaque(true);
		blueLabel.setBackground(Color.white);
		bluePanel.add(blueLabel);
		bluePanel.setBackground(Color.blue);
		
		controlPanel.add(redPanel);
		controlPanel.add(greenPanel);
		controlPanel.add(bluePanel);
		
		controlPanel.setPreferredSize(new Dimension(400,150));
		add(controlPanel, BorderLayout.SOUTH);
		
//		MouseWheelListner를 redPanel, greenPanel, bluePenel에 걸어준다.
		redPanel.addMouseWheelListener(this);
		greenPanel.addMouseWheelListener(this);
		bluePanel.addMouseWheelListener(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		}
	public static void main(String[] args) {

		MouseWheelListenerTest2 window = new MouseWheelListenerTest2();

		
	}
	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
//		어떤 색상의 패널에서 휠을 굴렸나 판단해서 colorPanel의 색상을 변경한다.
		Object object = e.getSource();
		JPanel panel = (JPanel) object;
		
		if (panel == redPanel) {
			if (e.getWheelRotation() < 0) {
				r = ++r > 255 ? 255 : r;
			} else {
				r = --r < 0 ? 0 : r;
			}
			redLabel.setText(r + "");
			
		} else if (panel == greenPanel) {
			if (e.getWheelRotation() < 0) {
				g = ++g > 255 ? 255 : g;
			} else {
				g = --g < 0 ? 0 : g;
			}
			greenLabel.setText(g + "");
			
		} else if (panel == bluePanel) {
			if (e.getWheelRotation() < 0) {
				b = ++b > 255 ? 255 : b;
			} else {
				b = --b < 0 ? 0 : b;
			}
			blueLabel.setText(b + "");
		}
		
		colorPanel.setBackground(new Color(r, g, b));
	}

}






