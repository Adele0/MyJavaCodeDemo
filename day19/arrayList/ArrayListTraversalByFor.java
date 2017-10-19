package cn.itsource.arrayList;

import java.util.ArrayList;

public class ArrayListTraversalByFor {

	public static void main(String[] args) {
		int sum = 0;//定义求和
		int sum2 = 0;
		ArrayList ages = new ArrayList();
		ages.add(16);
		ages.add(17);
		ages.add(18);
		ages.add(19);
		ages.add(20);
		ages.add(26);
//		循环取出年龄相加，再求平均值 for 和 foreach（增强for）
		for (int i = 0; i < ages.size(); i++) {//通过size()来获得长度
			sum += (int)ages.get(i);//得到的是object类型，强制转化为int
		}
		System.out.println(sum/ages.size());
		
//		用增强for。 格式： for(元素类型变量：源) 源：数组，集合，iterable实例
		for (Object age : ages) {
			sum2 +=(int)age;
		}
		System.out.println(sum2/ages.size());
	}

}
