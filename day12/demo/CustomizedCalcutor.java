package cn.itsource.day12.demo;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;

import cn.itsource.day12.listener.ButtonActionListener;
import cn.itsource.day12.listener.FrameWindowListener;

public class CustomizedCalcutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame frame = new Frame("最帅计算器");
		frame.setVisible(true);
		frame.setSize(250, 300);
		frame.setLocationRelativeTo(null);
		//1.自定义布局
		frame.setLayout(null);
		//2.设置文本框
		TextField textField = new TextField();
		//>>2.1设置文本框坐标 及 大小
		textField.setBounds(1, 1, 249, 100);
		//>>2.2添加文本框至窗体
		frame.add(textField);
		frame.addWindowListener(new FrameWindowListener());
		
		
		Button button = new Button("7");
		button.setBounds(0, 100, 50, 30);
		//添加事件监听器
		ButtonActionListener buttonListener = new ButtonActionListener(button, textField);
		button.addActionListener(buttonListener);
		frame.add(button);
	}

}
