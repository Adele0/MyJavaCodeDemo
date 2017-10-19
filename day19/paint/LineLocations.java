package cn.itsource.paint;

public class LineLocations {
	int x1;//起点
	int x2;
	int y1;//终点
	int y2;
	
//	
	public LineLocations(int x1, int y1, int x2, int y2) {
		super();
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = y1;
		this.y2 = y2;
	}
	
//	要将坐标点放到直线上去，需要set get或构造方法
	public int getX1() {
		return x1;
	}
	public void setX1(int x1) {
		this.x1 = x1;
	}
	public int getX2() {
		return x2;
	}
	public void setX2(int x2) {
		this.x2 = x2;
	}
	public int getY1() {
		return y1;
	}
	public void setY1(int y1) {
		this.y1 = y1;
	}
	public int getY2() {
		return y2;
	}
	public void setY2(int y2) {
		this.y2 = y2;
	}
	
	
}
