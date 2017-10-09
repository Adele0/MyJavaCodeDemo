package cn.itsource.day11.demo;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

/**
 * @author GoldenKey
 *第一个GUI
 */
public class AddButtomFirstFrameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//新建frame，设置参数（可视、大小、位置）
		Frame frame = new Frame("最帅流式");
		frame.setVisible(true);		
		frame.setSize(250, 250);
		frame.setLocation(200, 200);
		
		//选择布局方式，新建该方式，此处为流式布局。新建后，传入参数，默认居中，此处设置靠左，间隙5
		FlowLayout flowLayout = new FlowLayout(FlowLayout.LEFT,5,5);
		//将布局方式放入frame
		frame.setLayout(flowLayout);
		
		//新建多个button，将button分别add至frame
		Button button = new Button("0");
		frame.add(button);
		Button button1 = new Button("1");
		frame.add(button1);
		Button button2 = new Button("2");
		frame.add(button2);
		Button button3 = new Button("3");
		frame.add(button3);
		Button button4 = new Button("4");
		frame.add(button4);
		Button button5 = new Button("5");
		frame.add(button5);
	}

}
