package cn.itsource.adapter;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//由于内部类导入过多方法，但是实际需要覆写的方法很少，引入适配器adapter
public class AfterUserAdapter {

	public static void main(String[] args) {

		Frame frame = new Frame("引入适配器");
//		使用适配器，有选择的导入要覆写的方法 shift+alt+s ---> override/implement methods
		frame.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent arg0) {//仅仅导入需要覆写的方法
				System.exit(0);
			}
			
		});
		frame.setSize(400, 400);
		frame.setVisible(true);
	}

}
