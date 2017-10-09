package cn.itsource.day12.listener;

import java.awt.Button;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ButtonMouseListener implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getClickCount() == 1) {
			System.out.println("单击");
		}
		else if (arg0.getClickCount() == 2) {
			System.out.println("双击");
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("7");
		/*Object source = arg0.getSource();
//		拿到事件源之后要将使用范围限制在button上，需要强制转化
//		Button sourceButton = (Button) source;
//		上面的强转逻辑不严谨，首先判断对象实例
		if (source instanceof Button) {
			Button sourceButton = (Button) source;
//			移动按钮：在原来的坐标基础上改动
			sourceButton.setBounds(sourceButton.getX()+5, 
					sourceButton.getY()+5,
					sourceButton.getWidth(), 
					sourceButton.getHeight());
		}*/
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
//		System.exit(0);//正常退出
	}

}
