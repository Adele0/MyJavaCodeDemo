package cn.itsource.arrayList;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// 创建对象
		ArrayList aList = new ArrayList();//初始值为10的容量
		//调用方法
		aList.add("火锅");
		aList.add("冒菜");
		aList.add("干锅");
		aList.add("串串");
		aList.add("钵钵鸡");//超过10的容量，自动扩容
		System.out.println(aList);
		
//		ArrayList(int initialCapacity)明确添加多少数据时使用指定容量。可以减少扩容次数
		
//		ArrayList(Collection col)将列表整体放入列表中
		ArrayList aList2 = new ArrayList(aList);
		System.out.println(aList2);
		System.out.println(aList2.size());
	}

}
