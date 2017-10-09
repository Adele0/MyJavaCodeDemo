package cn.itsource.double0;

public class TestDouble {
//	两个NaN不相等
	public static void main(String[] args) {
		if (Double.NaN == Double.NaN) {
			System.out.println("相等");
		}else {
			System.out.println("不相等");
		}
	}
}
