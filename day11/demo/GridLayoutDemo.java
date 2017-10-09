package cn.itsource.day11.demo;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

public class GridLayoutDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame frame = new Frame("最帅网格 ");
		frame.setVisible(true);
		frame.setSize(400,400);
		frame.setLocation(200,200);
		
		//设置网格布局的行列
		frame.setLayout(new GridLayout(3,3));
		
		//使用Ctrl F 替换
		Button button = new Button("第0");
		Button button1 = new Button("第1");
		Button button2 = new Button("第2");
		Button button3 = new Button("第3");
		Button button4 = new Button("第4");
		Button button5 = new Button("第5");
		Button button6 = new Button("第6");
		frame.add(button);
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.add(button5);
		frame.add(button6);
	}
	

}
