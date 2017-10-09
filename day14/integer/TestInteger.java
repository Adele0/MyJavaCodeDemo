package cn.itsource.integer;

public class TestInteger {
	/*integer(int value)构造一个新分配的integer对象，表示指定int值
	  integer(String s)构造一个新分配的integer对象，表示String参数所指示的int值
	*/
	public static void main(String[] args) {
		Integer i1 = new Integer(123);
		System.out.println(i1);
		
		Integer i2 = new Integer("52");
		System.out.println(i2);
		
/*		All of them r "NumberFormatEXception"
 		**cannot recognize non number**
 		Integer i3 = new Integer("52K");
		System.out.println(i3);
		
		**String cannot do math**
		Integer i5 = new Integer("52+5");
		System.out.println(i5);
		
		**out of range**
		Integer i4 = new Integer(156892956235688899565645789623478923);
		System.out.println(i4);	*/
	}
}
