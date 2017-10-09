package cn.itsource.day11.demo;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;

public class BorderLayoutDemo {
	public static void main(String[] args) {
		Frame frame = new Frame("最帅边框");
		frame.setVisible(true);
		frame.setSize(500,300);
		frame.setLocation(50,30);
		
		BorderLayout borderLayout = new BorderLayout();
		frame.setLayout(borderLayout);
		
		Button button = new Button("North");
		button.setPreferredSize(new Dimension(60, 60));
		frame.add(button, BorderLayout.NORTH);
		Button button1 = new Button("South");
		button1.setPreferredSize(new Dimension(60, 60));
		frame.add(button1,BorderLayout.SOUTH);
		Button button2 = new Button("West");
		button2.setPreferredSize(new Dimension(80, 80));
		frame.add(button2,BorderLayout.WEST);
		Button button3 = new Button("East");
		button3.setPreferredSize(new Dimension(80, 80));
		frame.add(button3,BorderLayout.EAST);
		Button button4 = new Button("Middle");
		//middle cannot define the dimension
		frame.add(button4,BorderLayout.CENTER);
	}		
}
