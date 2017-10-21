package cn.itsource.treeSet;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		//TreeSet 特点：打印顺序按照比较之后（不记录添加顺序），不重复，同种类
		TreeSet ts = new TreeSet();
		ts.add("A");//编写的人并未覆写String类里的compareTo方法
		ts.add("D");//但是打印出来，还是有一定顺序规则的原因是
		ts.add("S");//String是comparable接口的实现类，已经覆写过了
		ts.add("T");
		ts.add("A");
		ts.add("B");
		
//		ts.add(66);同时有String和int类型会报错String cannot be cast2 integer
		System.out.println("基本类型以简单String为例： " + ts.size());//自动去掉重复数据
		System.out.println("基本类型以简单String为例： " +ts);//不记录添加顺序，但是打印按照一定顺序
		System.out.println("----------------------------");	
		
		
		
//		通过自定义Student类未覆写comparable接口前
/*		TreeSet ts1 = new TreeSet();
		Student s1 = new Student("牛肉",50);
		Student s2 = new Student("羊肉",20);
		Student s3 = new Student("猪肉",14);
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		System.out.println("自定义类型： " + ts.size());//
		System.out.println("自定义类型： " + ts);//
		System.out.println("----------------------------");
		
		直接用基本类型，会报错：Comparable,需要覆写comparable的子类compareTo
		cn.itsource.treeSet.Student cannot be cast to java.lang.Comparable
		
		*如果覆写compareTo，只有一句代码，return 0。。。。不管有多少个Student，size都是1   */
		
//		通过自定义Student类覆写comparable接口后
		TreeSet ts1 = new TreeSet();
		Student s1 = new Student("牛肉",50);
		Student s2 = new Student("羊肉",20);
		Student s3 = new Student("猪肉",14);
		Student s4 = new Student("鸡肉",14);
		ts1.add(s1);
		ts1.add(s2);
		ts1.add(s3);
		ts1.add(s4);
		System.out.println("自定义类实现comparable覆写compareTo： " + ts1.size());
		System.out.println("自定义类实现comparable覆写compareTo：： " + ts1);
		System.out.println("----------------------------");
	}

}
