package cn.itsource.day12.demo;

import java.awt.Button;
import java.awt.Frame;

import cn.itsource.day12.listener.ButtonMouseListener;
import cn.itsource.day12.listener.FrameWindowListener;

public class MouseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame frame = new Frame("测试鼠标事件");
		frame.addWindowListener(new FrameWindowListener());
		frame.setVisible(true);
		frame.setSize(300, 500);
		frame.setLocation(100, 100);
		
		frame.setLayout(null);
		
		Button button = new Button("7");
		button.setBounds(0,100, 50, 30);
		//调用MouseListener
		ButtonMouseListener buttonMouseListener = new ButtonMouseListener();
		button.addMouseListener(buttonMouseListener);
		
		frame.add(button);
	}

}
