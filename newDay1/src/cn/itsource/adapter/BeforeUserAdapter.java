package cn.itsource.adapter;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class BeforeUserAdapter {

	public static void main(String[] args) {

		Frame frame = new Frame("引入适配器前");
		
		frame.addWindowListener(new WindowListener() {//要关闭窗口需要实现匿名内部类
			
			@Override
			public void windowOpened(WindowEvent arg0) {
			}
			
			@Override
			public void windowIconified(WindowEvent arg0) {
			}
			
			@Override
			public void windowDeiconified(WindowEvent arg0) {
			}
			
			@Override
			public void windowDeactivated(WindowEvent arg0) {
			}
			
			@Override
			public void windowClosing(WindowEvent arg0) {
				// 然后覆写需要的方法
				System.exit(0);
			}
			
			@Override
			public void windowClosed(WindowEvent arg0) {
			}
			
			@Override
			public void windowActivated(WindowEvent arg0) {
			}
		});
		
		frame.setSize(400,400);
		frame.setVisible(true);
	}

}
