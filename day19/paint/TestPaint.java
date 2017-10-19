package cn.itsource.paint;

public class TestPaint {

	public static void main(String[] args) {
		// 启动窗体,即：调用构造方法
		new Paint();//只是添加frame，listener，Graphics.drawline
//					 在窗体上画过直线后，一旦最小化，最大化组件会重新绘制图形（未保存）
//		需要引入ArrayList来保存坐标点，而起点 终点的坐标单独抽象为一个类
	}

}
