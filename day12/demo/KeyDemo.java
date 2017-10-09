package cn.itsource.day12.demo;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;

import cn.itsource.day12.listener.TextfieldKeyListener;
import cn.itsource.day12.listener.ButtonMouseListener;
import cn.itsource.day12.listener.FrameWindowListener;

public class KeyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame frame = new Frame("测试鼠标事件");
		frame.addWindowListener(new FrameWindowListener());
		frame.setVisible(true);
		frame.setSize(300, 500);
		frame.setLocation(100, 100);
		
		frame.setLayout(null);
		
		TextField textField = new TextField();
		textField.setBounds(100, 100, 100, 30);
		//调用KeyListener
		textField.addKeyListener(new TextfieldKeyListener());
		
		frame.add(textField);
	}

}
