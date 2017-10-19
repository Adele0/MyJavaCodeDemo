package cn.itsource.paint;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JFrame;
//	画图类，继承窗口框架
public class Paint extends JFrame{
//	提供构造方法，设置 窗体大小，位置，可见
	public Paint(){
		
		this.setTitle("小白的简陋画板");
		this.setSize(600, 600);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
//		添加画板监听
		this.addListener();
		
//		定义一个ArrayList用来保存坐标点
		ArrayList arrayList = new ArrayList();
		
		
		public void paint(Graphics g){
//			取出ArrayListz里的直线
			for(Object object :arrayList){
				LineLocations lineLocations = (LineLocations)object;
				g.drawLine(lineLocations.getX1(), lineLocations.getY1(), lineLocations.getX2(), lineLocations.getY2());
			}
		}
	}
	
//	添加事件监听可以放在Paint类里，但是监听器太长，可以单独列出
	public void addListener(){
		this.addMouseListener(new MouseListener() {//MouseListener是接口，不能直接new，需要匿名内部类
			int x1;//坐标要多次使用，用变量装起来
			int x2;
			int y1;
			int y2;
			
//			覆写释放,获取结束坐标
			public void mouseReleased(MouseEvent e) {
				x2 = e.getX();
				y2 = e.getY();
				
//				将x1,y1,x2,y2封装成LineLocations
				LineLocations ll = new LineLocations(x1, y1, x2, y2);
//				将ll保存到ArrayList
				//ArrayList arrayList = new ArrayList();//定义一个ArrayList用来保存坐标点
				arrayList.add(ll); 
				
//				鼠标释放时，调用drawline方法。
//				获得画图对象，Graphics是抽象类，要从frame中调用画图对象。
//				Paint.this获得当前对象。。。直接用this是用到内部类
				
				Graphics fGraphics = Paint.this.getGraphics();
				fGraphics.drawLine(x1, y1, x2, y2);
			}
//			覆写点击,获取起点坐标
			public void mousePressed(MouseEvent e) {
				x1 = e.getX();
				y1 = e.getY();
			}
			
			public void mouseExited(MouseEvent e) {}
			
			public void mouseEntered(MouseEvent e) {}
			
			public void mouseClicked(MouseEvent e) {}
		});
	}
}
