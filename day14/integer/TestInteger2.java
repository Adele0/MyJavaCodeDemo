package cn.itsource.integer;

public class TestInteger2 {

	public static void main(String[] args) {
//		把int类型转化成integer
		Integer i1 = new Integer(123);
//		把integer类型转化成int
		int i2 = i1.intValue();
	
//		自动装箱和拆箱也能起到上面的效果。
//		自动装箱：把int转化成integer类型。
		Integer i3 = 123;
//		自动拆箱：把integer转化成int类型
		Integer i4 = 15;
		int i5 = i4;
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i5);
	}
}
