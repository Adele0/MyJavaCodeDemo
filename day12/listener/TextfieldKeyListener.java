package cn.itsource.day12.listener;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.zip.ZipEntry;

public class TextfieldKeyListener implements KeyListener {

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("KeyChar: " + arg0.getKeyChar());
		System.out.println("KeyCode: " + arg0.getKeyCode());
		System.out.println("KeyText: " + KeyEvent.getKeyText(arg0.getKeyCode()));
//		char keyChar = arg0.getKeyChar();
//		放弃用上面的方法，更常用的是：转化成string类型再用equals判断
		String keyChar = arg0.getKeyChar() + "";
		if ("w".equals(keyChar)) {
			System.out.println("此处无银");
		}
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

}
