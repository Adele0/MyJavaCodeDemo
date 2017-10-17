package cn.itsource.intArray;

public class IntArrayDemo {

	public static void main(String[] args) {
		IntArray iArray = new IntArray();
		iArray.add(18);//往iArray中添加值
		iArray.add(20);
		System.out.println(iArray.getSize());
		System.out.println(iArray);
//		如果没有覆写toString的话打印为地址@15db9742
//		简单覆写 return Arrays.toString的话，未添加数字的部分以0填充。
//		使用system.arraycopy
		
		
//		由于自定义数组中已经限制了长度，传入的参数过多就会报错
		IntArrayWithAnyLengthNType iawL = new IntArrayWithAnyLengthNType(20);//如果定义了长度20，未定义即为无参中的数
		iawL.add(18);
		iawL.add(18);
		iawL.add(18);
		iawL.add(18);
		iawL.add(17);
		iawL.add(18);
		iawL.add(18);
		iawL.add(18);
		iawL.add(18);
		iawL.add(19);
		iawL.add(18);
		System.out.println(iawL.getSize());
		System.out.println(iawL);
//		但是没有解决用户想定义多少就多少的需求，还有就是类型是固定的
		
		IntArrayWithAnyLengthNType iawalat = new IntArrayWithAnyLengthNType(5);
		iawalat.add(1);
		iawalat.add(2);
		iawalat.add(6);
		iawalat.add(8);
		iawalat.add(9);
		iawalat.add(1);
		System.out.println(iawalat);
		//设置长度为5，实际传入6，调用add时扩容。。。将int改为object，传入任意类型
		
		IntArrayWithAnyLengthNType iawalat1 = new IntArrayWithAnyLengthNType(5);
		iawalat1.add("旺旺");
		iawalat1.add("旺旺");
		iawalat1.add(33);
		iawalat1.add('是');
		iawalat1.add(true);
		iawalat1.add(100.00);
		iawalat1.add("%的瓜娃子");
		iawalat1.add("旺旺");
		iawalat1.add("旺旺");
		iawalat1.add(33);
		iawalat1.add('是');
		iawalat1.add(true);
		iawalat1.add(100.00);
		iawalat1.add("%的瓜娃子");
		System.out.println(iawalat1);
//		测试找到指定索引的值
		System.out.println(iawalat1.getElementByIndex(5));
//		测试找到指定值的索引
		System.out.println(iawalat1.getFirstIndexByElement(33));
		System.out.println(iawalat1.getFirstIndexByElement(null));
//		测试删除指索引的值
		iawalat1.deleteElementByIndex(1);//因为删除没有范围任何类型，调用即删除
		System.out.println(iawalat1);//打印删除后的数组
//		测试删除指定值第一次出现位置
		iawalat1.deleteFirstElement("%的瓜娃子");
		System.out.println(iawalat1);
	}
}
