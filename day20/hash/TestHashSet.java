package cn.itsource.hash;

import java.util.HashSet;

public class TestHashSet {

	public static void main(String[] args) {
/*	    // hashSet不能添加重复元素（基本类型）
		HashSet hs = new HashSet()；
		hs.add(2);
		hs.add(2);//仅仅未打印这个
		hs.add('2');
		hs.add("2");
		System.out.println(hs);    */
		
//		添加自定义类型，将student（引用类型）传进来
		Student a = new Student("baibai", 18);
		Student a1 = new Student("fanqie", 2);
		Student a2 = new Student("guinv", 12);
		
		HashSet hs = new HashSet();
		hs.add(a);
		hs.add(a1);
		hs.add(a2);
		
		System.out.println(hs.size());//3
		System.out.println(hs);//3个地址
	}
/*
hashSet可以传入基本类型，引用类型，其他类型的数据，
通过object的hashCode方法和equals来进行比较，每个类型都具备了这两个方法。
hashCode---》返回int类型
equals---》返回boolean类型

如果两个对象equals相等，且，hashCode返回的值相同，就表示两个对象相等
*/
}
