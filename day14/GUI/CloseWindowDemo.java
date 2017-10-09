package cn.itsource.GUI;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class CloseWindowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame frame = new Frame("机机");
		frame.setSize(500,500);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		/*frame.addWindowListener(new MyWindowListener());
		弊端：每一次用到关闭窗口事件，都需要创建一个WindowsListener的类
		所以改用 匿名内部类。匿名内部类的语法： 
		new 接口/抽象类（）{
			覆写接口/抽象类的方法
		}*/
		frame.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				}
			
			@Override
			public void windowIconified(WindowEvent e) {
					
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
					
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {

			}
		});
	}

}
