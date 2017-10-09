package cn.itsource.day12.demo;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;

import cn.itsource.day12.listener.CloseActionListener;
import cn.itsource.day12.listener.OpenActionListener;

public class NotePadDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame frame = new Frame("Notepad");
		frame.setSize(500, 500);
		frame.setLocation(100, 100);
		frame.setVisible(true);
		
		TextArea textArea = new TextArea();
		frame.add(textArea);
		
//		创建、添加菜单栏；菜单；子菜单
		MenuBar menuBar = new MenuBar();
		Menu menu = new Menu("file");
		Menu subMenu = new Menu("sub-file");
//		在子菜单中添加菜单项
		subMenu.add(new MenuItem("subNew"));
		subMenu.add(new MenuItem("subOpen"));
		
		MenuItem m2 = new MenuItem("open");
		//将 openListener、closeListener绑定
		m2.addActionListener(new OpenActionListener(frame));
		MenuItem m3 = new MenuItem("close");
		m3.addActionListener(new CloseActionListener());
		
		menu.add(subMenu);
		menu.add(m2);
		menu.add(m3);
		menuBar.add(menu);
		frame.setMenuBar(menuBar);
		}
}
