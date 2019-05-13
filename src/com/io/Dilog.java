package com.io;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * 作者：administrator 时间：2019年5月9日 下午8:58:51 说明：
 */
public class Dilog {

	public static void main(String[] args) {
//		JOptionPane.showMessageDialog(rootPane, "请输入：", "Input", JOptionPane.PLAIN_MESSAGE);
//		System.out.println(showInputDialog);
//		new MyFrame();
	}

}

class MyFrame extends JFrame {
	public MyFrame() {
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		JButton button = new JButton("点击");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String message = "hi";// 这句为你要显示的值
				JOptionPane.showMessageDialog(rootPane, message);
			}
		});
		c.add(button);
		this.setSize(300, 200);
		this.show();
	}
}
