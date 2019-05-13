package com.io;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
	
public class InputFrame extends JFrame {
	JButton jButton1;
	JButton jButton2;
	JTextArea jTextArea;
	public static void main(String[] args) {
		new InputFrame();
	}
	
	public InputFrame() {
		jButton1 = new JButton("确定");
		jButton2 = new JButton("取消");
		jTextArea = new JTextArea(null,"jtextarea",15,40);
		this.add(jTextArea);
		this.add(jButton1);
		this.add(jButton2);
		Toolkit tk = this.getToolkit();
		Dimension dm = tk.getScreenSize(); //获取屏幕的size
		this.setLayout(new FlowLayout());
		this.setBounds((int)(dm.getWidth()-500)/2,((int)(dm.getHeight()-320)/2), 500, 320);//让弹出框弹出在屏幕正中央
		this.setVisible(true);
		jButton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(jTextArea.getText());//获取jTextarea输入的内容
				System.exit(0); //点击按钮后弹出框小时
			}
		});
		jButton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(jTextArea.getText());//获取jTextarea输入的内容
				System.exit(0); //点击按钮后弹出框小时
			}
		});
	}
}