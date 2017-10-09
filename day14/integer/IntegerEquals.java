package cn.itsource.integer;

public class IntegerEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		== 和 .equals()比较。 .equals()一般比较值， ==比较地址。
		Integer i1 = new Integer(123);
		Integer i2 = new Integer(123);
		System.out.println(i1 == i2);//在堆空间new出不同的地址
		System.out.println(i1.equals(i2));
		
		Integer i3 = 123;
		Integer i4 = 123;
		System.out.println(i3 == i4);//在堆缓存空间里指向同一地址。
		System.out.println(i3.equals(i4));
//		IntegerCache推空间有integer缓存值域：-128至127
		Integer i5 = 1235;
		Integer i6 = 1235;//超出推缓存空间值域范围，在堆空间重新new分配地址
		System.out.println(i5 == i6);
		System.out.println(i5.equals(i6));	
	}
}
