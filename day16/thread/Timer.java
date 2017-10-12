package cn.itsource.thread;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;

public class Timer {

	public static void main(String[] args) throws InterruptedException {
		Frame frame = new Frame("计时器");
		frame.setSize(320,320);
		frame.setLocationRelativeTo(null);
		frame.setBackground(Color.CYAN);
		
		Label label = new Label("10",Label.CENTER);
		Font font = new Font("宋体", Font.BOLD, 100);
		label.setFont(font);

		frame.add(label);
		frame.setVisible(true);	//显示要在之前，否者没有效果
		
		for (int i = 10; i >= 0; i--) {
//			需要把循环的内容设置到label上
			label.setText(i + "");
			Thread.sleep(1000);
			if (i==0) {
				label.setText("BOOM");
			}
		}
	}

}
