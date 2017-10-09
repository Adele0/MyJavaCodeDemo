package cn.itsource.day11.demo;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

/**
 * @author GoldenKey
 *给frame加button
 */
public class FirstFrameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//新建frame，设置好frame的参数（可视、大小、位置）
		Frame frame = new Frame("最帅计算器");
		frame.setVisible(true);		
		frame.setSize(250, 250);
		frame.setLocation(200, 200);
		
		//新建流式布局，将布局方式set到frame里（默认居中），想要靠左，new时加入FlowLayout.LEFT,跟着数字表示间隙
		FlowLayout flowLayout = new FlowLayout(FlowLayout.LEFT,5,5);
		frame.setLayout(flowLayout);
		
		//新建button，将button加到frame里
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
		Button button6 = new Button("6");
		frame.add(button6);
		Button button7 = new Button("7");
		frame.add(button7);	
	}
}
